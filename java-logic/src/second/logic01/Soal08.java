package second.logic01;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));
        int[] genap = DeretAngka.genapWithout0(n);

        int[] array = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (i < n/2) {
                array[i] = genap[index];
                index++;
            } else if (n % 2 == 0) {
                array[i] = genap[index - 1];
                index--;
            } else {
                array[i] = genap[index];
                index--;
            }
        }
        PrintArray.printArray(array);
    }
}