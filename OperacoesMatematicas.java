/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematicas;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class OperacoesMatematicas {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Definição das variáveis
        double num1=20;
        double num2=10;
        double b=5; //variável para o quadrado
        double h=12; //variável para o quadrado
        double b2=10; //variável para o retângulo
        double h2=2; //variável para o retângulo   
        double D=4; //variável para o losango
        double d=2; //variável para o losango
        double b3=3; //variável para o triângulo
        double h3=5; //variável para o triângulo        
        double pi=3.14; //variável para a circunferência
        double r=84; //variável para a circunferência
        double n=2; //número de variáveis
                
        // Realizando operações matemáticas
        double areaquadrado = b * h; //"b" representa base de um quadrado e "h" representa altura de um quadrado
        double arearetangulo = b2 * h2; //"b2" reprenta a base de um retângulo e "h2" a altura de um retângulo
        double arealosango = (D * d)/2; //"D" representa a diagonal maior e "d" a diagonal menor 
        double areatriangulo = (b3 * h3)/2; //"b3" representa a base de um triângulo e "h3" representa a altura de um triângulo
        double areacircunferencia = pi * r; //"pi" representa a letra grega pi, com valor fixo 3,14 e "r" representa o raio, o qual tem que ser feito ao quadrado
        double media = (num1 + num2)/n; //"num1" representa a primeira variável, "num2" a segunda variável e "n" o número de variáveis
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN; // Evita divisão por zero

        // Resultado das operações
        System.out.println("Resultados das operações:");
        System.out.println("Área do quadrado" + areaquadrado);
        System.out.println("Área do retângulo" + arearetangulo);
        System.out.println("Área do losango" + arealosango);
        System.out.println("Área do triângulo" + areatriangulo);
        System.out.println("Área da circunferência" + areacircunferencia);
        System.out.println("Média" + media);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 != 0 ? divisao : "Indefinida (divisão por zero)"));
    }
}
