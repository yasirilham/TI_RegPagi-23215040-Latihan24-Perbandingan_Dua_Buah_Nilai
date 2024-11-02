/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_LATIHAN_PERTEMUAN_6;

/**
 *
 * @author ACER
 * NAMA : M YASIR ILHAM N
 * KELAS : PBO1
 * NIM : 23215040
 * DESKRIPSI PROGRAM : Membuat Program Perbandingan Dua Buah Nilai
 */
import java.util.Scanner;
public class Latihan24_Perbandingan_Dua_Buah_Nilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("=====Program Perbandingan Nilai=====");
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = scanner.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = scanner.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil: " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.print("\nUlangi Aktivitas? (Ya/Tidak): ");
            ulang = scanner.next();

        } while (ulang.equalsIgnoreCase("Ya"));

        System.out.println("Program selesai.");
    }
}
