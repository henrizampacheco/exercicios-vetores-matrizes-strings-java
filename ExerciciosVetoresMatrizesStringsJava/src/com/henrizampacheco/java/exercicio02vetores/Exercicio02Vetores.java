package com.henrizampacheco.java.exercicio02vetores;

import java.util.Scanner;

/**Desenvolva um programa que leia 10 idades,
 * armazene num vetor (int) e depois percorra esse
 * vetor calculando a média das idades.
 */
public class Exercicio02Vetores {
    public static void main(String[] args) {
        int[] idades = new int[10];
        double resultado = 0;
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<idades.length; i++) {
            System.out.print("Informe a " + (i+1) + "ª. idade: ");
            idades[i] = scan.nextInt();
        }

        for(int i=0; i<idades.length; i++) {
            resultado += idades[i];
        }

        resultado = resultado / idades.length;

        System.out.println("");
        System.out.println("A média das idades é: " + resultado);
    }
}
