/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ifeelse;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.*;

public class MaiorOuMenorQue {
    public static void main(String[] args) {
        // Interface para poder digitar dois números
        String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
        String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");
        
        // Conversão para números inteiros
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        // Comparação se o primeiro número é maior que o segundo
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "O primeiro número é maior que o segundo");
        } else {
            JOptionPane.showMessageDialog(null, "O primeiro número é menor que o segundo");
        }
    }
}

