package com.xyz.util;

import org.apache.commons.lang.time.DateFormatUtils;

import java.util.Date;

/**
 * Created by admin on 19.05.2017.
 */
public class DateUtil {public static String getToday() {
    String today = DateFormatUtils.format(new Date(), "dd-MMM-yyyy");
    return today;
}
}