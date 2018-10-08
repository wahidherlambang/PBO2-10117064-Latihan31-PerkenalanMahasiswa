/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan31.perkenalanmahasiswa;

/**
 *
 * @author WAHID HERLAMBANG
 */
public class PBO210117064Latihan31ObjectOrientedPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "10117064";
        mhs.nama = "Wahid Herlambang Suroso";
        mhs.perkenalkanDiri(mhs.nim, mhs.nama);
        
        System.out.println();
        
        mhs.nim = "10117080";
        mhs.nama = "Zulfi";
        mhs.perkenalkanDiri(mhs.nim, mhs.nama);
    }
}