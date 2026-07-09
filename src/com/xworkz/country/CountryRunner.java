package com.xworkz.country;

import com.xworkz.country.constants.CountryEnum;
import com.xworkz.country.controller.CountryController;
import com.xworkz.country.dto.CountryDto;

import java.util.List;
import java.util.Scanner;

public class CountryRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Data to be Added");
        int numberOfData = scanner.nextInt();
        scanner.nextLine();
        CountryController controller = new CountryController();

        for (int i = 0; i < numberOfData; i++) {
            CountryDto countryDto = new CountryDto();

            System.out.println("Enter the Country Code");
            String countryCode = scanner.nextLine();
            countryDto.setCountryCode(countryCode);

            System.out.println("Enter the Country Name");
            String countryName = scanner.nextLine();
            countryDto.setCountryName(countryName);

            System.out.println("Enter the Country Capital");
            String capital = scanner.nextLine();
            countryDto.setCountryCapital(capital);

            System.out.println("Enter the Country Currency");
            String currency = scanner.nextLine();
            countryDto.setCountryCurrency(currency);

            System.out.println("Enter the Country Enum");
            CountryEnum cenum = CountryEnum.valueOf(scanner.nextLine());
            countryDto.setCountryEnum(cenum);

            System.out.println("Enter the Country Population");
            int population = scanner.nextInt();
            countryDto.setCountryPopulation(population);
            scanner.nextLine();

            controller.validateAndSave(countryDto);

            String yesOrNo = null;

            do {

                System.out.println("Press 1 to getCountryCodeByCountryName");
                System.out.println("Press 2 to getCountryNameByCountryCode");
                System.out.println("Press 3 to getCountryPopulationByCountryName");
                System.out.println("Press 4 to getCountryEnumByCountryCode");
                System.out.println("Press 5 to updateCountryPopulationByCountryCode");
                System.out.println("Press 6 to updateCountryCapitalByCountryCode");
                System.out.println("Press 7 to updateCountryCurrencyByCountryCode");
                System.out.println("Press 8 to deleteCountryNameByCountryCode");
                System.out.println("Press 9 to deleteCountryCapitalByCountryName");
                System.out.println("Press 10 to getCountryDetailsByCountryCode");
                System.out.println("Press 11 to getCountryDetailsByCountryName");
                System.out.println("Press 12 to getAllCountryDetails");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the Country Name");
                        String countryName1 = scanner.nextLine();
                        controller.getCountryCodeByCountryName(countryName1);
                        break;

                    case 2:
                        System.out.println("Enter the Country Code");
                        String countryCode2 = scanner.nextLine();
                        controller.getCountryNameByCountryCode(countryCode2);
                        break;

                    case 3:
                        System.out.println("Enter the Country Name");
                        String countryName3 = scanner.nextLine();
                        controller.getCountryPopulationByCountryName(countryName3);
                        break;

                    case 4:
                        System.out.println("Enter the Country Code");
                        String countryCode4 = scanner.nextLine();
                        controller.getCountryEnumByCountryCode(countryCode4);
                        break;

                    case 5:
                        System.out.println("Enter the Country Code");
                        String countryCode5 = scanner.nextLine();
                        System.out.println("Enter the Country Population");
                        int countryPopulation5 = scanner.nextInt();
                        controller.updateCountryPopulationByCountryCode(countryPopulation5, countryCode5);
                        scanner.nextLine();
                        break;

                    case 6:
                        System.out.println("Enter the Country code");
                        String countryCode6 = scanner.nextLine();
                        System.out.println("Enter the Country Capital");
                        String countryCapital6 = scanner.nextLine();
                        controller.updateCountryCapitalByCountryCode(countryCapital6, countryCode6);
                        break;

                    case 7:
                        System.out.println("Enter the Country Code");
                        String countryCode7 = scanner.nextLine();
                        System.out.println("Enter the Country Currency");
                        String countryCurrency7 = scanner.nextLine();
                        controller.updateCountryCurrencyByCountryCode(countryCurrency7, countryCode7);
                        break;

                    case 8:
                        System.out.println("Enter the Country Code");
                        String countryCode8 = scanner.nextLine();
                        controller.deleteCountryNameByCountryCode(countryCode8);
                        break;

                    case 9:
                        System.out.println("Enter the Country Name");
                        String countryName9 = scanner.nextLine();
                        controller.deleteCountryCapitalByCountryName(countryName9);
                        break;

                    case 10:
                        System.out.println("Enter the Country Code");
                        String countryCode10 = scanner.nextLine();
                        controller.getCountryDetailsByCountryCode(countryCode10);
                        break;

                    case 11:
                        System.out.println("Enter the Country Name");
                        String countryName11 = scanner.nextLine();
                        controller.getCountryDetailsByCountryName(countryName11);
                        break;

                    case 12:
                        controller.getAllCountryDetails();
                        break;

                    default:
                        System.out.println("Please enter a valid choice!!");
                }
                System.out.println("Do you want to continue? (yes/no)");
                yesOrNo = scanner.next();
            }
            while (yesOrNo.equalsIgnoreCase("yes"));
            scanner.close();

        }

    }
}
