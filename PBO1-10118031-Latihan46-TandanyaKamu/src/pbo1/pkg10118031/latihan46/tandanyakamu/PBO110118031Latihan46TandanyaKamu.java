package pbo1.pkg10118031.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk Menandakan bahwa kamu 
 */
public class PBO110118031Latihan46TandanyaKamu {

    public static void main(String[] args) {

        Age age = new Age(2019);

        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scn.nextInt());

        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth(0));
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu : " + age.tandanyaKamu(age.hitungUmur()));
    }

}
