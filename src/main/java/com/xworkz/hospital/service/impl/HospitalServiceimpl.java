package com.xworkz.hospital.service.impl;

import com.xworkz.hospital.dao.HospitalDaoimpl;
import com.xworkz.hospital.dao.impl.HospitalDao;
import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.service.HospitalService;

public class HospitalServiceimpl implements HospitalService {
    HospitalDao hospitalDao = new HospitalDaoimpl();

    @Override
    public void save(HospitalDto hospitalDto) {
        String phoneNumberStr = String.valueOf(hospitalDto.getPhoneNumber());

        if (hospitalDto.getHospital_id() > 0 && hospitalDto.getHospital_name() != null && !hospitalDto.getHospital_name().isEmpty() && phoneNumberStr.length() == 10 && (phoneNumberStr.startsWith("6") || phoneNumberStr.startsWith("7") || phoneNumberStr.startsWith("8") || phoneNumberStr.startsWith("9"))) {
            hospitalDao.save(hospitalDto);
        } else {
            System.out.println("Validation failed: Please check your inputs");
        }

    }
}