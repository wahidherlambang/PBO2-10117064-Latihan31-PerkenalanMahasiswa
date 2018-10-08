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
public class Mahasiswa {
    public String nim;
    public String nama;
    
    public void perkenalkanDiri(String nim, String nama) {
        System.out.println("Hallo Everyone ");
        System.out.println("My NIM is " + nim);
        System.out.println("My Name is " + nama);
    }
}