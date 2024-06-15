package first.Logic01;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal03 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] genap = DeretAngka.genap(n);
        PrintArray.printArray(genap);
    }
}
