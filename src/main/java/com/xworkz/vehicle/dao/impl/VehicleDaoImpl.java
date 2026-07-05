package com.xworkz.vehicle.dao.impl;

import com.xworkz.vehicle.dao.VehicleDao;
import com.xworkz.vehicle.dto.VehicleDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class VehicleDaoImpl implements VehicleDao {

    @Override
    public void process(VehicleDto vehicleDto) {
        String url = "jdbc:mysql://localhost:3306/mvcvehicle";
        String username = "root";
        String password = "root123";

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   //Load Driver
            connection = DriverManager.getConnection(url, username, password);   //Establish connection
            String query = "insert into vehicle values(1, '" + vehicleDto.getVehicleId() + "','" + vehicleDto.getVehicleName() + "', '" + vehicleDto.getCharseNumber() + "')"; //Query
            Statement statement = connection.createStatement(); //Create statement
            statement.execute(query); //Execute query
            System.out.println("Data inserted successfully");
            connection.close(); //Close connection


        } catch (Exception e) {
            System.out.println("Exception while inserting data");
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Connection closed successfully");
                } catch (Exception e) {
                    System.out.println("Exception while closing the connection");
                }
            }
        }
    }
}
