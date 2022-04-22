/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.decision_if_else;

/**
 *
 * @author daffa
 */
import java.util.Scanner;

public class Decision_if_else {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a, b;
        System.out.print("masukkan angka pertama : ");
        a = input.nextDouble();
        System.out.print("masukkan angka kedua : ");
        b = input.nextDouble();
        
        if(a > b){
            System.out.println("angka pertama lebih besar dari angka kedua");
        }
        else{
            System.out.println("angka pertama lebih kecil dari angka kedua");
        }
    }
}
