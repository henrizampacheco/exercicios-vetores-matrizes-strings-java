package com.henrizampacheco.java.exercicio05matrizes;

import java.util.Scanner;

/**Faça um programa para jogar o jogo da velha. O programa
 * deve permitir que dois jogadores façam uma partida do jogo
 * da velha, usando o computador para ver o tabuleiro. Cada
 * jogador vai alternadamente informando a posição onde
 * deseja colocar a sua peça (‘O’ ou ‘X’). O programa deve
 * impedir jogadas inválidas e determinar automaticamente
 * quando o jogo terminou e quem foi o vencedor (jogador1 ou
 * jogador2). A cada nova jogada, o programa deve atualizar a
 * situação do tabuleiro na tela.
 */
public class Exercicio05Matrizes {
    public static void main(String[] args) {
        String[][] tabuleiro = { {"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"} };
        Scanner scan = new Scanner(System.in);
        boolean ganhador = false;
        int jogador = 1;
        String numEscolhido = "0";
        String sinal;
        boolean jogadaValida;
        int contEmpate = 0;
        boolean empate = false;
        
        System.out.println("Jogo da Velha");
        System.out.println("");
        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");
        System.out.println("");
        
        // Inicializar o tabuleiro
        for(int i=0; i<tabuleiro.length; i++) {
            for(int j=0; j<tabuleiro[i].length; j++) {
                System.out.print(" " + tabuleiro[i][j] + " ");
            }
            System.out.println("");
        }        
        System.out.println("");
        
        while(!ganhador) {
            jogadaValida = false;
            
            if(jogador == 1) { // Jogador 1
                System.out.println("Vez do Jogador 1!");
                sinal = "X";
                jogador++;
            } else { // Jogador 2
                System.out.println("Vez do Jogador 2!");
                sinal = "O";
                jogador--;
            }
            
            while(!jogadaValida) {
                System.out.print("Escolha um número do tabuleiro: ");
                numEscolhido = scan.nextLine();
                
                for(int i=0; i<tabuleiro.length; i++) {
                    for(int j=0; j<tabuleiro[i].length; j++) {
                        if(tabuleiro[i][j].equals(numEscolhido)){
                            tabuleiro[i][j] = sinal;
                            jogadaValida = true;
                        }
                    }
                }
                if(!jogadaValida) {
                    System.out.println("Oops! Este valor já foi preenchido. Tente outro!");
                }
            }
            
            System.out.println("");
            // Imprimir o tabuleiro
            for(int i=0; i<tabuleiro.length; i++) {
                for(int j=0; j<tabuleiro[i].length; j++) {
                    System.out.print(" " + tabuleiro[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
            
            // Verificar se há ganhador ou se empatou
            if(tabuleiro[0][0].equals(tabuleiro[0][1]) && tabuleiro[0][0].equals(tabuleiro[0][2])) {
                ganhador = true;
                informarVencedor();
            } else if (tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[0][0].equals(tabuleiro[2][2])) {
                ganhador = true;
                informarVencedor();
            } else if (tabuleiro[0][0].equals(tabuleiro[1][0]) && tabuleiro[0][0].equals(tabuleiro[2][0])) {
                ganhador = true;
                informarVencedor();               
            } else if (tabuleiro[1][0].equals(tabuleiro[1][1]) && tabuleiro[1][0].equals(tabuleiro[1][2])) {
                ganhador = true;
                informarVencedor();                
            } else if (tabuleiro[2][0].equals(tabuleiro[2][1]) && tabuleiro[2][0].equals(tabuleiro[2][2])) {
                ganhador = true;
                informarVencedor();   
            } else if (tabuleiro[2][0].equals(tabuleiro[1][1]) && tabuleiro[2][0].equals(tabuleiro[0][2])) {
                ganhador = true;
                informarVencedor(); 
            } else if (tabuleiro[0][2].equals(tabuleiro[1][2]) && tabuleiro[0][2].equals(tabuleiro[2][2])) {
                ganhador = true;
                informarVencedor();
            } else {
                contEmpate++;
                if(contEmpate > 9) {
                    empate = true;
                    System.out.println("O jogo empatou!");
                }
            }
        }
    }
    
    public static void informarVencedor() {
        System.out.println("Parabéns, você venceu!");
    }
}
