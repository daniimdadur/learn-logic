package second.logic03;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));
        int[] ganjil = DeretAngka.ganjil(n);

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            int index = 0;
            for (int j = 0; j < n; j++) {
                if (i < n/2){
                    if (i + j >= n/2 && j - i <= n/2){
                        arr[i][j] = ganjil[index];
                        if (j < n/2){
                            index++;
                        } else {
                            index--;
                        }
                    }
                }if (i >= n/2){
                    if (i + j <= n-1+n/2 && i - j <= n/2){
                        arr[i][j] = ganjil[index];
                        if (j < n/2){
                            index++;
                        } else {
                            index--;
                        }
                    }
                }
            }
        }
        PrintArray.printArray(arr);
    }
}
