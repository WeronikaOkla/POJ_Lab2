package pl.edu.pjwstk.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dlugosc tablicy 1:");
        int a = scanner.nextInt();

        int[] array1 = new int[a];

        System.out.println("Podaj tablice:");
        for (int i = 0; i < a; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Podaj dlugosc tablicy 2:");
        int b = scanner.nextInt();

        int[] array2 = new int[b];

        System.out.println("Podaj tablice:");
        for (int j = 0; j < b; j++) {
            array2[j] = scanner.nextInt();
        }

        if (array1.length == array2.length) {
            int[] array3 = new int[array1.length];
            for (int k = 0; k < array3.length; k++) {
                array3 [k] = array1[k] +array2[k];
            }
            System.out.println(Arrays.toString(array3));
        } else {
            int[] array4 = new int[]{};
            System.out.println(Arrays.toString(array4));
        }
    }
}
