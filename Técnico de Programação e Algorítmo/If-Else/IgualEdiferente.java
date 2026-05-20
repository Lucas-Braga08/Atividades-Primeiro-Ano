/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifeelse;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.*;

public class IgualEdiferente {
    public static void main(String[] args) {
        // Interface para poder digitar dois números
        String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
        String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");
        
        // Conversão dos números para inteiros
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        // Verificação da igualdade dos números
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Os números são iguais!");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são diferentes!");
        }
    }
}
