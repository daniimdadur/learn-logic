package first.Logic01;

import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal01 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]= i + 1;
        }
        PrintArray.printArray(array);
    }
}
