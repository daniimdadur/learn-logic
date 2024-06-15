package second.logic01;

import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] bil = new int[n];
        for (int i = 0; i < n; i++) {
            bil[i] = i * 3 + 3;
        }
        int[] array = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (i < n/2){
                array[i] = bil[index];
                index++;
            } else if (n % 2 == 0) {
                array[i] = bil[index - 1];
                index--;
            } else {
                array[i] = bil[index];
                index--;
            }
        }
        PrintArray.printArray(array);
    }
}
