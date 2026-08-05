package com.xworkz.InvalidAgeException.controller;

import com.xworkz.InvalidAgeException.dao.VoterDao;
import com.xworkz.InvalidAgeException.dto.VoterDto;
import com.xworkz.InvalidAgeException.service.VoterServiceDao;
import com.xworkz.InvalidAgeException.service.impl.VoterServiceImpl;

public class VoterController {
    VoterServiceDao vServiceDao= new VoterServiceImpl();
    public int checkAge(VoterDto dto) {
        return vServiceDao.checkAge(dto);
    }
    public int validatePin(VoterDto dto) {
        return vServiceDao.validatePin(dto);
    }
}
