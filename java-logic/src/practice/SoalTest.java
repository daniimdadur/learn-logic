package practice;

import java.util.Scanner;

public class SoalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = scanner.nextInt();

        int[] deretBil = new int[n];
        int firstValue = 0;
        for (int i = 0; i < n; i++) {
            if (firstValue == 0){
                deretBil[i] = firstValue += 2;
            } else {
                deretBil[i] = firstValue *= 2;
            }
        }

        String[] array = new String[n];
        int index = 0;
        String info = "fizz";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                array[i] = String.valueOf(deretBil[index]);
                index++;
            }else {
                array[i] = info;
            }
        }
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + "\t");
        }
    }
}
