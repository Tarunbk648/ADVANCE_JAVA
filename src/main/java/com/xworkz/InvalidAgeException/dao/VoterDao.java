package com.xworkz.InvalidAgeException.dao;

import com.xworkz.InvalidAgeException.dto.VoterDto;

public interface VoterDao {
    int checkAge(VoterDto dto);
    int validatePin(VoterDto dto);
}
