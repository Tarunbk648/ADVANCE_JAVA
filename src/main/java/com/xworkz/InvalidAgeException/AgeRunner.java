package com.xworkz.InvalidAgeException;

import com.xworkz.InvalidAgeException.controller.VoterController;
import com.xworkz.InvalidAgeException.dto.VoterDto;

public class AgeRunner {
    public static void main(String[] args) {
        VoterController controller= new VoterController();
        VoterDto dto= new VoterDto();
        dto.setAge(1);
        dto.setPin(1235);

        controller.checkAge(dto);
        controller.validatePin(dto);
    }
}
