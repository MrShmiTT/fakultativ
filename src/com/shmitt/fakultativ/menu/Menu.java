package com.shmitt.fakultativ.menu;

import com.shmitt.fakultativ.GetData;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    private void printMenu() {
        System.out.println("1. Показать все курсы");
        System.out.println("2. Показать курсы по длительности");
        System.out.println("3. Выход из приложения;");
    }

    public void start() throws SQLException {
        if (this.scanner != null) {
            int key;
            do {
                printMenu();
                System.out.print("Введите номер меню: ");
                key = this.scanner.nextInt();
                GetData getData = new GetData();
                switch (key) {
                    case 1 -> getData.selectAll();
                    case 2 -> System.out.println(System.lineSeparator() + "Вывел курсы по продолжительности"
                            + System.lineSeparator());
                    case 3 -> System.out.println("Завершение программы...");
                    default -> System.out.println("Вы ввели неверное значение меню...\n");
                }
            } while (key != 3);
        }
    }
}

