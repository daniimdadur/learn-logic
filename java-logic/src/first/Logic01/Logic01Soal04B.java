package first.Logic01;

import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal04B {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] fibonacci = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2){
                fibonacci[i] = 1;
                continue;
            }
            int result = 0;
            for (int j = 1; j <= 2; j++) {
                result += fibonacci[i-j];
            }
            fibonacci[i] = result;
        }
        PrintArray.printArray(fibonacci);
    }
}
