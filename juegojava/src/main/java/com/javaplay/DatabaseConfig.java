package com.javaplay;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    // private static final String URL = "jdbc:mysql://127.0.0.1:3306/juandavidgomezFiltro";
    // private static final String USER = "root";
    // private static final String PASSWORD = "juandavidgomez15@";

    // public static Connection getConnection() throws SQLException {
    //     return DriverManager.getConnection(URL, USER, PASSWORD);
    // }

    private static final String URL = "jdbc:mysql://localhost:3306/sgpzf";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}