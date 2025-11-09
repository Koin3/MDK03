class Task1 {
    public static void main(String[] args) {
        printWelcome();
        printWelcome();
    }

    public static void printWelcome() {
        System.out.println("******************");
        System.out.println("*   Добро пожаловать!  *");
        System.out.println("******************");
    }
}

// Задание 2

class Task2 {
    public static void main(String[] args) {
        printText();
        printRectangle();
        printText();
        printTriangle();
    }
    public static void printRectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
    public static void printTriangle() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    public static void printText() {
        System.out.println("*** Вот такие фигуры! ***");
    }
}

// Задание 3

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();
        sum(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
        scanner.close();
    }
    public static void sum(double a, double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    public static void subtract(double a, double b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }
    public static void multiply(double a, double b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    public static void divide(double a, double b) {
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println(a + " / " + b + " = Деление на ноль невозможно!");
        }
    }
}
