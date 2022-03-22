package com.fzj.utils;

import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) {

        String properties = "spark.dynamicAllocation.enabled";
        String substring = properties.substring(properties.length() - 2) + "|" + properties;
        String test = String.join("a", "|", "b");
        boolean spark = properties.startsWith("spark");
        System.out.println(substring);

        long time = "jlk;joijlkj".hashCode();
        long time2 = 123456789L;
        long l = time2 % 100000 / 1000;
        System.out.println(l);

        String xxxxxxx = "80200#李";
        Arrays.stream(xxxxxxx.split(",")).forEach(e -> {
            String[] split = e.split("#");
            System.out.println(split[0]);
        });


        String a = "x,x,x,,,,,";
        String[] split = a.split("[,]", -1);
        System.out.println(split[6]);

        List<String> imeis = new ArrayList<>();
        imeis.add("111111");
        imeis.add("22222");
        imeis.add("333");
        imeis.add("4444");
        Iterator<String> iterator = imeis.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println(iterator);

    }
}
