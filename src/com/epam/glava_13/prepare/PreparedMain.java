package com.epam.glava_13.prepare;

import com.epam.glava_13.ConnectionCreator;

import java.sql.*;

public class PreparedMain {
    public static void main(String[] args) {
        try (Connection connection = ConnectionCreator.createConnection()) {
//            String sql = "INSERT INTO phonebook(idphonebook, lastname, phone) VALUES (?, ?, ?)";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setInt(1, 43);
//            statement.setString(2, "Skaryna");
//            statement.setInt(3, 990077);
//            int rowsUpdate = statement.executeUpdate();
//            System.out.println(rowsUpdate);

            String sql = "INSERT INTO phonebook(lastname, phone) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, "Kalinouski");
            statement.setInt(2, 186300);
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            if(resultSet.next()) {
                int key = resultSet.getInt(1);
                System.out.println(key);
            }




        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
