package com.epam.glava_13.createrequest;

import com.epam.glava_13.ConnectionCreator;


import java.sql.*;

public class TestConnection2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionCreator.createConnection();

    }
}
