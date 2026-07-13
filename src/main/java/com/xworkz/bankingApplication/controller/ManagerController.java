package com.xworkz.bankingApplication.controller;

import com.xworkz.bankingApplication.dto.ManagerDto;
import com.xworkz.bankingApplication.service.ManagerService;
import com.xworkz.bankingApplication.service.impl.ManagerServiceImpl;

public class ManagerController {
   ManagerService managerService = new ManagerServiceImpl();

   public void saveManagerData(ManagerDto dto){
       managerService.save(dto);
   }
}
