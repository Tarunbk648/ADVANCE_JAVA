package com.xworkz.hospital.controller;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.impl.HospitalServiceimpl;

public class HospitalController {
    HospitalService hospitalService = new HospitalServiceimpl();

    public void save(HospitalDto hospitalDto){
         hospitalService.save(hospitalDto);

    }

}
