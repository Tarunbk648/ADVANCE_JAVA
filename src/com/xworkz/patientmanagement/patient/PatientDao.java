package com.xworkz.patientmanagement.patient;

import com.xworkz.patientmanagement.patientdto.PatientDto;

import java.util.List;

public interface PatientDao {
    boolean addPatientDetails(PatientDto patientData);

    int getPatientIdByPatientName(String name);


    void getPatientsByAge(int age);

    void  getAllPatients();




}
;