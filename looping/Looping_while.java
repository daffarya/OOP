/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.looping_while;

/**
 *
 * @author daffa
 */
import java.util.Scanner;

public class Looping_while {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, total;
        System.out.print("masukkan nilai awal: ");
        a = input.nextInt();
        System.out.print("masukkan nilai akhir: ");
        b = input.nextInt();
        total = 0;
        
        while(a <= b){
            total = total + a;
            System.out.println("nilai ditambah "+a+" menjadi "+total);
            a++;
        }
    }
}
