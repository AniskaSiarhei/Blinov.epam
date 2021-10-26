package com.epam.glava_13.add;

import java.sql.*;
import java.util.Properties;

public class addDB {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/testphones";
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "root");

        try (Connection connection = DriverManager.getConnection(url, properties);
             Statement statement = connection.createStatement(
                     ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
            ResultSet resultSet = statement.executeQuery("SELECT idphonebook, lastname, phone FROM phonebook");
            resultSet.moveToInsertRow();
            resultSet.updateInt(1, 777);
            resultSet.updateString(2, "Bohdanovich");
            resultSet.updateInt(3, 223322);
            resultSet.insertRow();
            resultSet.moveToCurrentRow();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                if (id == 2) {
                    resultSet.updateInt("phone", 5550055);
                    resultSet.updateRow();
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
