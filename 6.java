import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("консольный калькулятор");
    System.out.print("Введите первое число: ");
    double num1 = scanner.nextDouble();
    System.out.print("Введите действие (+, -, *, /): ");
    char operator = scanner.next().charAt(0);
    System.out.print("Введите второе число: ");
    double num2 = scanner.nextDouble();
    double result = 0;
    boolean isValidOperator = true;
    switch (operator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        if (num2 != 0) {
          result = num1 / num2;
        } else {
          System.out.println("Ошибка: деление на ноль!");
          isValidOperator = false;
        }
        break;
      default:
        System.out.println("Ошибка: неверное действие '" + operator + "'");
        isValidOperator = false;
        break;
    }
    if (isValidOperator) {
      System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);
    }
    scanner.close();
  }
}
