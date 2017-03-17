package com.qianlaofei.date;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chamz on 2017-03-17.
 */
public class FormatTest {

    @Test
    public void client() throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //Date -> String
        Date date = new Date(System.currentTimeMillis());
        System.out.println(format.format(date));

        //String -> Date
        String timeString = "2017-03-17 22:02:01";
        Date newDate = format.parse(timeString);
        System.out.println(newDate);
        DateFormat dateFormat = DateFormat.getTimeInstance();
        System.out.println(dateFormat.getClass().getName());
    }
}
