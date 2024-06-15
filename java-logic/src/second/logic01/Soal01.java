package second.logic01;

import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] ganjil = new int[n];
        for (int i = 0; i < n; i++) {
            ganjil[i] = i * 2 + 1;
        }
        PrintArray.printArray(ganjil);
    }
}
