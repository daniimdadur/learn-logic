package second.logic03;

import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal04 {
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
                result += fibo[i -j];
            }
            fibo[i] = result;
        }
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][0] = String.valueOf(fibo[0]);
            arr[i][n-1] = String.valueOf(fibo[n-1]);
            arr[0][i] = String.valueOf(fibo[i]);
            arr[n-1][i] = String.valueOf(fibo[i]);
            arr[n/2][i] = String.valueOf(fibo[i]);
            arr[i][n/2] = String.valueOf(fibo[n/2]);
        }
        PrintArray.printArray(arr);
    }
}
