package first.Logic02;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal06 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] fibo = DeretAngka.fibo(n,2);

        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= n-1 && i <= j){
                    array[i][j]=fibo[i];
                } else if (i + j >= n-1 && i >= j) {
                    array[i][j]=fibo[i];
                }
            }
        }
        PrintArray.printArray(array);
    }
}
