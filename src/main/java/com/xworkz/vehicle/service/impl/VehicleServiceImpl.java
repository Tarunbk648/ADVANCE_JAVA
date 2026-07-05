package com.xworkz.vehicle.service.impl;

import com.xworkz.vehicle.dao.VehicleDao;
import com.xworkz.vehicle.dao.impl.VehicleDaoImpl;
import com.xworkz.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.service.VehicleService;

public class VehicleServiceImpl implements VehicleService {
    VehicleDao vehicleDao=new VehicleDaoImpl();
    @Override
    public void process(VehicleDto vehicleDto) {
        if (vehicleDto.getVehicleId() > 0 && vehicleDto.getVehicleName() != null && vehicleDto.getCharseNumber() != null) {
            vehicleDao.process(vehicleDto);    //Service---->Dao

        }
    }
}
