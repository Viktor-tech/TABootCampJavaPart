package com.bootcampexcercise.module8.activity;

//Needs to be completed

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapActivity {

    public static void main(String[] args) {

        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name
        Map hashMap = new HashMap();
        hashMap.put("1", "Jane");
        hashMap.put("2", "Dave");
        hashMap.put("3", "George");
        hashMap.put("4", "Tom");
        hashMap.put("5", "Mike");

        //2 - Call print method to print the map passed as its parameter.
        MapActivity hashMapObj = new MapActivity();
        hashMapObj.print(hashMap);

    }

    void print(Map map) {
        //3 - Type code to print this map
        Set keySet = map.keySet();
        System.out.println("Key\tValue");
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + "\t" + map.get(key));
        }
    }
}