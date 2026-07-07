package com.xworkz.patientmanagement;

import com.xworkz.patientmanagement.constants.Gender;
import com.xworkz.patientmanagement.patientdto.PatientDto;
import com.xworkz.patientmanagement.service.PatientService;

import java.util.Scanner;

public class PatientRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of PatientDao to be added:");
        int size = sc.nextInt();
        PatientService patientService = new PatientService();

        for (int i = 0; i < size; i++) {

            PatientDto patientdata = new PatientDto();
            int id = 0;
            while (id <= 0) {
                try {
                    System.out.println("Enter the patient id:");
                    id = sc.nextInt();
                    sc.nextLine();
                    if (id <= 0) {
                        System.out.println("The Id must be greater then 0");
                    } else {
                        patientdata.setPatientId(id);
                    }
                } catch (Exception e) {
                    System.out.println("Enter a valid id");
                    sc.nextLine();

                }
            }


            String name = null;
            while (name == null || !name.matches("[a-zA-Z ]+")) {   //true || false=true
                try {
                    System.out.println("Enter the patient Name:");
                    name = sc.nextLine();
                    if(!name.matches("[a-zA-Z ]+")){
                        System.out.println("Name should be alphabet only!!");
                    }
                    else {
                        patientdata.setPatientName(name);
                    }
                } catch (Exception e) {
                    System.out.println("Enter a Valid name ");
                }
            }


                String location= null;
                while(location==null || !location.matches("[a-zA-Z ]+")) {
                    try {
                        System.out.println("Enter the patient Location:");
                        location = sc.nextLine();
                        if(!location.matches("[a-zA-Z ]+")){
                            System.out.println("Enter a Valid Location");
                        }
                        else {
                            patientdata.setPatientLocation(location);
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid");
                    }
                }


                Gender genderValue = null;
                while (genderValue == null) {
                    try {
                        System.out.println("Enter the patient Gender:");
                        String gender = sc.next();
                        genderValue = Gender.valueOf(gender.toUpperCase());
                        patientdata.setGender(genderValue);
                    } catch (Exception e) {
                        System.out.println("Enter a valid gender");
                    }
                }

                int age = 0;
                while (age <= 18) {
                    try {
                        System.out.println("Enter the patient age (must be > 18):");
                        age = sc.nextInt();
                        if (age <= 18) {
                            System.out.println("Age must be greater than 18");
                        } else {
                            patientdata.setAge(age);
                        }
                    } catch (Exception e) {
                        System.out.println("Enter a valid age");
                        sc.nextLine();
                    }
                }

                patientService.validateAndAdddata(patientdata);

            }


            String yesorno = null;


            do {
                System.out.println("Press 1 to getId by name");
                System.out.println("Press 2 to getPatientsByAge");
                System.out.println("Press 3 to getAllPatients");
                int option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1:
                        System.out.println("Enter the patient name to getId:");
                        String name = sc.nextLine();
                        patientService.getPatientIdByPatientName(name);
                        break;

                    case 2:
                        System.out.println("Enter the patient age");
                        int age=sc.nextInt();
                        patientService.getPatientsByAge(age);
                        sc.nextLine();
                        break;

                        case 3:
                            patientService.getAllPatients();
                            break;

                    default:
                        System.out.println("Please enter a valid data...");

                }
                System.out.println("Do you want to continue!");
                yesorno = sc.next();

            }
            while (yesorno.equalsIgnoreCase("yes"));
            sc.close();

        }


    }

