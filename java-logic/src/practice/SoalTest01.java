package practice;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class SoalTest01 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));
        int[] genap = DeretAngka.genapWithout0(n);

        int[][] a = new int[n][n];
        int rowIndex = 0;
        for (int i = 0; i < n; i++) {
            int colIndex = 0;
            for (int j = 0; j < n; j++) {
                if (j >= i && i + j < n) {
                    a[i][j] = genap[rowIndex];
                }
                if (i + j >= n-1 && j <= i){
                    a[i][j] = genap[rowIndex];
                }
                if (j <= i && i + j <= n-1){
                    a[i][j] = genap[colIndex];
                }
                if (i + j >= n-1 && j >= i){
                    a[i][j] = genap[colIndex];
                }
                if (j < n/2){
                    colIndex++;
                } else {
                    colIndex--;
                }
            }
            if (i < n/2){
                rowIndex++;
            } else {
                rowIndex--;
            }
        }
        PrintArray.printArray(a);
    }
}
