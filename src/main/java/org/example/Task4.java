package org.example;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введена строка: " + inputConsole());
    }

    private static String inputConsole() {
        System.out.print("введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.trim() == "") {
            throw new RuntimeException("введена пустая строка");
        }
        return str;
    }
}

