package com.xworkz.hospital.dao;

import com.xworkz.hospital.dao.impl.HospitalDao;
import com.xworkz.hospital.dto.HospitalDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalDaoimpl implements HospitalDao {
    @Override
    public void save(HospitalDto hospitalDto) {

        String url = "jdbc:mysql://localhost:3306/mvchospital";
        String userName = "root";
        String passWord = "root123";

        Connection connection=null;
        try {
            //1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.Get Connection
            connection = DriverManager.getConnection(url, userName, passWord);

            //3.Query
            String query = "insert into Hospital values('" + hospitalDto.getHospital_id() + "', '" + hospitalDto.getHospital_name() + "', " + hospitalDto.getis_open() + ", " + hospitalDto.getPhoneNumber() + ")";


            // 4.Create Statement
            Statement statement = connection.createStatement();


            // 5. Execute statement
            statement.execute(query);

            // 6. close connection
            connection.close();

            System.out.println("Data saved successfully");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if(connection!=null){
                try {
                    connection.close();
                    System.out.println("Connection closed Successfully");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
