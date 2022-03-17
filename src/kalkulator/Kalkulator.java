/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author JaneshPutra
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("masukkan nilai pertama");
         int angka_pertama=input.nextInt();
          System.out.println("masukkan nilai kedua");
         int angka_kedua=input.nextInt();
         
//         perhitungan
         int tambah=angka_pertama+angka_kedua;
          int kurang=angka_pertama-angka_kedua;
          int kali=angka_pertama*angka_kedua;
           int bagi=angka_pertama/angka_kedua;
             int modulus=angka_pertama%angka_kedua;
             
             System.out.println("tambah :"+tambah);
         System.out.println("kurang :"+kurang);
         System.out.println("kali :"+kali);
         System.out.println("bagi : "+bagi);
        System.out.println("modulus :"+modulus);
               
    }
    
}

