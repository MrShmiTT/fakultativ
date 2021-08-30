package com.shmitt.fakultativ;

import com.shmitt.fakultativ.util.ConnectionManager;

import java.sql.Driver;
import java.sql.SQLException;

public class GetData {
    public void selectAll() throws SQLException {
        Class<Driver> driverClass = Driver.class;
        String sql = """
                SELECT *
                FROM courses
                """;
        try (var connection = ConnectionManager.open()) {
            var statement = connection.createStatement();
            var executeResult = statement.executeQuery(sql);
            while (executeResult.next()) {
                System.out.print(executeResult.getLong("id"));
                System.out.print(" | ");
                System.out.print(executeResult.getString("name"));
                System.out.print(" | ");
                System.out.print(executeResult.getString("teacher"));
                System.out.print(" | ");
                System.out.print(executeResult.getInt("hours"));
                System.out.println(" | " + System.lineSeparator());

            }
        }
    }
}