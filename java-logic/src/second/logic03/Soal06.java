package second.logic03;

import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] fibo = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2){
                fibo[i] = 1;
                continue;
            }
            int result = 0;
            for (int j = 1; j <= 2; j++) {
                result += fibo[i - j];
            }
            fibo[i] = result;
        }
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n && j >= i){
                    arr[i][j] = fibo[j];
                }
                if (i + j >= n-1 && j <= i){
                    arr[i][j] = fibo[j];
                }
            }
        }
        PrintArray.printArray(arr);
    }
}
