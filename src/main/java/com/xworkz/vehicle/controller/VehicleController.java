package com.xworkz.vehicle.controller;

import com.xworkz.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.service.VehicleService;
import com.xworkz.vehicle.service.impl.VehicleServiceImpl;

public class VehicleController {
    VehicleService vehicleService=new VehicleServiceImpl();
    public void process(VehicleDto vehicleDto){
        vehicleService.process(vehicleDto);    //Controller--->Service

    }
}
