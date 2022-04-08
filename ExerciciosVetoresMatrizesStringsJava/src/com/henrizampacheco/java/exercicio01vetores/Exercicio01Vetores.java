package com.henrizampacheco.java.exercicio01vetores;

import java.util.Scanner;

/**Desenvolva um programa que leia 10 nomes,
 * armazene num vetor (de Strings) e depois percorra
 * esse vetor escrevendo os nomes presentes nele.
 */
public class Exercicio01Vetores {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<nomes.length; i++) {
            System.out.print("Informe o " + (i+1) + "º. nome: ");
            nomes[i] = scan.nextLine();
        }
        
        System.out.println("");
        System.out.println("Lista de presença:");
        for(String nome: nomes) {
            System.out.println("Nome: " + nome);
        }
    }
}
