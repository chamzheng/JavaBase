package com.qianlaofei.annotation;

import com.qianlaofei.annotation.Testable;
import com.qianlaofei.annotation.TestableException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by chamz on 2017-03-15.
 */
public class TestCase2 {

    public void test1() {
        System.out.println("test1");
    }

    @TestableException(ArithmeticException.class)
    public void test2() throws IOException {
        int i = 1 / 0;
        System.out.println(i);
    }

    @TestableException(ArithmeticException.class)
    public void test3() {
        System.out.println("test3");
        throw new RuntimeException("我test3出错啦...");
    }

    public void test4() {
        System.out.println("test4");
    }

    @TestableException({ArithmeticException.class, IOException.class})
    public void test5() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream("xxx");
    }

    @Testable
    public void test6() {
        System.out.println("test6");
    }
}
