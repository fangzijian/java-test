package com.fzj.utils;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class ListTest {

    public static void main(String[] args) {

        Date date = addDay(-30);

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = f.format(date);
        System.out.println(date);

        List<String> numbers = new ArrayList<>(Arrays.asList("1", "2", "3"));
        numbers.add("4");
        System.out.println(numbers);
        numbers = numbers.stream().filter(e -> !e.equals("4")).collect(Collectors.toList());
        String collect = String.join(",", numbers);
        System.out.println(collect);

        String splitString = "test";
        String[] split = splitString.split(",");
        System.out.println(split[0]);

        String string = getString("fsdfsd（xxxxx）fsdfsf");
        System.out.println(string);
    }

    public static String getString(String gSQL) {
        String quStr = gSQL.substring(gSQL.indexOf("（") + 1, gSQL.indexOf("）"));
        return quStr;
    }

    public static Date addDay(int day) {
        // 取时间
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.add(Calendar.DATE, day);// 把日期往后增加一天.整数往后推,负数往前移动
        // 这个时间就是日期往后推一天的结果
        return calendar.getTime();
    }
}
