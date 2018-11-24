package lesson16.lesson16.task5;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Введите набор чисел:");
        String inputLine = new Scanner(System.in).nextLine();
        new InputOutput().inputStringToNumbers(inputLine).printNumbers();
    }
}

