package com.xworkz.collection.customType;

import com.xworkz.collection.constants.PatientEnum;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor@ToString
@AllArgsConstructor
public class PatientCustom {
    private int patient_id;
     private String patient_name;
     private String patient_address;
     private String patient_contact;
     private String patient_email;
     private String patient_password;
     private PatientEnum patientEnum;
}
