package com.shmitt.fakultativ.menu;

import java.sql.SQLException;
import java.util.Scanner;

public class TestMenu {
    public static void main(String[] args) throws SQLException {
        new Menu(new Scanner(System.in)).start();
    }
}
