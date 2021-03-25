package pl.edu.pjwstk.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wielkosc tablicy: ");
        int i = scanner.nextInt();

        String[] array = new String[i];

        for (int j = 0; j < i; j++) {

            System.out.println("Podaj znak: ");

            array[j] = scanner.next();

        }

        System.out.println(Arrays.toString(array));

    }
}
