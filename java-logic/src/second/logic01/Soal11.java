package second.logic01;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = sc.nextInt();

        int[] deretBil = new int[n];
        int firstValue = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0){
                deretBil[i] = firstValue;
                firstValue+=2;
            } else {
                deretBil[i] = firstValue;
                firstValue += firstValue;
            }
        }
        String[] array = new String[n];
        int index = 0;
        String info = "Buzz";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1){
                array[i] = String.valueOf(deretBil[index]);
                index++;
            } else {
                array[i] = info;
            }
        }

        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + "\t");
        }
    }
}
