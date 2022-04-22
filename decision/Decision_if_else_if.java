/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.decision_if_else_if;

/**
 *
 * @author daffa
 */
import java.util.Scanner;

public class Decision_if_else_if {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a, b, c, rata_rata;
        System.out.print("masukkan nilai matkul a: ");
        a = input.nextDouble();
        System.out.print("masukkan nilai matkul b: ");
        b = input.nextDouble();
        System.out.print("masukkan nilai matkul c: ");
        c = input.nextDouble();
        rata_rata = (a + b + c)/3;
        if(a < 50){
            System.out.println("Hasil: Maaf, kamu tidak lulus");
        }
        else if(b < 50){
            System.out.println("Hasil: Maaf, kamu tidak lulus");
        }
        else if(c < 50){
            System.out.println("Hasil: Maaf, kamu tidak lulus");
        }
        else if(rata_rata < 70){
            System.out.println("Hasil: Maaf, kamu tidak lulus");
        }
        else{
            System.out.println("Hasil: Selamat, kamu lulus");
        }
    }
}
