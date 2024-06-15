package second.logic02;

import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] bil = new int[n*n];
        int value = 1;
        for (int i = 0; i < n*n; i++) {
            bil[i] = value;
            value += 3;
        }
        int[][] array = new int[n][n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = bil[index];
                index++;
            }
        }
        PrintArray.printArray(array);
    }
}
