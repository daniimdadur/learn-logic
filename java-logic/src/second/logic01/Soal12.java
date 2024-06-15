package second.logic01;

import java.util.Scanner;

public class Soal12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = sc.nextInt();

        int[] bilGanjil = new int[n];
        for (int i = 0; i < n; i++) {
            bilGanjil[i] = i * 2 + 1;
        }
        int[] array = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            array[i] = bilGanjil[index];
            if (index < 3){
                index++;
            } else {
                index = 0;
            }
        }
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + "\t");
        }
    }
}
