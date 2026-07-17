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








//TRANSACTION AND DROP TABLE QUERIES    


package com.xworkz.bankingApplication.dao.impl;

import com.xworkz.bankingApplication.dao.ManagerDao;
import com.xworkz.bankingApplication.dto.ManagerDto;
import com.xworkz.bankingApplication.exception.ManagerDataFailsException;

import java.sql.*;   //jdbc comes under this package

public class ManagerDaoImpl implements ManagerDao {
    String url = "jdbc:mysql://localhost:3306/bankingapp_db";
    String username = "root";
    String password = "root123";

    @Override
    public boolean save(ManagerDto dto) {
        boolean isDataSaved = false;
        Connection connection1=null;
        try(Connection connection = DriverManager.getConnection(url, username, password)){  //try with resources

            connection.setAutoCommit(false);
            String query = "insert into manager_info values (?, ?, ?, ?, ?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 9482);
            preparedStatement.setInt(2,8900);
            preparedStatement.setString(3, "Irfan");
            preparedStatement.setString(4, "irfa@gmail.com");
            preparedStatement.setString(5, "Irfa@123");
            preparedStatement.setString(6, "Manglore");
            preparedStatement.addBatch();


//           int a=10/0;   //ArithmeticException Occurs  //if it is uncomment then it will throw an exception then both rows doesn't save

            preparedStatement.setInt(1, 9380);
            preparedStatement.setInt(2,9900);
            preparedStatement.setString(3, "Shahid");
            preparedStatement.setString(4, "Shahid@gmail.com");
            preparedStatement.setString(5, "Shahi@123");
            preparedStatement.setString(6, "Tumkur");
            preparedStatement.addBatch();   //addBatch() is used to add the data to the batch ( add a multiple rows of data)


            int[] rowsAffected = preparedStatement.executeBatch();   //executeBatch() is used to execute the batch
            if(rowsAffected != null) {
                System.out.println("Manager data saved successfully");
                connection.commit();  //commit() is used to commit the transaction
                isDataSaved = true;
            }
            else{
                throw new ManagerDataFailsException("Failed to save manager data bcz user_id is not found");
            }

        } catch (Exception e) {
            System.out.println("Inside Catch");
            try {
                connection1.rollback();  //rollback() is used to rollback the transaction
                System.out.println("Manager data rollback successfully");
            } catch (SQLException ex) {
                System.out.println("Exception Handled");
            }
        }

        return isDataSaved;
    }

    @Override
    public boolean dropTable() {
        boolean isTableDropped = false;
       try(Connection connection=DriverManager.getConnection(url,username, password)){
           String query = "drop table manager_info";
           Statement statement = connection.createStatement();
           int rowsAffected = statement.executeUpdate(query);
           if(rowsAffected != 0) {
               System.out.println("Table dropped successfully");
               isTableDropped=true;

           }
       } catch (Exception e) {
           System.out.println("Error in Dropping a table");
       }
       return isTableDropped;

    }
}

