package com.bootcampexcercise.module8.activity;

//Needs to be completed

import java.util.HashSet;
import java.util.Set;


public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        //Also try adding a few duplicate entries to this set.
        HashSet nameSet = new HashSet();


        nameSet.add("Jane");
        nameSet.add("Jane");
        nameSet.add("Dave");
        nameSet.add("George");
        nameSet.add("Tom");
        nameSet.add("Tom");
        nameSet.add("Mike");



        //TODO: 2 - Call print method to print the set passed as its parameter.
        SetActivity myList = new SetActivity();
        myList.print(nameSet);

        }

    void print(Set set) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.
        for(Object setNames : set){
            System.out.println(setNames.toString());
        }
    }

}