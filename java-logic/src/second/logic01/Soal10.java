package second.logic01;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nilai n: ");
        int n = sc.nextInt();

        int[] deretBil = new int[n];
        int value = 2;
        for (int i = 0; i < n; i++) {
            deretBil[i] = value;
            value *= 2;
        }

        String[] array = new String[n];
        int index = 0;
        String fizz = "fizz";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                array[i] = String.valueOf(deretBil[index]);
                index++;
            } else {
                array[i] = fizz;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
