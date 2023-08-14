package com.sujata.demo;

import java.util.Arrays;
import java.util.List;

public class FourthDemoClass {
    public static void main(String args[]){
        List<Integer> list= Arrays.asList(110,22,303,44,55,22,18);

        list.stream()
                .distinct()
                .sorted()
                .limit(3)
                .forEach(ele->System.out.println(ele));

    }
}
