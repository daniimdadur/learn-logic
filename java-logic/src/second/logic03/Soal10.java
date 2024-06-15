package second.logic03;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] ganjil = DeretAngka.ganjil(n);

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            int lastIndex = n/2;
            int firstIndex = 0;
            for (int j = 0; j < n; j++) {
                if (i + j <= n/2){
                    arr[i][j] = ganjil[n/2-j-i];
                }
                if (j - i >= n/2){
                    arr[i][j] = ganjil[j-n/2-i];
                }
                if (i - j >= n/2){
                    arr[i][j] = ganjil[i-n/2-j];
                }
                if (j + i >= n-1+n/2){
                    arr[i][j] = ganjil[i-(n-1)+j-n/2];
                }
            }
        }
        PrintArray.printArray(arr);
    }
}
