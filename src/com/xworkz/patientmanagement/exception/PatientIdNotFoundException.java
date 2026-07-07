package com.xworkz.patientmanagement.exception;

public class PatientIdNotFoundException extends RuntimeException {
    public PatientIdNotFoundException(){
        System.out.println("Patient Id Not found!!!!!");
    }
}
