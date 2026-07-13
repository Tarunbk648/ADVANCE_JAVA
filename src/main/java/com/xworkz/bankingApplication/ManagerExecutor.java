package com.xworkz.bankingApplication;

import com.xworkz.bankingApplication.controller.ManagerController;
import com.xworkz.bankingApplication.dto.ManagerDto;

import java.util.Scanner;

public class ManagerExecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerController managerController = new ManagerController();
        ManagerDto dto = new ManagerDto();

        System.out.println("Welcome to Manager Executor");
        System.out.println();

        System.out.println("Enter Manager Id");
        int manager_Id = scanner.nextInt();
        dto.setManager_Id(manager_Id);
        scanner.nextLine();

        System.out.println("Enter User Id");
        int user_Id = scanner.nextInt();
        dto.setUser_Id(user_Id);
        scanner.nextLine();

        System.out.println("Enter Manager Name");
        String manager_Name = scanner.nextLine();
        dto.setManager_Name(manager_Name);

        System.out.println("Enter the Manager email");
        String email= scanner.nextLine();
        dto.setManager_Email(email);

        System.out.println("Enter the Manager password");
        String password= scanner.nextLine();
        dto.setManager_Password(password);

        System.out.println("Enter the Manager address");
        String address= scanner.nextLine();
        dto.setAddress(address);


        managerController.saveManagerData(dto);

    }
}
