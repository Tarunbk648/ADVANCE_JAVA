package com.xworkz.bankingApplication.service.impl;

import com.xworkz.bankingApplication.dao.BankingDao;
import com.xworkz.bankingApplication.dao.impl.BankingDaoImpl;
import com.xworkz.bankingApplication.dto.BankingDto;
import com.xworkz.bankingApplication.service.BankingService;


public class BankingServiceImpl implements BankingService {
    BankingDao bankingDao = new BankingDaoImpl();
    BankingDto bankingDto = new BankingDto();

    @Override
    public boolean save(BankingDto dto) {
        if (dto.getUser_Id() > 0 && dto.getUser_Name() != null && dto.getUser_Name().length() > 0 && dto.getUser_Email() != null && dto.getUser_Email().contains("@") && dto.getUser_Email().contains(".") && dto.getUser_Password() != null && dto.getAddress() != null) {
            return bankingDao.save(dto);
        } else {
            System.err.println("Please fill the correct entries!");
        }
        return false;
    }

    @Override
    public boolean getAllDetailsByEmail(String email) {
        return bankingDao.getAllDetailsByEmail(email);
    }


    @Override
    public boolean updateUserNameByUserId(int userId, String userName) {
        if (userId != 0 && userId == bankingDto.getUser_Id()) {
            return bankingDao.updateUserNameByUserId(userId, userName);
        } else {
            System.err.println("Please enter the correct userId!");
        }
        return false;
    }

    @Override
    public boolean updatePasswordByUserId(int userId, String password) {
        if (userId != 0 && userId == bankingDto.getUser_Id()) {
            return bankingDao.updateUserNameByUserId(userId, password);
        } else {
            System.err.println("Please enter the correct userId!");
        }
        return false;
    }

    @Override
    public boolean updateAddressByUserName(String address, String name) {
        if (name != null && name.equalsIgnoreCase(bankingDto.getUser_Name())) {
            return bankingDao.updateAddressByUserName(address, name);
        } else {
            System.err.println("Please enter the correct name!");
        }
        return false;
    }

    @Override
    public boolean deleteDataByUserId(int userId) {
        if(userId!=0 ){
        return bankingDao.deleteDataByUserId(userId);
    }
        else{
            System.err.println("Please enter the correct userId!");
        }
        return false;
    }

    @Override
    public boolean getAllData() {
        return bankingDao.getAllData();
    }

    @Override
    public boolean deleteAllData() {
        return bankingDao.deleteAllData();
    }
}
