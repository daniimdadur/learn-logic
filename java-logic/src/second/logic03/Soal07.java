package second.logic03;

import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] fibo = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2){
                fibo[i] = 1;
            } else {
                fibo[i] = fibo[i -1] + fibo[i -2];
            }
        }
        int[][] arr = new int[n][n];
        int indexCol = 0;
        for (int i = 0; i < n; i++) {
            int indexRow = 0;
            for (int j = 0; j < n; j++) {
                if (i + j < n && j >= n/2){
                    arr[i][j] = fibo[indexCol];
                }
                if (i + j >= n-1 && j <= n/2){
                    arr[i][j] = fibo[indexCol];
                }
                if (i >= j && i <= n/2){
                    arr[i][j] = fibo[indexRow];
                }
                if (j >= i && i >= n/2){
                    arr[i][j] = fibo[indexRow];
                }
                if (j < n/2){
                    indexRow++;
                } else {
                    indexRow--;
                }
            }
            if (i < n/2){
                indexCol++;
            } else{
                indexCol--;
            }
        }
        PrintArray.printArray(arr);
    }
}
