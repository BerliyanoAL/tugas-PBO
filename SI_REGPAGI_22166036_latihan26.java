/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166036_latihan26;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ASUS
 */
public class SI_REGPAGI_22166036_latihan26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");

        String formattedTime = now.format(formatter);
        System.out.println("Hari ini adalah hari " + formattedTime);
    }
}

    
    

