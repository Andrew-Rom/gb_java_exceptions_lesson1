import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("> ");
//        int searchingNumber = scanner.nextInt();
//        int[] array = {1, 2, 3, 4, 5};
//        int res = arrayN(array, searchingNumber);
//        switch (res) {
//            case -3 -> System.out.println("Массив не может быть null");
//            case -4 -> System.out.println("Длина массина равна нулю");
//            case -1 -> System.out.println("Массив меньше заданной длины (3)");
//            case -2 -> System.out.printf("%d не найден в массив", searchingNumber);
//            default -> System.out.printf("%d имеет индекс %d", searchingNumber, res);
//        }
//        scanner.close();


        Random rnd = new Random();
        int matrix[][] = new int[5][];
//        int matrix[][] = {{1, 1, 1}, {1, 0, 0}, {1, 0, 0}};

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[rnd.nextInt(4)];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(2);
            }
        }



        printArray(matrix);

        System.out.println(calculate(matrix));



    }

    public static int calculate(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
            if (array.length != array[i].length) {
                throw new RuntimeException("Array must be square");
            }
            for (int cell : row) {
                if (cell != 0 && cell != 1) {
                    throw new RuntimeException("Array может быть только 0 или 1 ");
                }
                sum += cell;
            }
        }
        return sum;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static int arrayN(int[] array, int n) {
        if (array == null) {
            return -3;
        }
        if (array.length == 0) {
            return -4;
        }
        if (array.length < 3) {
            return -1;
        }

        for (int i : array) {

        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -2;
    }



}