package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Sunday");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        System.out.println(list);

        System.out.println();
        System.out.println("---Add by index----");
        list.add(1,"Januvary");
        System.out.println(list);

        System.out.println();
        System.out.println("----Contain Method----");
        System.out.println(list.contains("Monday"));

        System.out.println();
        System.out.println("----get method-----");
        System.out.println(list.get(3));

        System.out.println();
        System.out.println("---Add First Method---");
        list.addFirst("WEEKS");

        System.out.println();
        System.out.println("---Add Last Method---");
        list.addLast("WEEK END");

        System.out.println();
        System.out.println("---Get first method");
        System.out.println(list.getFirst());

        System.out.println();
        System.out.println("----Get last method---");
        System.out.println(list.getLast());

        System.out.println();
        System.out.println("After all methods");
        System.out.println(list);

    }
}
