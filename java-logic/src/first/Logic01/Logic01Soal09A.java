package first.Logic01;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal09A {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] array = DeretAngka.geometri(n,4);
        PrintArray.printArray(array);
    }
}
