package com.xworkz.comparable.comparator;

import com.xworkz.comparable.dto.ComparableDto;

import java.util.Comparator;

public class PatientAgeComparator implements Comparator<ComparableDto> {
    @Override
    public int compare(ComparableDto o1, ComparableDto o2) {
        return o1.getPatient_age() - o2.getPatient_age();  //For Integer we can compare using - operator we can also compare in a Dto class using a CompareTo method implemets by Comparable interface
    }
}
