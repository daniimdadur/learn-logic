package second.logic03;

import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] bil = new int[n];
        for (int i = 0; i < n; i++) {
            bil[i] = i + 1;
        }
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][i] = bil[i];
            arr[i][n-1-i] = bil[n-1-i];
        }
        PrintArray.printArray(arr);
    }
}
