package com.shmitt.fakultativ.menu;

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

    public void start() {
        if (this.scanner != null) {
            int key;
            do {
                printMenu();
                System.out.print("Введите номер меню: ");
                key = this.scanner.nextInt();
                switch (key) {
                    case 1 -> System.out.println(System.lineSeparator() + "Вывел все курсы" + System.lineSeparator());
                    case 2 -> System.out.println(System.lineSeparator() + "Вывел курсы по продолжительности"
                            + System.lineSeparator());
                    case 3 -> System.out.println("Завершение программы...");
                    default -> System.out.println("Вы ввели неверное значение меню...\n");
                }
            } while (key != 3);
        }
    }
}

