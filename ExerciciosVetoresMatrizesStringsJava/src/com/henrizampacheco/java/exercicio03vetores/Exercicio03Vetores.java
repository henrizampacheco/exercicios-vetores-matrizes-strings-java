package com.henrizampacheco.java.exercicio03vetores;

import java.util.Scanner;

/**Desenvolva um programa que leia 10 salários,
 * armazene num vetor (double) e depois percorra
 * esse vetor identificando qual o índice do maior
 * salário.
 */
public class Exercicio03Vetores {
    public static void main(String[] args) {
        double[] salarios = new double[10];
        double maiorSalario = 0;
        int indice = 0;
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<salarios.length; i++) {
            System.out.print("Informe o salário do índice " + i + ": ");
            salarios[i] = Double.parseDouble(scan.nextLine());
        }

        for(int i=0; i<salarios.length; i++) {
            if(maiorSalario < salarios[i]) {
                maiorSalario = salarios[i];
                indice = i;
            }
        }

        System.out.println("");
        System.out.println("O maior salário está no índice: " + indice);
        System.out.println("E o valor é: R$ " + maiorSalario);
    }
}
