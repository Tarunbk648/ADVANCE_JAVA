package com.xworkz.meta;

import com.xworkz.meta.controller.MetaController;
import com.xworkz.meta.dto.SignUpDto;

import java.util.Scanner;

public class MetaRunner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MetaController metaController = new MetaController();

        SignUpDto metaDto= new SignUpDto();
        System.out.println("Enter the userName");
        String name = sc.nextLine();
        metaDto.setUser_Name(name);

        System.out.println("Enter the user Email");
        String email= sc.nextLine();
        metaDto.setEmail(email);

        System.out.println("Enter the Password");
        String password=sc.nextLine();
        metaDto.setPassword(password);


        System.out.println("Enter the Adhaar Number");
        String adhaar_number= sc.nextLine();
        metaDto.setAdhaar_number(adhaar_number);


        metaController.addData(metaDto);




    }
}
