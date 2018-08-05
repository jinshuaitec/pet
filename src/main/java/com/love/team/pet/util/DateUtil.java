package com.love.team.pet.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil {

    /** 默认日期格式 */
    public static final String DATE_FORMAT_DEFAULT = "yyyy-MM-dd";
    /** 默认日期时间格式 */
    public static final String DATETIME_FORMAT_DEFAULT = "yyyy-MM-dd HH:mm:ss";
	
	public final static String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    /**
     * @author zhangzhi
     */
    public static String getDateSequence() {
        return formatDate(new Date(),YYYYMMDDHHMMSS);
    }

	/**
	 * @author zhangzhi
	 * @return
	 */
	public static long getCurrentTime() {
		return System.currentTimeMillis();
	}
	
	
    /**
     * 获取某天最大时间
     * @param date
     * @return
     */
    public static Date getEndOfDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());;
        LocalDateTime endOfDay = localDateTime.with(LocalTime.MAX);
        return Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 获取某天最小时间
     * @param date
     * @return
     */
    public static Date getStartOfDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
        return Date.from(startOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 格式化日期
     * @param time 日期
     * @param format 格式
     * @return 日期字符串
     */
    public static String formatDate(long time, String format) {
        return formatDate(new Date(time));
    }

    /**
     * 格式化日期
     * @param date 日期时间
     * @return 默认格式日期字符串
     */
    public static String formatDate(Date date) {
        return formatDate(date,DATE_FORMAT_DEFAULT);
    }

    /**
     * 格式化日期
     * @param date 日期时间
     * @param format 日期格式
     * @return 日期字符串
     */
    public static String formatDate(Date date, String format) {
        if (date == null){
            return "";
        }
        SimpleDateFormat outFormat = new SimpleDateFormat(format);
        return outFormat.format(date);
    }

    /**
     * 格式化日期时间
     * @param date 日期时间
     * @return 默认格式的日期时间字符串
     */
    public static String formatDateTime(Date date) {
        return formatDate(date,DATETIME_FORMAT_DEFAULT);
    }

    /**
     * 字符串转日期
     * @param dt 日期字符串
     * @param format 日期格式
     * @return 日期
     */
    public static Date str2Date(String dt, String format) {
        SimpleDateFormat df = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = df.parse(dt);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 在当前时间减n天
     * @param n
     * @return
     */
    public static String minusDay(int n){
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(n);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATETIME_FORMAT_DEFAULT);
        return localDateTime.format(dateTimeFormatter);

    }
}
