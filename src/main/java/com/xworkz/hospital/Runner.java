package com.xworkz.hospital;

import com.xworkz.hospital.controller.HospitalController;
import com.xworkz.hospital.dto.HospitalDto;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HospitalController controller=new HospitalController();

        HospitalDto hospitalDto=new HospitalDto();

        System.out.println("Enter the hospital_id");
        int hospital_id= sc.nextInt();
        hospitalDto.setHospital_id(hospital_id);
        sc.nextLine();

        System.out.println("Enter the hospital name");
        String name= sc.nextLine();
        hospitalDto.setHospital_name(name);

        System.out.println("Enter the is_open");
        boolean is_open= sc.nextBoolean();
        hospitalDto.setis_open(is_open);
        sc.nextLine();

        System.out.println("Enter the phone number");
        long phoneNumber= sc.nextLong();
        hospitalDto.setPhoneNumber(phoneNumber);



        controller.save(hospitalDto);

    }
}
