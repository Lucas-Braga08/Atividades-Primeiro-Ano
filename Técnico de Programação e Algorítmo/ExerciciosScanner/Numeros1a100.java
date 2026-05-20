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

public class Numeros1a100 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de 1 a 100 para ser o intervalo: ");
        int salto = entrada.nextInt();

        System.out.println("\nContando de 1 a 100, pulando de " + salto + " em " + salto + ":");

        for (int i = 1; i <= 100; i += salto) {
            System.out.println(i);
        }
    }
}

