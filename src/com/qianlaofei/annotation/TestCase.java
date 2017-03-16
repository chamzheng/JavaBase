package com.qianlaofei.annotation;

import com.qianlaofei.annotation.Testable;

import java.io.IOException;

/**
 * Created by chamz on 2017-03-14.
 */
public class TestCase {

    @Testable
    public void test1(){
        System.out.println("test1");
    }

    public void test2() throws IOException {
        System.out.println("test2");
        throw new IOException("我test2出错了啦...");
    }

    @Testable
    public void test3() {
        System.out.println("test3");
        throw new RuntimeException("我test3出错啦...");
    }

    public void test4() {
        System.out.println("test4");
    }

    @Testable
    public void test5() {
        System.out.println("test5");
    }

    @Testable
    public void test6() {
        System.out.println("test6");
    }
}
