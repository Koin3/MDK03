import java.util.Scanner;
class CycleTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // === Задача 1: Сумма ряда чисел ===
        System.out.println("=== Задача 1: Сумма ряда чисел (for) ===");
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
        // Та же задача, но с использованием while
        System.out.println("\n=== Задача 1: Сумма ряда чисел (while) ===");
        System.out.print("Введите число: ");
        int n2 = scanner.nextInt();
        int sum2 = 0;
        int j = 1; // используем другое имя, чтобы избежать конфликта
        while (j <= n2) {
            sum2 += j;
            j++;
        }
        System.out.println("Сумма чисел от 1 до " + n2 + " = " + sum2);
        // Задача 2: Вычисление факториала
        System.out.println("\n=== Задача 2: Вычисление факториала ===");
        int num;
        long factorial = 1;
        do {
            System.out.print("Введите неотрицательное целое число для вычисления факториала: ");
            num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Ошибка: факториал не определен для отрицательных чисел.");
            }
        } while (num < 0);
        for (int k = 1; k <= num; k++) {
            factorial *= k;
        }
        System.out.println("Факториал числа " + num + " = " + factorial);
        // Задача 3
        System.out.println("\n=== Вся таблица умножения (1-10) ===");
        for (int i = 1; i <= 10; i++) {
            for (int j2 = 1; j2 <= 10; j2++) {
                System.out.printf("%d x %d = %d\t", i, j2, i * j2);
            }
            System.out.println();
        }
        scanner.close();
    }
}
