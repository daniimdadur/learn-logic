package second.logic01;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));
        int[] ganjil = DeretAngka.ganjil(n);

        int[] array = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (i < n/2 && n % 2 == 0){
                array[i] = ganjil[index];
                index++;
            } else if (i <= n/2 && n % 2 == 1) {
                array[i] = ganjil[index];
                if (i == n/2){

                } else {
                    index++;
                }
            } else {
                index--;
                array[i] = ganjil[index];
            }
        }
        PrintArray.printArray(array);
    }
}
