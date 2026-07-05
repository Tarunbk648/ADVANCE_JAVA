package com.xworkz.training.dao.impl;

import com.xworkz.training.dao.TrainingDao;
import com.xworkz.training.dto.TrainingDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainingDaoImpl implements TrainingDao {
    @Override
    public void process(TrainingDto trainingDto) {
        String url = "jdbc:mysql://localhost:3306/xworkz";
        String userName = "root";
        String password = "root123";

        Connection connection=null;
        try {
            //1.Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. Get Connection
            connection= DriverManager.getConnection(url, userName, password);

            //3.Query
            String query= "update training set duration='4 months' where training_id='HG22ROM'";

            //4.Statement
            Statement statement=connection.createStatement();
git
            //5.Execute
            statement.execute(query);

            //6.close
            connection.close();

            System.out.println(" Processed successfully");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Failed to process the training");
            e.printStackTrace();
        }
        finally{
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Failed to close the connection");
                }
            }
        }

    }
}
