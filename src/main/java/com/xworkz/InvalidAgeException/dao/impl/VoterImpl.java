package com.xworkz.InvalidAgeException.dao.impl;

import com.xworkz.InvalidAgeException.dao.VoterDao;
import com.xworkz.InvalidAgeException.dto.VoterDto;
import com.xworkz.InvalidAgeException.exception.InvalidAgeException;
import com.xworkz.InvalidAgeException.exception.InvalidPinException;

public class VoterImpl implements VoterDao{
    public int checkAge(VoterDto dto ) {
        int age = dto.getAge();
        try{
        if (age < 18) {
            throw new InvalidAgeException("Your are not eligible to vote!");
        } else if (age >= 18) {
            System.out.println("Your Eligible to vote!");
        } else {
            System.out.println("Invalid age");
        }
    }catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
        return age;
    }

    @Override
    public int validatePin(VoterDto dto) {
        int pin = dto.getPin();
        try {
            if (pin != 1234) {
                throw new InvalidPinException("Invalid pin");
            } else {
                System.out.println("Valid pin");
            }
        } catch (InvalidPinException e) {
            System.err.println(e.getMessage());
        }
        return pin;
    }

}
