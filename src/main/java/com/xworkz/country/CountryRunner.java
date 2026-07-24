package com.xworkz.country;

import java.util.ArrayList;
import java.util.List;



public class CountryRunner {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("India");
        list.add("New York");
        list.add("Russia");
        list.add("Japan");
        list.add("Nepal");
        list.add("Sri Lankaa");
        list.add("Mexico");
        list.add("Thailand");
        list.add("Zimbambe");
        list.add("Irak");

        System.out.println("--Print all the countries--");
        list.stream().forEach(System.out::println);


        System.out.println();
        System.out.println("--Filter all Countries starting with I --");
        list.stream().filter(rs->rs.startsWith("I")).forEach(System.out::println);


        System.out.println();
        System.out.println("--Filter all Countries with two or more words --");
        list.stream().filter(res->res.contains(" ")).forEach(System.out::println);


        System.out.println();
        System.out.println("--Filter all Countries where length is greater than 10--");
        list.stream().filter(rs->rs.length()>=10).forEach(System.out::println);


        System.out.println();
        System.out.println("--Filter all Countries where length is lesser than equal 5--");
        list.stream().filter(rs->rs.length()<=5).forEach(System.out::println);


        System.out.println();
        System.out.println("-- Contains 'a'--");
        list.stream().filter(rs->rs.contains("a")).forEach(System.out::println);




    }
}
