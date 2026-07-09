package com.xworkz.bankingApplication.dao;

import com.xworkz.bankingApplication.dto.BankingDto;

import java.util.ArrayList;
import java.util.List;

public interface BankingDao {
    boolean save(BankingDto dto);
    boolean getAllDetailsByEmail(String email);
    boolean updateUserNameByUserId(int userId, String userName);
    boolean updatePasswordByUserId(int userId, String password);
    boolean updateAddressByUserName(String address, String name);
    boolean deleteDataByUserId(int userId);
    boolean getAllData();
    boolean deleteAllData();

}
