package com.henrizampacheco.java.exercicio04matrizes;

import java.util.Scanner;

/**Capture do teclado valores para o preenchimento de uma
 * matriz M 3x3. Após a captura imprima a matriz criada e
 * encontre a quantidade de números pares e a quantidade de
 * números ímpares.
 */
public class Exercicio04Matrizes {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int contPares = 0;
        int contImpares = 0;
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                System.out.print("Informe o valor da linha " + (i+1) +
                        " coluna " + (j+1) + " da matriz: ");
                matriz[i][j] = scan.nextInt();
                if(matriz[i][j] % 2 == 0) {
                    contPares++;
                } else {
                    contImpares++;
                }
            }
        }
        
        System.out.println("");
        System.out.println("Matriz impressa:");
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Quantidade de números pares: " + contPares);
        System.out.println("Quantidade de números ímpares: " + contImpares);
    }
}