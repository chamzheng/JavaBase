package com.qianlaofei.date;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by chamz on 2017-03-17.
 */
public class CalendarTest {

    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        Date date = calendar.getTime();
//      Calendar newCalendar = Calendar.getInstance();
//      newCalendar.setTime(date);

        calendar.add(Calendar.DATE,-90);//会发生进位
        calendar.roll(Calendar.DATE,-90);//不会进位

        System.out.println(calendar.getTime());
//        System.out.println(date);
    }

    @Test
    public void test1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2011, Calendar.JULY, 31);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        System.out.println(calendar.get(Calendar.MONTH) + 1 + "月" + calendar.get(Calendar.DATE) + "日");
        calendar.set(Calendar.DATE, 5);
        System.out.println(calendar.get(Calendar.MONTH) + 1 + "月" + calendar.get(Calendar.DATE) + "日");

    }
}
