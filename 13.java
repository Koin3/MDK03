class CalculatorUtils {

    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    // Метод getCircleArea (площадь круга)
    public static double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    // Метод findMax (поиск максимума)
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    // Метод isEven (проверка на четность)
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    // Метод isPalindrome (проверка строки на палиндром)
    public static boolean isPalindrome(String str) {
        String cleanStr = str.toLowerCase();
        int left = 0;
        int right = cleanStr.length() - 1;
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // Метод main для демонстрации работы методов
    public static void main(String[] args) {
        System.out.println("=== Тестирование методов CalculatorUtils ===");

        // Тестирование арифметики
        System.out.println("add(5, 3) = " + add(5, 3));
        System.out.println("subtract(10, 4) = " + subtract(10, 4));

        // Тестирование площади круга
        System.out.println("getCircleArea(5.0) = " + getCircleArea(5.0));

        // Тестирование findMax
        System.out.println("findMax(7, 12) = " + findMax(7, 12));

        // Тестирование isEven
        System.out.println("isEven(4) = " + isEven(4));
        System.out.println("isEven(7) = " + isEven(7));

        // Тестирование isPalindrome
        System.out.println("isPalindrome(\"топот\") = " + isPalindrome("топот"));
        System.out.println("isPalindrome(\"hello\") = " + isPalindrome("hello"));
        System.out.println("isPalindrome(\"anna\") = " + isPalindrome("anna"));
    }
}
