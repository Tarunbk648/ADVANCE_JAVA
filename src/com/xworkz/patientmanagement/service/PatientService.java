package com.xworkz.patientmanagement.service;

import com.xworkz.patientmanagement.exception.PatientDataNotFoundException;
import com.xworkz.patientmanagement.patient.PatientDao;
import com.xworkz.patientmanagement.patientdto.PatientDto;
import com.xworkz.patientmanagement.patient.validatorimpl.PatientValidatorDaoimpl;

import java.util.List;

public class PatientService  {
    PatientDao patientDao;

    public PatientService(){
        patientDao = new PatientValidatorDaoimpl();
    }

    public boolean validateAndAdddata(PatientDto patientData) {
        boolean isDataValidated = false;
        try {
            if (patientData != null && patientData.getPatientId() >= 0 && patientData.getPatientName() != null && patientData.getPatientLocation() != null && patientData.getGender() != null) {
                return patientDao.addPatientDetails(patientData);
            }
            isDataValidated=true;
            if (isDataValidated == false) {
                throw new PatientDataNotFoundException();

            }
        } catch (PatientDataNotFoundException e) {
            e.printStackTrace();
        }

            return false;
        }




    public int getPatientIdByPatientName(String name) {
        if (name != null && !name.isEmpty()) {
            return patientDao.getPatientIdByPatientName(name);
        }
        return 0;
    }

    public void getPatientsByAge(int age) {
        patientDao.getPatientsByAge(age);
    }
    public void getAllPatients() {
        patientDao.getAllPatients();
    }

    }
