package com.xworkz.vehicle;

import com.xworkz.vehicle.controller.VehicleController;
import com.xworkz.vehicle.dto.VehicleDto;

import java.util.Scanner;

public class vehicleRunner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        VehicleController vcontroller= new VehicleController();

        VehicleDto vDto=new VehicleDto();
        System.out.println("Enter Vehicle ID:");
        int vehicleId=scanner.nextInt();
        vDto.setVehicleId(vehicleId);
        scanner.nextLine();

        System.out.println("Enter the Vehicle Name:");
        String name= scanner.nextLine();
        vDto.setVehicleName(name);

        System.out.println("Enter the Vehicle charseNumber:");
        String number= scanner.nextLine();
        vDto.setCharseNumber(number);

        vcontroller.process(vDto);    //Dto--->Controller

    }
}
