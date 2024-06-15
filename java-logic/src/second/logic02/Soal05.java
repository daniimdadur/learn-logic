package second.logic02;

import utils.DeretAngka;
import utils.InputData;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));
        int[] ganjil = DeretAngka.ganjil(n*n);

        int[][] array = new int[n][n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 1){
                    array[i][n-j-1] = ganjil[index];
                } else {
                    array[i][j] = ganjil[index];
                }
                index++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
