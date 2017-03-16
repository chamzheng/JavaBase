package com.qianlaofei.date;

import org.junit.Test;

import java.util.Date;

/**
 * Created by chamz on 2017-03-16.
 */
public class DateTest {
    @Test
    public void test() {
        Date dateBefore = new Date();
        Date dateAfter = new Date(System.currentTimeMillis() + 1);

        System.out.println("before: " + dateBefore.getTime());
        System.out.println("after: " + dateAfter.getTime());
        System.out.println(dateBefore.before(dateAfter));
        System.out.println(dateAfter.after(dateBefore));

        dateBefore.setTime(System.currentTimeMillis());
        System.out.println(dateBefore.getTime());
        System.out.println(dateBefore.before(dateAfter));
    }
}
