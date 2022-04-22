/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.decision_nested_if;

/**
 *
 * @author daffa
 */
public class Decision_nested_if {

    public static void main(String[] args) {
        int a = 10, b = 14;
        if(a == 10){
            if(b == 14){
                System.out.println("a = 10, b = 14");
            }
            else{
                System.out.println("a = 10, b != 14");
            }
        }
        else{
            System.out.println("a != 10, b!= 14");
        }
    }
}
