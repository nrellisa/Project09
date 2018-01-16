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
public class aktiviti36 {
public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    String nama;
    int umur;
    double harga = 0.00;
    char jawap;
    
    System.out.print("Masukkan nama penuh anda: ");
    nama=input.nextLine();
    
    System.out.print("Mempunyai kad ahli (Y/T)");
    jawap=input.findInLine(".").charAt(0);
    
    System.out.print("Masukkan umur anda sekarang: ");
    umur=input.nextInt();
    
    if (umur >= 12 || umur < 65){
        harga=9.25;
    }
    if (umur < 12 || umur >= 65){
        harga=5.25;
    }
    if ((jawap == 'Y' || jawap == 'y')|| (umur >= 12 && umur <65)){
        harga=2.00;
    }
    System.out.println("Sila bayar sebanyak RM"+harga+".\nSelamat menonton");
}

}
