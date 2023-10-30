/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166036_latihan19;

/**
 *
 * @author ASUS
 */
public class SI_REGPAGI_22166036_latihan19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Inisialisasi variabel
        double saldoAwal = 1500000;
        double bunga = 0.10;
        int lamaBulan = 6;
        
        // Hitung saldo akhir setiap bulan
        for (int i = 1; i <= lamaBulan; i++) {
            double saldoAkhir = saldoAwal + (saldoAwal * bunga);
            saldoAwal = saldoAkhir;
            System.out.printf("Saldo bulan ke-%d: Rp%,.2f\n", i, saldoAkhir);
}
        }
    }
    
    

