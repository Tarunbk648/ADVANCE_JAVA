package com.xworkz.patientmanagement.exception;

public class PatientDataNotFoundException extends RuntimeException {
    public PatientDataNotFoundException(){
        System.out.println("Patient not found!!!---> data not valid ");
    }
}
