package second.logic01;

import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] deretBil = new int[n];
        for (int i = 0; i < n; i++) {
            deretBil[i] = i * 3 + 3;
        }
        PrintArray.printArray(deretBil);
    }
}
