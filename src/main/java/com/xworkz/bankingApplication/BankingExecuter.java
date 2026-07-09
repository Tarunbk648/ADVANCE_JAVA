package com.xworkz.bankingApplication;

import com.xworkz.bankingApplication.controller.BankingController;
import com.xworkz.bankingApplication.dto.BankingDto;

import java.util.Scanner;

public class BankingExecuter {
    public static void main(String[] args) {
        BankingDto dto = new BankingDto();
        BankingController bankingController = new BankingController();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("~~~~~ WELCOME TO BANKING APPLICATION ~~~~~~");
        System.out.println();

        System.out.println("PRESS 1 FOR USER SIGNIN  ");
        System.out.println("PRESS 2 FOR MANAGER SIGNIN");
        int option = sc.nextInt();
        sc.nextLine();


        if (option == 1) {
            System.out.println("---WELCOME TO USER SIGNIN---");

            System.out.println("Enter the user_Id");
            int userId = sc.nextInt();
            dto.setUser_Id(userId);
            sc.nextLine();

            System.out.println("Enter the user_Name");
            String userName = sc.nextLine();
            dto.setUser_Name(userName);

            System.out.println("Enter the user_Email");
            String userEmail = sc.nextLine();
            dto.setUser_Email(userEmail);

            System.out.println("Enter the user_Password");
            String userPassword = sc.nextLine();
            dto.setUser_Password(userPassword);

            System.out.println("Enter the user_Address");
            String userAddress = sc.nextLine();
            dto.setAddress(userAddress);

            bankingController.save(dto);

            String yesOrNo = null;

            do {
                System.out.println("Press 1 to getAllDetailsByEmail");
                System.out.println("Press 2 to updateUserNameByUserId");
                System.out.println("Press 3 to updatePasswordByUserId");
                System.out.println("Press 4 to updateAddressByUserName");


                int userChoice = sc.nextInt();
                sc.nextLine();

                switch (userChoice) {
                    case 1:
                        System.out.println("---Please Fill the required credentials---");
                        System.out.println("Enter the user_Email");
                        String email = sc.nextLine();
                        bankingController.getAllDetailsByEmail(email);
                        break;

                    case 2:
                        System.out.println("Enter the user_Id");
                        int Id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the user_Name");
                        String Name = sc.nextLine();
                        bankingController.updateUserNameByUserId(Id, Name);
                        sc.nextLine();
                        break;

                    case 3:
                        System.out.println("Enter the user_Id");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the user_Password");
                        String Password = sc.nextLine();
                        bankingController.updatePasswordByUserId(id, Password);
                        sc.nextLine();
                        break;

                    case 4:
                        System.out.println("Enter the user_Name");
                        String name = sc.nextLine();
                        System.out.println("Enter the user_Address");
                        String address = sc.nextLine();
                        bankingController.updateAddressByUserName(address, name);
                        break;

                    default:
                        System.out.println("Invalid choice");
                        break;

                }
                System.out.println("Do you want to continue? (yes/no)");
                yesOrNo = sc.next();

            }
            while (yesOrNo.equalsIgnoreCase("yes"));
            sc.close();


        } else if (option == 2) {
            System.out.println("---WELCOME TO MANAGER SIGNIN---");

            String yesOrNo = null;

            do {
                System.out.println("Press 5 to deleteDataByUserId");
                System.out.println("Press 6 to getAllData");
                System.out.println("Press 7 to deleteAllData");

                int managerChoice = sc.nextInt();
                sc.nextLine();

                switch (managerChoice){

                    case 5:
                        System.out.println("Enter the user_Id");
                        int identity = sc.nextInt();
                        bankingController.deleteDataByUserId(identity);
                        break;

                    case 6:
                        bankingController.getAllData();
                        break;

                    case 7:
                        bankingController.deleteAllData();
                        break;

                    default:
                        System.out.println("Invalid choice");
                        break;

                }
                System.out.println("Do you wish to continue? (yes/no)");
                yesOrNo=sc.next();
            }
            while (yesOrNo.equalsIgnoreCase("yes"));
            sc.close();
        }
    }
}
