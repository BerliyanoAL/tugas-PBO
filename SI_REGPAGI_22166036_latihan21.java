/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166036_latihan21;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SI_REGPAGI_22166036_latihan21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int n = input.nextInt();

        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nilai[i];
        }

        double average = (double) sum / n;
        System.out.println("Rata-rata nilai mahasiswa adalah: " + average);
    }
}
    
    

