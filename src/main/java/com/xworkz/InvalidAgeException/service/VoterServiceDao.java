package com.xworkz.InvalidAgeException.service;

import com.xworkz.InvalidAgeException.dao.VoterDao;
import com.xworkz.InvalidAgeException.dto.VoterDto;

public interface VoterServiceDao {
    int checkAge(VoterDto dto);
    int validatePin(VoterDto dto);
}
