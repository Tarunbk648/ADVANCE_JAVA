package com.xworkz.InvalidAgeException.service.impl;

import com.xworkz.InvalidAgeException.dao.VoterDao;
import com.xworkz.InvalidAgeException.dao.impl.VoterImpl;
import com.xworkz.InvalidAgeException.dto.VoterDto;
import com.xworkz.InvalidAgeException.service.VoterServiceDao;

public class VoterServiceImpl implements VoterServiceDao {
    VoterDao vdao= new VoterImpl();
    @Override
    public int checkAge(VoterDto dto) {
        return vdao.checkAge(dto);
    }

    @Override
    public int validatePin(VoterDto dto) {
        return vdao.validatePin(dto);
    }
}
