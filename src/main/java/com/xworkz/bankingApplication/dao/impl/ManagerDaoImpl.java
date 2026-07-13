package com.xworkz.bankingApplication.dao.impl;

import com.xworkz.bankingApplication.dao.ManagerDao;
import com.xworkz.bankingApplication.dto.ManagerDto;
import com.xworkz.bankingApplication.exception.ManagerDataFailsException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManagerDaoImpl implements ManagerDao {
    String url = "jdbc:mysql://localhost:3306/bankingapp_db";
    String username = "root";
    String password = "root123";

    @Override
    public boolean save(ManagerDto dto) {
        boolean isDataSaved = false;
        try(Connection connection = DriverManager.getConnection(url, username, password)){
            String query = "insert into manager_info values (?, ?, ?, ?, ?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, dto.getManager_Id());
            preparedStatement.setInt(2,dto.getUser_Id());
            preparedStatement.setString(3, dto.getManager_Name());
            preparedStatement.setString(4, dto.getManager_Email());
            preparedStatement.setString(5, dto.getManager_Password());
            preparedStatement.setString(6, dto.getAddress());
            int rowsAffected = preparedStatement.executeUpdate();
            if(rowsAffected > 0) {
                System.out.println("Manager data saved successfully");
                isDataSaved = true;
            }
            else{
                throw new ManagerDataFailsException("Failed to save manager data bcz user_id is not found");
            }

        } catch (ManagerDataFailsException | SQLException e) {
            System.err.println(e.getMessage());
        }

        return isDataSaved;
    }
}
