class AreaCalculator {
    // 1. Площадь круга
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    // 2. Площадь прямоугольника
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    // 3. Площадь треугольника
    public static double calculateArea(double base, double height, String figure) {
        return 0.5 * base * height;
    }
    public static void main(String[] args) {
        System.out.println("Площадь круга с радиусом 5.0: " + calculateArea(5.0));
        System.out.println("Площадь прямоугольника 4x7: " + calculateArea(4.0, 7.0));
        System.out.println("Площадь треугольника с основанием 6 и высотой 4: " + calculateArea(6.0, 4.0, "triangle"));
    }
}

class PrintUtils {
    // 1. Вывод строки в кавычках
    public static void printInfo(String text) {
        System.out.println("\"" + text + "\"");
    }
    // 2. Вывод целого числа
    public static void printInfo(int number) {
        System.out.println("Число: " + number);
    }
    // 3. Вывод числа с плавающей точкой (округлённое до 2 знаков)
    public static void printInfo(double number) {
        System.out.printf("Число: %.2f%n", number);
    }
    // 4. Вывод массива
    public static void printInfo(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        String text = "Hello";
        int number = 10;
        double dNumber = 3.14159;
        int[] arr = {1, 2, 3};

        printInfo(text);
        printInfo(number);
        printInfo(dNumber);
        printInfo(arr);
    }
}

class MathHelper {
    // 1. Максимум из двух целых
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }
    // 2. Максимум из трёх целых
    public static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
    // 3. Максимум из двух double
    public static double findMax(double a, double b) {
        return Math.max(a, b);
    }
    // 4. Максимум из массива целых
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив пуст или null");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("findMax(5, 3) = " + findMax(5, 3));
        System.out.println("findMax(5, 3, 8) = " + findMax(5, 3, 8));
        System.out.println("findMax(2.5, 3.7) = " + findMax(2.5, 3.7));

        int[] arr = {10, 20, 15, 30, 25};
        System.out.println("findMax(arr) = " + findMax(arr));
    }
}
