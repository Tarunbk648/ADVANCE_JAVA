package com.xworkz.comparable;

import com.xworkz.comparable.comparator.*;
import com.xworkz.comparable.constant.Gender;
import com.xworkz.comparable.dto.ComparableDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ComparableDto comparableDto1= new ComparableDto(1, "Ravi", 23, "Bengalore", Gender.MALE, "9876543210");
        ComparableDto comparableDto2= new ComparableDto(2, "Eshwar", 24, "Manglore", Gender.MALE, "9876578210");
        ComparableDto comparableDto3= new ComparableDto(3, "Arya", 25, "Hubli", Gender.FEMALE,"9945344239");
        ComparableDto comparableDto4= new ComparableDto(4, "Suresh", 26, "Bengalore", Gender.MALE,"9482422604");
        ComparableDto comparableDto5= new ComparableDto(5, "Thanmay", 27, "Dharwad", Gender.FEMALE,"9852453232");

        List list = new ArrayList<>();
        list.add(comparableDto1);
        list.add(comparableDto2);
        list.add(comparableDto3);
        list.add(comparableDto4);
        list.add(comparableDto5);

        System.out.println("Before Sorting");
        for(Object list1:list){
            System.out.println(list1);
        }

        System.out.println();
        System.out.println("Sorting By Patient Id");
        Collections.sort(list);    //Based on patient_Id they sort
        for(Object list1:list){
            System.out.println(list1);
        }

        System.out.println();
        System.out.println("Sorting By Patient Name");
        Collections.sort(list, new PatientNameComparator());
        for(Object list1:list){
            System.out.println(list1);
        }

        System.out.println();
        System.out.println("Sorting By Patient Age");
        Collections.sort(list, new PatientAgeComparator());
        for(Object list1:list){
            System.out.println(list1);
        }

        System.out.println();
        System.out.println("Sorting By Patient Address");
        Collections.sort(list, new PatientAddressComparator());
        for(Object list1:list){
            System.out.println(list1);
        }

        System.out.println();
        System.out.println("Sorting By Patient Gender");
        Collections.sort(list, new PatientGenderComparator());
        for(Object list1:list){
            System.out.println(list1);
        }

        System.out.println();
        System.out.println("Sorting By Patient Contact");
        Collections.sort(list, new PatientContactComparator());
        for(Object list1:list){
            System.out.println(list1);
        }
    }
}
