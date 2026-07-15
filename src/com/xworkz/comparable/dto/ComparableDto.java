package com.xworkz.comparable.dto;

import com.xworkz.comparable.constant.Gender;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@ToString

public class ComparableDto implements Comparable<ComparableDto>{
    private int patient_id;
    private String patient_name;
    private int patient_age;
    private String patient_address;
    private Gender patient_gender;
    private String patient_contact;

    @Override
    public int compareTo(ComparableDto o) {
        return this.patient_id - o.patient_id;

    }
}
