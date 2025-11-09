import java.util.Scanner;

class Lab7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Задание 1
    System.out.println("=== Задание 1: Определение четности числа ===");
    System.out.print("Введите целое число: ");
    int number1 = scanner.nextInt();
    if (number1 % 2 == 0) {
      System.out.println("Число " + number1 + " является четным.");
    } else {
      System.out.println("Число " + number1 + " является нечетным.");
    }
    // Задание 2
    System.out.println("\n=== Задание 2: Сравнение двух чисел ===");
    System.out.print("Введите первое число: ");
    int num1 = scanner.nextInt();
    System.out.print("Введите второе число: ");
    int num2 = scanner.nextInt();
    if (num1 > num2) {
      System.out.println("Число " + num1 + " больше, чем " + num2 + ".");
    } else if (num2 > num1) {
      System.out.println("Число " + num2 + " больше, чем " + num1 + ".");
    } else {
      System.out.println("Числа " + num1 + " и " + num2 + " равны.");
    }
    // Задание 3
    System.out.println("\n=== Задание 3: Определение времени года по номеру месяца ===");
    System.out.print("Введите номер месяца (1-12): ");
    int month = scanner.nextInt();
    switch (month) {
      case 12:
      case 1:
      case 2:
        System.out.println("Зима");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println("Весна");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("Лето");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("Осень");
        break;
      default:
        System.out.println("Некорректный номер месяца.");
        break;
    }
    // Задание 4
    System.out.println("\n=== Задание 4: Калькулятор с проверкой деления на ноль ===");
    System.out.print("Введите первое число: ");
    double numFirst = scanner.nextDouble();
    System.out.print("Введите операцию (+, -, *, /): ");
    char op = scanner.next().charAt(0);
    System.out.print("Введите второе число: ");
    double numSecond = scanner.nextDouble();
    double result = 0;
    boolean isValidOperation = true;
    switch (op) {
      case '+':
        result = numFirst + numSecond;
        break;
      case '-':
        result = numFirst - numSecond;
        break;
      case '*':
        result = numFirst * numSecond;
        break;
      case '/':
        if (numSecond == 0) {
          System.out.println("Ошибка! Деление на ноль невозможно.");
          isValidOperation = false;
        } else {
          result = numFirst / numSecond;
        }
        break;
      default:
        System.out.println("Ошибка! Некорректная операция.");
        isValidOperation = false;
        break;
    }
    if (isValidOperation) {
      System.out.printf("%.2f %c %.2f = %.2f%n", numFirst, op, numSecond, result);
    }
    scanner.close();
  }
}
