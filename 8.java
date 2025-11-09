public class TypeConversion {
  public static void main(String[] args) {
    // Задание 1
    System.out.println("Задание 1");
    int intValue = 100;
    long longValue = intValue; // Неявное преобразование
    System.out.println("int: " + intValue + " -> long: " + longValue);
    double doubleValue = intValue; // Неявное преобразование
    System.out.println("int: " + intValue + " -> double: " + doubleValue);
    float floatValue = 45.67f;
    double doubleFromFloat = floatValue; // Неявное преобразование
    System.out.println("float: " + floatValue + " -> double: " + doubleFromFloat);
    // Задание 2
    System.out.println("Задание 2");
    double doubleNum = 9.78;
    int intFromDouble = (int) doubleNum; // Явное преобразование (отбрасывается дробная часть)
    System.out.println("double: " + doubleNum + " -> int: " + intFromDouble);
    int largeInt = 300;
    byte byteFromInt = (byte) largeInt; // Явное преобразование (возможна потеря данных)
    System.out.println("int: " + largeInt + " -> byte: " + byteFromInt);
    long longNum = 50000L;
    int intFromLong = (int) longNum; // Явное преобразование
    System.out.println("long: " + longNum + " -> int: " + intFromLong);
    // Задание 3
    System.out.println("Задание 3");
    int a = 10;
    double b = 3.0;
    // Результат выражения будет double, так как b - double
    double result1 = a / b;
    System.out.println("int / double: " + a + " / " + b + " = " + result1);
    // Целочисленное деление: результат будет int (дробная часть отбрасывается)
    int result2 = a / 3; // 3 - целое число
    System.out.println("int / int: " + a + " / 3 = " + result2);
    // Явное преобразование результата деления к int
    int result3 = (int) (a / b); // Результат double приводится к int
    System.out.println("Явное преобразование (int)(a / b): (int)(" + a + " / " + b + ") = " + result3);
  }
}
