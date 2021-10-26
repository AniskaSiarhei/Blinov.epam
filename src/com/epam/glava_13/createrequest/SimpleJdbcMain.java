package com.epam.glava_13.createrequest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SimpleJdbcMain {
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
        properties.put("autoReconnect", "true");
        properties.put("characterEncoding", "UTF-8");
        properties.put("useUnicode", "true");
        properties.put("useSSL", "true");
        properties.put("useJDBCCompliantTimezoneShift", "true");
        properties.put("useLegacyDatetimeCode", "false");
        properties.put("serverTimezone", "UTC");
        properties.put("serverSslCert", "classpath:server.crt");

        try (Connection connection = DriverManager.getConnection(url, properties);
            Statement statement = connection.createStatement()) {

            String sql = "SELECT idphonebook, lastname, phone from phonebook";
            ResultSet resultSet = statement.executeQuery(sql);
            List<Abonent> abonents = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int number = resultSet.getInt("phone");
                abonents.add(new Abonent(id, name, number));
            }
            System.out.println(abonents);

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            System.out.println("Column count: " + resultSetMetaData.getColumnCount());
            System.out.println("Column name: " + resultSetMetaData.getColumnName(1));
            System.out.println("Column Type name: " + resultSetMetaData.getColumnTypeName(1));
            System.out.println("isAutoIncrement: " + resultSetMetaData.isAutoIncrement(1));
            System.out.println("Column name: " + resultSetMetaData.getColumnName(2));
            System.out.println("Column Type name: " + resultSetMetaData.getColumnTypeName(2));
            System.out.println("isAutoIncrement: " + resultSetMetaData.isAutoIncrement(2));

            DatabaseMetaData databaseMetaData = connection.getMetaData();
            System.out.println("Data base name: " + databaseMetaData.getDatabaseProductName());
            System.out.println("Data base version: " + databaseMetaData.getDatabaseProductVersion());
            System.out.println("User name: " + databaseMetaData.getUserName());
            System.out.println("URL: " + databaseMetaData.getURL());



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        };



    }
}
