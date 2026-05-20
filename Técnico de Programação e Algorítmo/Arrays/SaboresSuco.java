/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylist;

/**
 *
 * @author lucas
 */
import java.util.ArrayList;
import java.util.Scanner;

public class SaboresSuco {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        ArrayList<String> sabores = new ArrayList<>();

        System.out.println("Digite 3 sabores de suco que você gosta:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Sabor " + (i + 1) + ": ");
            sabores.add(leia.nextLine());
        }

        System.out.println("\nSabores digitados:");
        for (int i = 0; i < sabores.size(); i++) {
            System.out.println((i + 1) + ". " + sabores.get(i));
        }

        leia.close();
    }
}
