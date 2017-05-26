package com.xyz.util;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by admin on 19.05.2017.
 */
public class DateUtilTest {
    @Test
    public void testGetToday() {
        String actual = DateUtil.getToday();
        String expected = new SimpleDateFormat("dd-MMM-yyyy")
                .format(new Date());
        assertEquals(expected, actual);
    }
}
