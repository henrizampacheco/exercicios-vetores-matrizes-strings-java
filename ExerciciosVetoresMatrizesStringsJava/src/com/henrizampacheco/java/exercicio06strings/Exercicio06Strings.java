package com.henrizampacheco.java.exercicio06strings;

import java.util.Scanner;

/**Faça um programa que, a partir de uma string digitada pelo usuário, imprima:
 * a) O número de caracteres da string.
 * b) A string com todas suas letras em maiúsculo.
 * c) O número de vogais da string.
 * d) Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas).
 * e) Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas).
 * f) O número de dígitos (0 a 9) da string.
 * g) Se a string é um palíndromo ou não.
 */
public class Exercicio06Strings {
    public static void main(String[] args) {
        String stringUsuario, stringAux, stringAuxInv;
        Scanner scan = new Scanner(System.in);
        int contVogais = 0;
        int contDigitos = 0;
        StringBuilder stringInvertida;
        boolean ePalindromo;

        System.out.print("Digite uma string: ");
        stringUsuario = scan.nextLine();
        System.out.println("");

        System.out.println("a) O número de caracteres da string: " + stringUsuario.length());
        System.out.println("b) A string com todas suas letras em maiúsculo: " + stringUsuario.toUpperCase());
        
        // Verificar se há vogais na string que o usuário digitou
        stringAux = stringUsuario.toLowerCase();
        for(int i=0; i<stringAux.length(); i++){
            char letraString = stringAux.charAt(i);
            if(letraString == 'a' || letraString == 'e' || letraString == 'i' ||
                    letraString == 'o' || letraString == 'u') {
                contVogais++;
            }  
        }
        System.out.println("c) O número de vogais da string: " + contVogais);
        
        stringAux = stringUsuario.toUpperCase();
        System.out.println("d) Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas): "
                + stringUsuario.startsWith("UNI"));
        System.out.println("e) Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas): "
                + stringUsuario.endsWith("RIO"));
        
        // Verificar se há dígitos numéricos na string informada
        for(int i=0; i<stringAux.length(); i++){
            char digitoString = stringAux.charAt(i);
            if(digitoString == '0' || digitoString == '1' || digitoString == '2' || digitoString == '3'
                    || digitoString == '4' || digitoString == '5' || digitoString == '6' || digitoString == '7'
                    || digitoString == '8' || digitoString == '9') {
                contDigitos++;
            }
        }
        
        System.out.println("f) O número de dígitos (0 a 9) da string: " + contDigitos);
        
        // Verificar se a string é um palíndromo
        stringAux = stringUsuario.replace(" ", "");
        stringAuxInv = stringUsuario.replace(" ", "");
        stringInvertida = new StringBuilder(stringAuxInv);
        stringAuxInv = stringInvertida.reverse().toString();
        ePalindromo = stringAuxInv.equals(stringAux);
        
        System.out.println("g) Se a string é um palíndromo ou não: " + ePalindromo);
        System.out.println("");
    }
}