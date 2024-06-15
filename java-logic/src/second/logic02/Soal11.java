package second.logic02;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));
        int[] ganjil = DeretAngka.ganjil(n);

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i){
                    arr[i][j] = ganjil[j];
                }
            }
        }
        PrintArray.printArray(arr);
    }
}
