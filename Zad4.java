package pl.edu.pjwstk.lab2;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[] {-1,2,-3,4};

        int a = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                a = a + array[i];
            }
        }

        System.out.println(a);

    }
}
