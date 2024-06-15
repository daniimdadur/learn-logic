package first.Logic01;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal10A {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] array = DeretAngka.pangkat(n,3);
        PrintArray.printArray(array);
    }
}
