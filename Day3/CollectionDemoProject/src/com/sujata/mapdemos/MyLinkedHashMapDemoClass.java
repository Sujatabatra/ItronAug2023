package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyLinkedHashMapDemoClass {
    public static void main(String args[]){
        /*
        LinkedHashMap : is the ordered collection of key value pair,
        where keys are unique and value can be duplicated,
        and ordering wrt keys
         */
        Map<String,Integer> months= new LinkedHashMap<>();
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
