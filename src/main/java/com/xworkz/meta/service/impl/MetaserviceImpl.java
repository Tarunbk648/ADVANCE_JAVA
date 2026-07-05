package com.xworkz.meta.service.impl;

import com.xworkz.meta.controller.MetaController;
import com.xworkz.meta.dao.MetaDao;
import com.xworkz.meta.dao.impl.MetaDaoImpl;
import com.xworkz.meta.dto.SignUpDto;
import com.xworkz.meta.exception.SigunUpDataNotValidatedException;
import com.xworkz.meta.service.MetaService;

public class MetaserviceImpl implements MetaService {
  MetaDao metadataDao= new MetaDaoImpl();

    public void validateData(SignUpDto signUpDto){
        try {
            boolean isDataAdded = false;
            boolean isUserNameValid = false;
            boolean isEmailValid = false;
            boolean isPasswordValid = false;
            boolean isAdhaarNumberValid = false;

            String name = signUpDto.getUser_Name();
            if (name != null && !name.isEmpty()) {
                isUserNameValid = true;
            }

            String email = signUpDto.getEmail();
            if (email != null && !email.isEmpty() && email.contains("@gmail.com")){
                isEmailValid = true;
            }

            String password = signUpDto.getPassword();
            if (password != null && !password.isEmpty() && password.length() >= 8 && password.matches("[a-zA-Z0-9]{8,}") ) {
                isPasswordValid = true;
            }

            String adhaar = signUpDto.getAdhaar_number();
            if (adhaar!=null) {
                isAdhaarNumberValid = true;
            }

            System.out.println(isUserNameValid);
            System.out.println(isEmailValid);
            System.out.println(isPasswordValid);
            System.out.println(isAdhaarNumberValid);

            if (isUserNameValid && isEmailValid && isPasswordValid && isAdhaarNumberValid) {
                this.metadataDao.getDetails(signUpDto);
                isDataAdded = true;
            }
            if (isDataAdded == false) {
                  throw new SigunUpDataNotValidatedException("Error in validating");
            }
        } catch (SigunUpDataNotValidatedException e) {
            System.out.println(e.getMessage());
        }
    }
}
