package com.xwork.jdbc;

import java.sql.*;

public class LibraryRunner {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");

            String url = "jdbc:mysql://localhost:3306/Library";
            String username = "root";
            String password = "7259958546";
            DriverManager.getConnection(url, username, password);
            System.out.println("Established conncetion successfully");
        }catch (ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("Jdbc driver not found:" + classNotFoundException.getMessage());
        }

    }
}
