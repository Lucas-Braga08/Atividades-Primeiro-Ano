/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioslaco;

/**
 *
 * @author lucas
 */
public class Numeros1a30 {
    public static void main(String[] args) {
        System.out.println("Números de 1 a 30:");

        for (int i = 1; i <= 30; i++) {
        
            if (i % 4 == 0) { 
                continue; 
            }
            System.out.println(i);
        }
    }
}

