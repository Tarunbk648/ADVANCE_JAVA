package com.xworkz.comparable.comparator;

import com.xworkz.comparable.dto.ComparableDto;

import java.util.Comparator;

public class PatientNameComparator implements Comparator<ComparableDto> {   //In order to pass two object
    @Override
    public int compare(ComparableDto o1, ComparableDto o2) {
       return o1.getPatient_name().compareTo(o2.getPatient_name());
    }

}
