package second.logic02;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value n: ");
        int n = sc.nextInt();

        int[] ganjil = new int[n];
        for (int i = 0; i < n; i++) {
            ganjil[i] = i * 2 + 1;
        }

        String[][] array = new String[n][n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = String.valueOf(ganjil[index]);
                index++;
            }
            index = 0;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == null){
                    System.out.print("\t");
                    continue;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
