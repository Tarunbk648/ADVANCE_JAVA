package com.xworkz.collection;

import java.util.Collection;
import java.util.Vector;

public class VectorRunner {
    public static void main(String[] args) {
        Collection vector= new Vector();
        vector.add(1);
        vector.add("Sunday");
        vector.add(true);
        vector.add(2.5);
        vector.add('S');
        vector.add(2);

        vector.add("Monday");
        vector.add(false);
        vector.add(3.5);
        vector.add('F');
        vector.add(3);

        vector.add("Tuesday");
        vector.add(true);
        vector.add(4.5);
        vector.add('M');

        vector.add("Tuesday");
        vector.add(true);
        vector.add(4.5);
        vector.add('M');

        vector.add("Tuesday");
        vector.add(true);
        vector.add(4.5);
        vector.add('M');
        System.out.println(vector);
    }
}
