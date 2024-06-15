package second.logic03;

import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal08 {
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
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n && j >= n/2){
                    arr[i][j] = fibo[index];
                }
                if (i + j >= n-1 && j <= n/2){
                    arr[i][j] = fibo[index];
                }
            }
            if (i < n/2){
                index++;
            } else{
                index--;
            }
        }
        PrintArray.printArray(arr);
    }
}
