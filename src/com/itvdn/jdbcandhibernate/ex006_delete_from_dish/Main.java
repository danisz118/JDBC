package com.itvdn.jdbcandhibernate.ex006_delete_from_dish;

import java.sql.*;


public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/carsshop";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "postgres";

    private static final String DELETE = "DELETE FROM dish WHERE id = ? AND title = ?";

    public static void main(String[] args) {
        registerDriver();

        Connection connection = null;
        PreparedStatement statement = null;


        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.prepareStatement(DELETE);

            statement.setString(2,"Title");
            statement.setInt(1,2);

            int res = statement.executeUpdate();
            System.out.println(res);

        } catch (SQLException  e) {
            e.printStackTrace();
        }  finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    private static void registerDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
