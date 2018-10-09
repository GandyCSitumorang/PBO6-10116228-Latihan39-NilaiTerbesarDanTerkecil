/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan39.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author GandyCS
 */
public class nilai {
    public int nilai[] = new int[100];
    public int nilaiBesar, nilaiKecil;

    public void inputNilai(int jmlMhs) {
        int i;
        Scanner scn = new Scanner(System.in);
        for (i = 1; i <= jmlMhs; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = scn.nextInt();
        }
    }

    public void tampilNilai(int jmlMhs) {
        int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= jmlMhs; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    }

    public void tampilNilaiTerbesarTerkecil(int jmlMhs) {
        int i;

        nilaiKecil = nilai[1];
        nilaiBesar = nilai[1];

        for (i = 1; i <= jmlMhs; i++) {
            if (nilai[i] > nilaiBesar) {
               nilaiBesar = nilai[i];
            } else if (nilai[i] < nilaiKecil) {
                nilaiKecil = nilai[i];
            }
        }
    }
}
