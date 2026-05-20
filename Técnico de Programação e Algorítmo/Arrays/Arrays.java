/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

/**
 *
 * @author Admin
 */
public class Arrays {

    public static void main(String[] args) {
        int[] vetor = {4, 3, 2, 1};
        int somaPar = 0;
        int somaImpar = 0;
        
        
         for(int i=0; i<vetor.length; i++){
             if(vetor[i] %2 == 0){
                 somaPar += vetor[i];
             }else{
                 somaImpar += vetor[i];
             }
             
             
         }        
         System.out.printf("A soma dos vetores pares é %d\n", somaPar);
             System.out.printf("A soma dos vetores impares é %d\n", somaImpar);
    }
}
