package com.xworkz.bankingApplication.service;

import com.xworkz.bankingApplication.dto.BankingDto;

import java.util.List;

public interface BankingService {
    boolean save(BankingDto dto);
    boolean getAllDetailsByEmail(String email);
    boolean updateUserNameByUserId(int userId, String userName);
    boolean updatePasswordByUserId(int userId, String password);
    boolean updateAddressByUserName(String address, String name);
    boolean deleteDataByUserId(int userId);
    boolean getAllData();
    boolean deleteAllData();
}
