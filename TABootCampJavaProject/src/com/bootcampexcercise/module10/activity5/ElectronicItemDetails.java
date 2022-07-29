package com.bootcampexcercise.module10.activity5;

import java.util.*;

public class ElectronicItemDetails {
    public static void main(String[] args) {

        Map<String, Double> myHashMap = new HashMap();
        myHashMap.put("TV", 55.55);
        myHashMap.put("Refrigerator", 616.65);
        myHashMap.put("Washing Machine", 199.99);
        myHashMap.put("Laptop", 1500.0);

        ElectronicItemDetails item = new ElectronicItemDetails();
        System.out.println("The price of the TV is " + item.returnPriceOfItem(myHashMap, "TV"));
    }

    public double returnPriceOfItem(Map<String, Double> map, String name) {
        return map.get(name);
    }
}