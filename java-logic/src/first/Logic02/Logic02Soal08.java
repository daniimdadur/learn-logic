package first.Logic02;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal08 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] fibo = DeretAngka.fibo(n,2);

        int[][] array = new int[n][n];

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= n-1 && i <= n/2 && j >= n/2){
                    array[i][j] = fibo[index];
                } else if (i + j >= n-1 && i >= n/2 && j <= n/2) {
                    array[i][j] = fibo[index];
                }
            }
            if (i < n/2){
                index++;
            } else {
                index--;
            }
        }
        PrintArray.printArray(array);
    }
}
