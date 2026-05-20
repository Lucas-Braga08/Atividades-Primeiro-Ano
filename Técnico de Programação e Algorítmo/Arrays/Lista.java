/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lista {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    
        String[] amigos = new String[2];
        System.out.println("Digite o nome de 2 amigos");
    for (int i = 0; i < amigos.length; i++) {
        System.out.printf(" Digite o nome do amigo %d:", (i+1));
        amigos[i] = leia.nextLine();       
     }
    System.out.println("Sua lista de Amigos é");
        for (int cont = 0; cont<amigos.length; cont++) {
            System.out.printf("%d. %s\n",cont+1, amigos[cont]);
        }
    leia.close();
    }
}