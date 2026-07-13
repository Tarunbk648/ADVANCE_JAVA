package com.xworkz.bankingApplication.dao.impl;

import com.xworkz.bankingApplication.dao.BankingDao;
import com.xworkz.bankingApplication.dto.BankingDto;
import com.xworkz.bankingApplication.exception.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankingDaoImpl implements BankingDao {
    String url = "jdbc:mysql://localhost:3306/bankingapp_db";
    String username = "root";
    String password = "root123";
    Connection connection = null;

    @Override
    public boolean save(BankingDto dto) {
        boolean isDataSaved = false;
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            String query = "insert into banking_info values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, dto.getUser_Id());
            preparedStatement.setString(2, dto.getUser_Name());
            preparedStatement.setString(3, dto.getUser_Email());
            preparedStatement.setString(4, dto.getUser_Password());
            preparedStatement.setString(5, dto.getAddress());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("User saved successfully");
                isDataSaved = true;
                preparedStatement.close();
                connection.close();
            } else {
                throw new UserSaveFailsException("User not saved");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return isDataSaved;
    }


    @Override
    public boolean getAllDetailsByEmail(String email) {
        boolean isDataRetrieved = false;
        BankingDto bankingDto = new BankingDto();
        try (Connection   connection = DriverManager.getConnection(url, username, password)){
            String query = "select * from banking_info where user_Email=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                bankingDto.setUser_Id(resultSet.getInt("user_Id"));
                bankingDto.setUser_Name(resultSet.getString("user_Name"));
                bankingDto.setUser_Email(resultSet.getString("user_Email"));
                bankingDto.setUser_Password(resultSet.getString("user_Password"));
                bankingDto.setAddress(resultSet.getString("address"));
                isDataRetrieved = true;

                System.out.println("User Data Retrived Successfully");
                System.out.println("User Id:" + bankingDto.getUser_Id());
                System.out.println("User Name:" + bankingDto.getUser_Name());
                System.out.println("User Email:" + bankingDto.getUser_Email());
                System.out.println("User Password:" + bankingDto.getUser_Password());
                System.out.println("User Address:" + bankingDto.getAddress());

                preparedStatement.close();
                connection.close();
            } else {
                throw new UserDetailsNotFoundException("User not found");
            }
        } catch (UserDetailsNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
        return isDataRetrieved;
    }


    @Override
    public boolean updateUserNameByUserId(int userId, String userName) {
        boolean isUserNameUpdated = false;
        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "update banking_info set user_Name=? where user_Id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userName);
            preparedStatement.setInt(2, userId);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                isUserNameUpdated = true;
                System.out.println("User Name Updated Successfully");
                System.out.println("User Id:" + userId);
                System.out.println("User Name:" + userName);

                preparedStatement.close();
                connection.close();
            }
            else if (rowsAffected==0) {
                throw new UserNameUpadateFailsException("User not found");
                
            }
        } catch (UserNameUpadateFailsException | SQLException e) {
            System.err.println(e.getMessage());
        }
        return isUserNameUpdated;
    }


    @Override
    public boolean updatePasswordByUserId(int userId, String password) {
        boolean isPasswordUpdated = false;
        try(Connection connection = DriverManager.getConnection(url, username, password)){
            String query = "update banking_info set user_Password=? where user_Id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, password);
            preparedStatement.setInt(2, userId);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                isPasswordUpdated = true;
                System.out.println("Password Updated Successfully");
                System.out.println("User Id:" + userId);
                System.out.println("User Password:" + password);

                preparedStatement.close();
                connection.close();
            } else {
                throw new UserPasswordUpdateFailsException("User not found");
            }

        } catch (UserPasswordUpdateFailsException | SQLException e) {
            System.err.println(e.getMessage());
        }
        return isPasswordUpdated;
    }


    @Override
    public boolean updateAddressByUserName(String address, String name) {
        boolean isAddressUpdated = false;

        try (Connection  connection = DriverManager.getConnection(url, username, password)){
            String query = "update banking_info set address=? where user_Name=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, address);
            preparedStatement.setString(2, name);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                isAddressUpdated = true;
                System.out.println("Address Updated Successfully");
                System.out.println("User Name:" + name);
                System.out.println("User Address:" + address);

                preparedStatement.close();
                connection.close();
            } else {
                throw new UserAddressUpdateFailsException("User not found");
            }
        } catch (UserAddressUpdateFailsException | SQLException e) {
            System.err.println(e.getMessage());
        }
        return isAddressUpdated;
    }


    @Override
    public boolean deleteDataByUserId(int userId) {
        boolean isDataDeleted = false;
        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "delete from banking_info where user_Id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userId);
            int rowaffected = preparedStatement.executeUpdate();

            if (rowaffected > 0) {
                isDataDeleted = true;
                System.out.println("Data Deleted Successfully");
                System.out.println("User Id:" + userId);

            } else {
                throw new UserDeleteFailsException("User not found");
            }

        } catch (UserDeleteFailsException | SQLException e) {
            System.err.println(e.getMessage());
        }
        return isDataDeleted;
    }


    @Override
    public boolean getAllData() {
        boolean isDataDeleted=false;
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "select * from banking_info";
            Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);

            while (resultSet.next()) {
                BankingDto bankingDto = new BankingDto();
                bankingDto.setUser_Id(resultSet.getInt("user_Id")); //Database indha get madkondu bankingDto ge set madtha irodhu
                bankingDto.setUser_Name(resultSet.getString("user_Name"));
                bankingDto.setUser_Password(resultSet.getString("user_Password"));
                bankingDto.setAddress(resultSet.getString("address"));

                System.out.println("-----------------------------");
                System.out.println("UserId:" + bankingDto.getUser_Id());
                System.out.println("UserName:" + bankingDto.getUser_Name());
                System.out.println("UserPassword:" + bankingDto.getUser_Password());
                System.out.println("UserAddress:" + bankingDto.getAddress());

                isDataDeleted = true;

            }
            if (isDataDeleted==false) {
                throw new UserGetAllDataFailsException("User not found");
            }
        } catch (UserGetAllDataFailsException |SQLException e) {
            System.err.println("Exception in getAllData()");
        }
        return false;
    }

    @Override
    public boolean deleteAllData() {
        boolean isDataDeleted = false;
        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "delete from banking_info";
            Statement statement = connection.createStatement();
            statement.execute(query);
            isDataDeleted = true;
            System.out.println("All Data Deleted Successfully");

            statement.close();
            connection.close();

        } catch (Exception e) {
            System.err.println("Exception in deleteAllData()");
        }
        return isDataDeleted;
    }

}
