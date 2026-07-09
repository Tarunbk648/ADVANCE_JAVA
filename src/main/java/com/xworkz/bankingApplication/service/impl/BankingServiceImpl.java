package com.xworkz.bankingApplication.service.impl;

import com.xworkz.bankingApplication.dao.BankingDao;
import com.xworkz.bankingApplication.dao.impl.BankingDaoImpl;
import com.xworkz.bankingApplication.dto.BankingDto;
import com.xworkz.bankingApplication.service.BankingService;


public class BankingServiceImpl implements BankingService {
    BankingDao bankingDao = new BankingDaoImpl();

    @Override
    public boolean save(BankingDto dto) {
        return bankingDao.save(dto);
    }

    @Override
    public boolean getAllDetailsByEmail(String email) {
        return bankingDao.getAllDetailsByEmail(email);
    }

    @Override
    public boolean updateUserNameByUserId(int userId, String userName) {
        return bankingDao.updateUserNameByUserId(userId,userName);
    }

    @Override
    public boolean updatePasswordByUserId(int userId, String password) {
        return bankingDao.updateUserNameByUserId(userId,password);
    }

    @Override
    public boolean updateAddressByUserName(String address, String name) {
        return bankingDao.updateAddressByUserName(address,name);
    }

    @Override
    public boolean deleteDataByUserId(int userId) {
        return bankingDao.deleteDataByUserId(userId);
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
