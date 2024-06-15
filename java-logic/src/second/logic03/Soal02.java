package second.logic03;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));
        int[] ganjil = DeretAngka.ganjil(n);

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][0] = ganjil[0];
            arr[i][n-1] = ganjil[n-1];
            arr[0][i] = ganjil[i];
            arr[n-1][i] = ganjil[i];
        }
        PrintArray.printArray(arr);
    }
}
