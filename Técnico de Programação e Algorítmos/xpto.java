/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tiposprimitivos;

/**
 *
 * @author FATEC ZONA LESTE
 /* Eu, Lucas Braga, estou editando meu primeiro programa em JAVA feito no laboratório 111*/
public class xpto {
    public static void main(String[] args){
        // Declara os dados primitivos
        byte numeroalunos = 25;  // Armazena números de até 3 casas decimais (exemplo: -130 e 200)}
        short estoque = 4040; // Armazena valores um pouco maiores (exemplo: -32.767 a 32.767)
        int populacaoCidade = 500000; // O tipo mais comum para armazenamento de variáveis inteiras
        long populacaoMundial = 8000000000L; // Para valores longos, coloca-se L logo depois
       
        float altura = 1.75f; // Armazena altura e precisa de f no final para indicar float
        double peso = 72.5; // Seria uma variavel mais precisa que o float
       
        char inicial = 'L'; // Para armazenar apenas um cacactere
        boolean ativo = true; // Armazena e exibe valores verdadeiros ou falsos
       
        // Forma como se exibe os valores
        System.out.println("Quantidade de alunos: " + numeroalunos);
        System.out.println("Estoque de produtos: " + estoque);
        System.out.println("População da Cidade: " + populacaoCidade);
        System.out.println("Populaçao mundial: " + populacaoMundial);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Inicial do nome: L: " + inicial);
        System.out.println("Está ativo? " + ativo);
    }
}
