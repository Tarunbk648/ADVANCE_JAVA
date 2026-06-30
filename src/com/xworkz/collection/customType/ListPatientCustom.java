package com.xworkz.collection;

import java.util.List;
import java.util.ArrayList;

public class ListPatientCustom {
    public static void main(String[] args) {
        PatientCustom patientCustom=new PatientCustom(3, "Tarun", "Mudigere", "9731036881","tarun@gmail.com","tbk@990");
        PatientCustom patientCustom1=new PatientCustom(2, "Varun", "Banakal", "9945344239","varun@gmail.com","vbk@990");
        PatientCustom patientCustom2=new PatientCustom(1, "Arun", "Dandeli", "9482422604","Arun@gmail.com","aru@990");

        List<PatientCustom> patientCustoms=new ArrayList();
        patientCustoms.add(patientCustom);
        patientCustoms.add(patientCustom1);
        patientCustoms.add(patientCustom2);

        for(PatientCustom pt: patientCustoms){
            System.out.println(pt);
        }

        //System.out.println(patientCustoms);



    }
}
