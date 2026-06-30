package com.xworkz.collection.customType;

import com.xworkz.collection.constants.PatientEnum;

import java.util.List;
import java.util.ArrayList;

public class ListPatientCustom {
    public static void main(String[] args) {
        PatientCustom patientCustom=new PatientCustom(3, "Tarun", "Mudigere", "9731036881","tarun@gmail.com","tbk@990", PatientEnum.Male);
        PatientCustom patientCustom1=new PatientCustom(2, "Varun", "Banakal", "9945344239","varun@gmail.com","vbk@990",PatientEnum.Female);
        PatientCustom patientCustom2=new PatientCustom(1, "Arun", "Dandeli", "9482422604","Arun@gmail.com","aru@990",PatientEnum.Female);
        PatientCustom patientCustom3=new PatientCustom(4, "Amruth", "Hubli", "9380684484","Ammu@gmail.com","amu@990",PatientEnum.Male);
        PatientCustom patientCustom4=new PatientCustom(5, "Yogesh", "Haveri", "9482502259","yogesh@gmail.com","yogi@990",PatientEnum.Male);

        List<PatientCustom> patientCustoms=new ArrayList();
        patientCustoms.add(patientCustom);
        patientCustoms.add(patientCustom1);
        patientCustoms.add(patientCustom2);
        patientCustoms.add(patientCustom3);
        patientCustoms.add(patientCustom4);

        for(PatientCustom pt: patientCustoms){
            System.out.println(pt);
        }

        //System.out.println(patientCustoms);



    }
}
