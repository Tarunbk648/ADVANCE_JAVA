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

        System.out.println();
        System.out.println(ref.retainAll(ref2));  //copying ref2 data to the ref
        System.out.println(ref);
        System.out.println(ref2);
        //clear() and removeAll method are same but we pass a parameter inside a removeAll method

        
        System.out.println();
        System.out.println("----Treeset---->Sorted Order----->Doesn't allow duplicate values");
        Collection treeset=new TreeSet();
        treeset.add("Sunday");
        treeset.add("Monday");
        treeset.add("Tuesday");
        treeset.add("Wednesday");
        treeset.add("Thursday");
        treeset.add("Friday");
        treeset.add("Saturday");
        treeset.add("Sunday");
        treeset.add("Monday");
        System.out.println(treeset);


        System.out.println();
        System.out.println("----Hashset---->Unsorted Order----->Doesn't allow duplicate values");
        Collection hashSet=new HashSet();
        hashSet.add("Sunday");
        hashSet.add("Monday");
        hashSet.add("Tuesday");
        hashSet.add("Wednesday");
        hashSet.add("Thursday");
        hashSet.add("Friday");
        hashSet.add("Saturday");
        hashSet.add("Sunday");
        hashSet.add("Monday");
        System.out.println(hashSet);


        System.out.println();
        System.out.println("----LinkedHashSet---->Same order----->Doesn't allow duplicate values");
        Collection linkedHashSet=new LinkedHashSet();
        linkedHashSet.add("Sunday");
        linkedHashSet.add("Monday");
        linkedHashSet.add("Tuesday");
        linkedHashSet.add("Wednesday");
        linkedHashSet.add("Thursday");
        linkedHashSet.add("Friday");
        linkedHashSet.add("Saturday");
        linkedHashSet.add("Sunday");
        linkedHashSet.add("Monday");
        System.out.println(linkedHashSet);

        System.out.println();
        System.out.println("----ArrayList---->Same order----->Allow duplicate values");
        Collection arrayList=new ArrayList();
        arrayList.add("Sunday");
        arrayList.add("Monday");
        arrayList.add("Tuesday");
        arrayList.add("Wednesday");
        arrayList.add("Thursday");
        arrayList.add("Friday");
        arrayList.add("Saturday");
        arrayList.add("Sunday");
        arrayList.add("Monday");
        System.out.println(arrayList);


        System.out.println();
        System.out.println("----LinkedList---->Same order----->Allow duplicate values");
        Collection linkedList=new LinkedList();
        linkedList.add("Sunday");
        linkedList.add("Monday");
        linkedList.add("Tuesday");
        linkedList.add("Wednesday");
        linkedList.add("Thursday");
        linkedList.add("Friday");
        linkedList.add("Saturday");
        linkedList.add("Sunday");
        linkedList.add("Monday");
        System.out.println(linkedList);

        // Hashset---->  Unsorted order ---> Doesn't allow duplicate values.
        // Treeset----->  Sorted order-----> Doesn't allow duplicate values.
        // LinkedHashset----> Same order-----> Doesn't allow duplicate values. 

        // ArrayList----> Same order----> Allow Duplicate values.
        // LinkedList----> Same order ----> Allow Duplicate values.
            
        

    }
}

