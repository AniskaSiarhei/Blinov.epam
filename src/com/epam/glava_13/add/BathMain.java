package com.epam.glava_13.add;

import com.epam.glava_13.ConnectionCreator;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class BathMain {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = ConnectionCreator.createConnection();
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.addBatch("INSERT INTO phonebok VALUES (92, 'Sapega', 1122111)");
//            statement.addBatch("INSERT INTO location VALUES (201, 'Minsk')");
//            statement.addBatch("INSERT INTO location VALUES (202, 'Lviv')");

            int[] updateCounts = statement.executeBatch();
            connection.commit();
            System.out.println(Arrays.toString(updateCounts));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (connection != null) { // turn on autocommit
                    connection.setAutoCommit(true);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

