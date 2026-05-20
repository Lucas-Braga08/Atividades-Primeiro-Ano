/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylist;

/**
 *
 * @author lucas
 */
public class Meias {
    public static void main(String[] args) {

        int[] meias = {2, 4, 1, 3, 5};
        int total = 0;

        for (int i = 0; i < meias.length; i++) {
            total += meias[i];
        }

        System.out.println("Total de meias: " + total);
    }
}

