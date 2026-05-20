/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylist;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class ProdutosLimpeza {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double[] precos = new double[4];
        double total = 0;

        System.out.println("Digite o preço dos 4 produtos de limpeza:");

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = leia.nextDouble();
            total += precos[i];
        }

        System.out.println("\nValor total da compra: R$ " + total);

        leia.close();
    }
}


