package com.xworkz.meta.dao.impl;

import com.xworkz.meta.dao.MetaDao;
import com.xworkz.meta.dto.SignUpDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDaoImpl implements MetaDao {

    @Override
    public void getDetails(SignUpDto signUpDto) {
        String url = "jdbc:mysql://localhost:3306/mvcmeta";
        String userName = "root";
        String password = "root123";

        Connection connection = null;
        try {
            //1.Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. Establish a Connection
            connection = DriverManager.getConnection(url, userName, password);
            //3.Query
            String query = "insert into meta values(2 ,'" + signUpDto.getUser_Name() + "', '" + signUpDto.getEmail() + "', '" + signUpDto.getPassword() + "', '" + signUpDto.getAdhaar_number() + "')";
            //4.Create a statement
            Statement statement = connection.createStatement();
            //5.Execute Query
            statement.execute(query);
            //6.Close the connection
            connection.close();
            System.out.println("Data inserted Successfully");

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Insertion problem:" +e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed Successfully!!");
                }
            } catch (SQLException e) {
                System.err.println("Connection closing problem!!");
            }

        }
    }
}