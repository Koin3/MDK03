 import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите ваше имя: ");
                String name = scanner.nextLine();
                System.out.print("Введите ваш возраст: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введите ваш город: ");
                String city = scanner.nextLine();
                System.out.println("Приветствую, " + name + "!");
                System.out.println("Тебе " + age + " лет.");
                System.out.println("Ты живешь в замечательном городе " + city + "!");
                scanner.close();
            }
        }
