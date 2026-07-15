package com.xworkz.comparable.comparator;

import com.xworkz.comparable.dto.ComparableDto;

import java.util.Comparator;

public class PatientContactComparator implements Comparator<ComparableDto> {
    @Override
    public int compare(ComparableDto o1, ComparableDto o2) {
        return o1.getPatient_contact().compareTo(o2.getPatient_contact());
    }
}
