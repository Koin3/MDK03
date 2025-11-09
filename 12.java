class Task1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("До вызова swap: x=" + x + ", y=" + y);
        swap(x, y);
        System.out.println("После вызова swap: x=" + x + ", y=" + y);

// Объяснение: В метод swap передаются копии значений x и y. Изменения внутри метода не влияют на исходные переменные x и y.
    }

    public static void swap(int a, int b) {
        System.out.println("Внутри метода swap до обмена: a=" + a + ", b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Внутри метода swap после обмена: a=" + a + ", b=" + b);
    }
}

class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.print("Массив до инкремента: ");
        printArray(numbers);

        incrementArray(numbers);

        System.out.print("Массив после инкремента: ");
        printArray(numbers);

// Объяснение: Массив передается по ссылке. Хотя сама ссылка передается по значению, обе ссылки указывают на один и тот же массив в памяти. Поэтому изменения элементов массива внутри метода влияют на оригинальный массив.
    }
    public static void incrementArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

class Task3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Массив до обнуления: ");
        printArray(numbers);

        resetArray(numbers);

        System.out.print("Массив после обнуления: ");
        printArray(numbers);
    }
    public static void resetArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

class Task4 {
    public static void main(String[] args) {
        String myString = "Старая строка";
        System.out.println("До вызова метода: " + myString);
        tryToChangeString(myString);
        System.out.println("После вызова метода: " + myString);
        /*
         * Объяснение:
         * Строки в Java неизменяемы (immutable).
         * При присваивании str = "Новая строка" внутри метода,
         * создается новая строка, и локальная ссылка str начинает указывать на неё.
         * Это не влияет на оригинальную строку в main, т.к. строки неизменяемы,
         * и присваивание новой строки не меняет исходный объект.
         */
    }
    public static void tryToChangeString(String str) {
        str = "Новая строка";
        System.out.println("Внутри метода: " + str);
    }
}
