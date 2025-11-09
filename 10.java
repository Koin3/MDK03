import java.util.Random;
class ArrayProcessing {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101); // nextInt(101) -> от 0 до 100
        }
        System.out.print("Сгенерированный массив: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
//Задание 2 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArrayProcessingAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите элемент " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Ваш массив: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        List<Integer> minIndices = new ArrayList<>();
        List<Integer> maxIndices = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                minIndices.add(i);
            }
            if (array[i] == max) {
                maxIndices.add(i);
            }
        }
        System.out.println("Минимальный элемент: " + min + ". Найден на позициях: " + minIndices);
        System.out.println("Максимальный элемент: " + max + ". Найден на позициях: " + maxIndices);
        scanner.close();
    }
}
