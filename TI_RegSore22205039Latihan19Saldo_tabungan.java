package ti_regsore.pkg22205039.latihan19.saldo_tabungan;

/*
NAMA    : Syahrul Izzazi
NIM     : 22205039
PRODI   : TI RegSore
DESKRIPSI : Menghitung saldo tabungan
*/

import java.text.DecimalFormat;
import java.util.Scanner;
public class TI_RegSore22205039Latihan19Saldo_tabungan {
   public static void main(String[] args){
    Scanner inputan = new Scanner(System.in);
        int saldoAwal, bungaPerBulan, lamaBulan;
        System.out.print("Saldo awal: Rp. ");
        saldoAwal = inputan.nextInt();
        System.out.print("Bunga per bulan (%): ");
        bungaPerBulan = inputan.nextInt();
        System.out.print("Lama (bulan): ");
        lamaBulan = inputan.nextInt();

        for (int i = 1; i <= lamaBulan; i++) {
            saldoAwal = saldoAwal + (saldoAwal * bungaPerBulan / 100);
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            String formattedsaldoAwal = decimalFormat.format(saldoAwal);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + formattedsaldoAwal);
        }
    }
}
