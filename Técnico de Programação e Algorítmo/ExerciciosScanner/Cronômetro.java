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

public class Cronômetro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite até que número o cronômetro deve ir: ");
        int limite = entrada.nextInt();

        System.out.println("\nIniciando cronômetro...");

        for (int i = 0; i <= limite; i++) {
            
            if (i == 1) {
                System.out.println(i + " segundo");
            } else {
                System.out.println(i + " segundos");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Cronômetro finalizado");
    }
}

