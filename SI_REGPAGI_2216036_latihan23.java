/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_2216036_latihan23;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SI_REGPAGI_2216036_latihan23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("-----Program Nilai Terbesar dan Terkecil Nilai Mahasiswa-----");
        System.out.print("Masukkan Nama Petugas : ");
        String name = input.nextLine();

        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int n = input.nextInt();

        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }

        int max = nilai[0];
        int min = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        System.out.println("-----Hasil Nilai Mahasiswa-----");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = " + nilai[i]);
        }
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
        System.out.println("Petugas " + name);
    }
    }
    

