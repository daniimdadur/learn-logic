package second.logic03;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));
        int[] genap = DeretAngka.genap(n);
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][0] = String.valueOf(genap[0]);
            arr[i][n-1] = String.valueOf(genap[n-1]);
            arr[0][i] = String.valueOf(genap[i]);
            arr[n-1][i] = String.valueOf(genap[i]);
            arr[i][i] = String.valueOf(genap[i]);
            arr[n-1-i][i] = String.valueOf(genap[i]);
        }
        PrintArray.printArray(arr);
    }
}
