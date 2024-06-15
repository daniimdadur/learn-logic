package first.Logic01;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal05A {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] fibo3 = DeretAngka.fibo(n,3);
        PrintArray.printArray(fibo3);

    }
}
