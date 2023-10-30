/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166036_latihan27;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SI_REGPAGI_22166036_latihan27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String sentence = input.nextLine();

        String uppercase = sentence.toUpperCase();
        String lowercase = sentence.toLowerCase();

        System.out.println("----Hasil Formatting----");
        System.out.println("Huruf Besar : " + uppercase);
        System.out.println("Huruf Kecil : " + lowercase);
    }
}

    
    

