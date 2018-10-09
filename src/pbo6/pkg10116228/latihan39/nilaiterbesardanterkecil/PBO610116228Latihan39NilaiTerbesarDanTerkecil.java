/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan39.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author
 * Nama     : Gandy Christian Situmorang
 * Kelas    : PBO-6
 * NIM      : 10116228
 * Deskripsi Program : program ini berisi program nilai terbesar dan terkecil
 * nilai mahasiswa
 */
public class PBO610116228Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String namaPetugas;
        int jmlMhs;

        nilai hasil = new nilai();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        jmlMhs = scanner.nextInt();
        System.out.println();

        hasil.inputNilai(jmlMhs);
        System.out.println();
        hasil.tampilNilaiTerbesarTerkecil(jmlMhs);

        System.out.println("Nilai Terbesar : " + hasil.nilaiBesar);
        System.out.println("Nilai Terkecil : " + hasil.nilaiKecil);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }
    
}
