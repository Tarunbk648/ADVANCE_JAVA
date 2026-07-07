package com.xworkz.patientmanagement.patientdto;

import com.xworkz.patientmanagement.constants.Gender;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PatientDto {

    private int patientId;
    private String patientName;
    private String patientLocation;
    private Gender gender;
    private int age;
}
