
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan saldo.
 *  
 */

package pbo1.pkg10118033.latihan42;

import java.util.Scanner;

public class PBO110118033Latihan42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Program Penarikan Uang===");
        System.out.print("Masukkan saldo awal : ");        
        Tabungan tabungan = new Tabungan(sc.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        System.out.println("Saldo Anda sekarang : "+tabungan.ambilUang(sc.nextInt()));
        System.out.println("(Developed By : Ikrar AB)");
    }
}