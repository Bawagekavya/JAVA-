package com.xwork.jdbc;

import java.sql.*;


public class HospitalRunner {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded succesfully");

            String url = "jdbc:mysql://localhost:3306/Hospital";
            String username = "root";
            String password = "7259958546";
            DriverManager.getConnection(url, username, password);
            System.out.println("Established conncetion succesfully");
        } catch (ClassNotFoundException | SQLException classNotFoundException) {
            System.out.println("JDBc driver not found :" + classNotFoundException.getMessage());
        }
    }
}
