package org.example;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {

        float floatNum = inputConsole();
        System.out.println("введено число " + floatNum);


    }

    static float inputConsole(){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        String userStr = scanner.next();

        try {
            return Float.parseFloat(userStr);
        } catch (NumberFormatException e){
            System.out.println("неверный ввод");
            return inputConsole();
        }
    }
}

