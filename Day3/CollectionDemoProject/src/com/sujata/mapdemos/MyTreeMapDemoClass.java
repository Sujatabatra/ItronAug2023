package com.sujata.mapdemos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyTreeMapDemoClass {
    public static void main(String args[]){
        /*
        TreeMap : is the sorted collection of key value pair,
        where keys are unique and value can be duplicated,
        and sorting wrt keys
         */
        Map<String,Integer> months= new TreeMap<>();
        System.out.println("Size of Collection :"+months.size());
        months.put("Jan",31);
        months.put("Feb",28);
        months.put("Mar",31);
        months.put("Apr",30);
        System.out.println("Size of Collection :"+months.size());
        System.out.println(months);

        months.put("Feb",29);
        System.out.println("Size of Collection :"+months.size());
        System.out.println(months);

        months.remove("Apr");
        System.out.println("Size of Collection :"+months.size());
        System.out.println(months);

        Set<String> monthsName=months.keySet();

        for(String monthName:monthsName){
            System.out.println(monthName+" have "+months.get(monthName)+" days");
        }

    }
}
