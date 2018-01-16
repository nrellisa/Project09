/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer_User
 */
import java.util.Scanner;
public class aktiviti184 {
    public static void main(String[] args){
        System.out.println("BILIK : 1 pintu, 2 tingkap sama saiz, 4 sisi dingidng sama saiz");
        System.out.println("Unit Ukuran : Meter");
        
        Scanner data = new Scanner(System.in);
        
        System.out.println("Masukkan tinggi pintu : ");
        int tinggi_pintu = data.nextInt();
        System.out.println("Masukkan lebar pintu : ");
        int lebar_pintu = data.nextInt();
        
        System.out.println("Masukkan tinggi tingkap : ");
        int tinggi_tingkap = data.nextInt();
        System.out.println("Masukkan lebar tingkap : ");
        int lebar_tingkap = data.nextInt();
        
        System.out.println("Masukkan tinggi dinding : ");
        int tinggi_dinding = data.nextInt();
        System.out.println("Masukkan lebar dinding : ");
        int lebar_dinding = data.nextInt();
        
        int luas_pintu, luas_tingkap, luas_dinding, luas_dinding_keseluruhan;
            luas_pintu = tinggi_pintu * lebar_pintu;
            luas_tingkap = tinggi_tingkap * lebar_tingkap * 2;
            luas_dinding = tinggi_dinding * lebar_dinding * 4;
            luas_dinding_keseluruhan = luas_dinding - (luas_pintu + luas_tingkap);
            
            System.out.println(" ");
            System.out.println("Luas 1 Pintu = " + luas_pintu + " meter persegi");
            System.out.println("Luas 2 Tingkap = " + luas_tingkap + " meter persegi");
            System.out.println("Luas Dinding Keseluruhan = " + luas_dinding_keseluruhan + " meter persegi");
    }
}
