package com.xworkz.collection;

import java.util.*;

public class CollectionRunner {
    public static void main(String[] args) {

        Stand stand= new Stand();
        stand.setStand_Id(123);
        stand.setBrand_name("Graph");

        Object[] obj= new Object[5];
        obj[0]=1;
        obj[1]="Tarun";
        obj[2]=false;
        obj[3]='T';
        obj[4]=stand;


        for(Object ref:obj){
            System.out.println(ref);
        }

        System.out.println();
        System.out.println("----Adding a data using a Arraylist impl------");
        Collection collection=new ArrayList();
        collection.add(1);
        collection.add("Tarun");
        collection.add(true);
        collection.add('U');
        System.out.println(collection);


        System.out.println();
        System.out.println("---Adding a data using HashSet impl----");
        Collection collection1=new HashSet();   //remove duplicates and unsorted order
        collection1.add(1);
        collection1.add("Varun");
        collection1.add(1);
        collection1.add(false);
        System.out.println(collection1);


        System.out.println();
        System.out.println("---Adding a data using Treeset impl---");
        Collection collection2=new TreeSet();   //Allows only same data item follows the first add values otherwise ClassCastexception occurs
        collection2.add(1);
        collection2.add(2);
        System.out.println(collection2);


        System.out.println();
        System.out.println("----Adding a data using LinkedList impl----");
        Collection collection3=new LinkedList();
        collection3.add(1);
        collection3.add("Tarun");
        collection3.add(2);
        collection3.add(3);
        System.out.println(collection3);

        System.out.println();
        System.out.println("----Adding a country using ArrayList---");
        Collection collection4=new ArrayList();
        collection4.add("India");
        collection4.add("United States");
        collection4.add("Canada");
        collection4.add("United Kingdom");
        collection4.add("Australia");
        collection4.add("Germany");
        collection4.add("France");
        collection4.add("Italy");
        collection4.add("Spain");
        collection4.add("Japan");
        collection4.add("China");
        collection4.add("Russia");
        collection4.add("Brazil");
        collection4.add("Mexico");
        collection4.add("South Africa");
        collection4.add("Argentina");
        collection4.add("Saudi Arabia");
        collection4.add("United Arab Emirates");
        collection4.add("Singapore");
        collection4.add("Malaysia");
        collection4.add("Thailand");
        collection4.add("Indonesia");
        collection4.add("South Korea");
        collection4.add("Pakistan");
        collection4.add("Bangladesh");
        collection4.add("Sri Lanka");
        collection4.add("Nepal");
        collection4.add("Bhutan");
        collection4.add("Afghanistan");
        collection4.add("New Zealand");
        System.out.println(collection4);
        }
    }

