package second.logic01;

import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] genap = new int[n];
        for (int i = 0; i < n; i++) {
            genap[i] = 2 * i + 2;
        }
        PrintArray.printArray(genap);
    }
}
