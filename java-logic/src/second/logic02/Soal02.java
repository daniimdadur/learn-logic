package second.logic02;

import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));
        int[] genap = new int[n];
        for (int i = 0; i < n; i++) {
            genap[i] = i * 2 + 2;
        }

        String[][] array = new String[n][n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = String.valueOf(genap[index]);
                index++;
            }
            index = 0;
        }
        PrintArray.printArray(array);
    }
}
