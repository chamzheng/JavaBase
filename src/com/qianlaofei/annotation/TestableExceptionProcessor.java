package com.qianlaofei.annotation;

import com.qianlaofei.annotation.TestableException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by chamz on 2017-03-15.
 */
public class TestableExceptionProcessor {
    public static void process(String clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        int passed = 0;
        int failed = 0;
        Object object = Class.forName(clazz).newInstance();
        for (Method method : Class.forName(clazz).getMethods()) {
            if (method.isAnnotationPresent(TestableException.class)) {
                try {
                    method.invoke(object, null);
                    //没有抛出异常（失败）
                    ++failed;
                } catch (InvocationTargetException e) {
                    //获取异常的引发原因
                    Throwable cause = e.getCause();

                    int oldPassed = passed;
                    for (Class excTyep : method.getAnnotation(TestableException.class).value()) {
                        //是我们期望的异常类型之一（成功）
                        if (excTyep.isInstance(cause)) {
                            ++passed;
                            break;
                        }
                    }
                    //并不是我们期望的异常类型(失败)
                    if (oldPassed == passed) {
                        ++failed;
                        System.out.printf("Test <%s> failed <%s> %n", method, e);
                    }
                }
            }
        }
        System.out.println("共运行" + (failed + passed) + "个方法，成功" + passed + "个，失败" + failed + "个");
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        process("com.qianlaofei.annotation.TestCase2");
    }
}
