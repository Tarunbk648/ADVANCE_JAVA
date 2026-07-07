package com.xworkz.patientmanagement.patient.validatorimpl;

import com.xworkz.patientmanagement.constants.Gender;
import com.xworkz.patientmanagement.patient.PatientDao;
import com.xworkz.patientmanagement.patientdto.PatientDto;

import java.util.ArrayList;
import java.util.List;


public class PatientValidatorDaoimpl implements PatientDao {
    public List<PatientDto> patients = new ArrayList<>();


    @Override
    public boolean addPatientDetails(PatientDto patientData){
         boolean isPatientDataAdded=false;
         boolean isPatientIdValid=false;
         boolean isPatientNameValid=false;
         boolean isPatientLocationValid=false;
         boolean isPatientGenderValid=false;
         boolean isPatientAgeValid=false;

         int id= patientData.getPatientId();
         if(id>0){
           isPatientIdValid=true;
         }
         String name= patientData.getPatientName();
         if(name!=null && !name.isEmpty()){
             isPatientNameValid=true;
         }
         String location= patientData.getPatientLocation();
         if(location!=null && !location.isEmpty()){
             isPatientLocationValid=true;
         }
        Gender gender=patientData.getGender();
         if(gender!=null){
             isPatientGenderValid=true;
         }

         int age=patientData.getAge();
         if(age>18){
             isPatientAgeValid=true;
         }
         if(isPatientIdValid && isPatientNameValid && isPatientLocationValid && isPatientGenderValid && isPatientAgeValid){
            patients.add(patientData);
             isPatientDataAdded=true;
         }
        return isPatientDataAdded;
    }


    @Override
    public int  getPatientIdByPatientName(String name) {
        int id = 0;
        for (PatientDto patientData : patients) {
            if (name.equalsIgnoreCase(patientData.getPatientName())) {
                id = patientData.getPatientId();
                System.out.println("Id by name:" + id);
                break;
            }
        }
        if (id == 0) {
            System.out.println("No patient found with name: " + name);
        }
        return id;
    }



    @Override
    public void getPatientsByAge(int age) {
       List<PatientDto> patientDataList =new ArrayList<>();
       for ( PatientDto patientData: patients){
           if(age == patientData.getAge()){
               patientDataList.add(patientData);
               System.out.println("Patient by age:" + patientData);
           }
           else {
               System.out.println("Invalid  age:" + age);
           }
       }
    }

    @Override
    public void getAllPatients() {
        for(PatientDto patientData:patients){
            System.out.println(patientData);
        }
    }


}
