package first.Logic01;

import java.util.Scanner;

public class Logic01Soal01A {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai n: ");
        int n = scanner.nextInt();

        int[] angkaGanjil = new int[n];
        for (int i = 0; i < n; i++) {
            angkaGanjil[i] = 3 * i + 3;
        }
        int[] array = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            //validasi untuk bil genap
            if (n % 2 == 0) {
                array[i] = angkaGanjil[index];
                if (i < n/2-1){
                    index++;
                }if (i > n/2-1){
                    index--;
                }
            }
            //validasi untuk bil ganjil
            else {
                array[i] = angkaGanjil[index];
                if (i < n/2){
                    index++;
                }if (i > n/2-1){
                    index--;
                }
            }
        }
        //print array
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + "\t");
        }
    }
}
