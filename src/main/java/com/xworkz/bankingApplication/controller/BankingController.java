package com.xworkz.bankingApplication.controller;

import com.xworkz.bankingApplication.dto.BankingDto;
import com.xworkz.bankingApplication.service.BankingService;
import com.xworkz.bankingApplication.service.impl.BankingServiceImpl;



public class BankingController {
    BankingService bankingService = new BankingServiceImpl();

    public boolean save(BankingDto dto) {
        return bankingService.save(dto);
    }


    public boolean getAllDetailsByEmail(String email) {
        return bankingService.getAllDetailsByEmail(email);
    }

    public boolean updateUserNameByUserId(int userId, String userName) {
        return bankingService.updateUserNameByUserId(userId,userName);
    }


    public boolean updatePasswordByUserId(int userId, String password) {
        return bankingService.updatePasswordByUserId(userId,password);
    }


    public boolean updateAddressByUserName(String address, String name) {
        return bankingService.updateAddressByUserName(address,name);
    }

    public boolean deleteDataByUserId(int userId) {
        return bankingService.deleteDataByUserId(userId);
    }

    public boolean getAllData() {
        return bankingService.getAllData();
    }

    public boolean deleteAllData() {
        return bankingService.deleteAllData();
    }


}
