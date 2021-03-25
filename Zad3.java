package pl.edu.pjwstk.lab2;

public class Zad3 {
    public static void main(String[] args) {

        int[][] array1 = new int[2][2];
        array1[0][0] = 2;
        array1[0][1] = 5;
        array1[1][0] = 3;
        array1[1][1] = 7;

        int[][] array2 = new int[2][2];
        array2[0][0] = 3;
        array2[0][1] = 7;
        array2[1][0] = 9;
        array2[1][1] = 4;

        int a = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a += array1[i][j];
            }
        }

        for (int b = 0; b < 2; b++) {
            for (int c = 0; c < 2; c++) {
                a += array2[b][c];
            }
        }

        System.out.println(a);

    }
}