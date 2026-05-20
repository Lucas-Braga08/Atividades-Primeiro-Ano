/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioslaco;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 10: ");
            int numero = entrada.nextInt();
            
            System.out.println("Tabuada do " + numero + ":");
            
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }
    }
}