package com.xworkz.meta.controller;

import com.xworkz.meta.dto.SignUpDto;
import com.xworkz.meta.service.MetaService;
import com.xworkz.meta.service.impl.MetaserviceImpl;

public class MetaController {
    MetaService metaService = new MetaserviceImpl();


    public void addData(SignUpDto signUpDto){
        metaService.validateData(signUpDto);
    }
}
