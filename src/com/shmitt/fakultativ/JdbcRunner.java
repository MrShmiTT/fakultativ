package com.shmitt.fakultativ;

import com.shmitt.fakultativ.util.ConnectionManager;

import java.sql.*;

public class JdbcRunner {
    public static void main(String[] args) throws SQLException {
        Class<Driver> driverClass = Driver.class;
        String sql = """
                SELECT *
                FROM courses
                """;

        try (var connection = ConnectionManager.open()) {
            var statement = connection.createStatement();

            System.out.println(connection.getSchema());
            System.out.println(connection.getTransactionIsolation());

            var executeResult = statement.executeQuery(sql);
            while (executeResult.next()) {
                System.out.println(executeResult.getLong("id"));
                System.out.println(executeResult.getString("name"));
                System.out.println(executeResult.getString("teacher"));
                System.out.println(executeResult.getInt("hours"));
                System.out.println("----------");
            }
        }
    }
}