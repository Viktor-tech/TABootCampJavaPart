package com.bootcampexcercise.module8.activity;

//Needs to be completed

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class ListActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
    List nameList = new ArrayList<>();

        nameList.add("Jane");
        nameList.add("Dave");
        nameList.add("George");
        nameList.add("Tom");
        nameList.add("Mike");




        //TODO: 2 - Call print method to print the list passed as its parameter.
        ListActivity myList = new ListActivity();
       myList.print(nameList);

    }

    void print(List myList)
    {
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
        System.out.println(myList);
        Iterator<Object> nameOfIterator = myList.iterator();
        System.out.println("*** Work of iterator ***");
        while (nameOfIterator.hasNext()) {
            System.out.println(nameOfIterator.next());
        }


    }
}
