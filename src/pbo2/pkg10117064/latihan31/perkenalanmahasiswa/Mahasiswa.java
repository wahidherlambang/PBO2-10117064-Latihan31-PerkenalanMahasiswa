/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan31.perkenalanmahasiswa;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menampilkan 
 * perkenalan mahasiswa.
 */
public class Mahasiswa {
    public String nim;
    public String nama;
    
    public void perkenalkanDiri(String nim, String nama) {
        System.out.println("Hallo Everyone ");
        System.out.println("My NIM is " + nim);
        System.out.println("My Name is " + nama);
    }
}