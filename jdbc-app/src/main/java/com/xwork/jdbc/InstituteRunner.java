package com.xwork.jdbc;

import java.sql.*;

public class InstituteRunner {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded succesfully");

            String url = "jdbc:mysql://localhost:3306/Institute";
            String username = "root";
            String password = "7259958546";
            DriverManager.getConnection(url, username, password);
            System.out.println("Established connection successfully");
        } catch (ClassNotFoundException | SQLException classNotFoundException) {
            System.out.println("JDBC driver not found :" + classNotFoundException.getMessage());
        }
    }
}

