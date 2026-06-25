package com.xworkz.collection;

import java.sql.SQLOutput;
import java.util.*;

import static com.sun.deploy.net.UpdateTracker.clear;

public class CollectionRunner {
    public static void main(String[] args) {
        Collection ref=new ArrayList();
        System.out.println(ref);
        ref.add("Sunday");
        ref.add("Monday");
        ref.add("Tuesday");
        ref.add("Wednesday");
        ref.add("Friday");
        ref.add("Saturday");
        System.out.println(ref);

        System.out.println("---Check the size--");
        System.out.println(ref.size());

        System.out.println("---isEmpty() method---");
        System.out.println(ref.isEmpty());

        System.out.println("----Contain method----");
        System.out.println(ref.contains("Friday"));

        Collection ref2=new ArrayList();
        ref2.add("January");
        ref2.add("February");
        ref2.add("March");
        System.out.println(ref2);

        System.out.println("----AddAll Method-----");
        System.out.println(ref.addAll(ref2));
        System.out.println(ref);
        System.out.println(ref2);

        System.out.println("--RemoveAll Method-----");
        System.out.println(ref.removeAll(ref2));   //removing all the ref2 data from ref
        System.out.println(ref);
        System.out.println(ref2);


        System.out.println("---Remove Method---");
        System.out.println(ref.remove("Sunday"));

//        System.out.println("---clear--");
//        ref2.clear();

        System.out.println();
        System.out.println("----Contains All----");
        boolean re= ref.containsAll(ref2); //The containsAll() method in Java checks whether one collection contains every element of another collection.  please check removeAll method from above
        System.out.println(re);
        System.out.println(ref2);
        System.out.println(ref);   //ref does not contains ref2 elements so does not print the ref2 data on the ref


        System.out.println();
        System.out.println(ref.addAll(ref2));
        System.out.println(ref);

        System.out.println();
        System.out.println(ref.containsAll(ref2));  //after addAll method to the ref then it prints true


        //clear() and removeAll method are same but we pass a parameter inside a removeAll method

    }
}

