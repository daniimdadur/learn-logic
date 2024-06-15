package second.logic02;

import utils.InputData;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));
        int[] genap = new int[n*n];
        for (int i = 0; i < genap.length; i++) {
            genap[i] = 2 * i + 2;
        }

        String[][] array = new String[n][n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = String.valueOf(genap[index]);
                index++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].isEmpty()){
                    System.out.print("\t");
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
