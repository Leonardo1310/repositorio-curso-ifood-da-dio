package br.com.dio.Exercicios.Desafios;

/*Uma busca sequencial se caracteriza por percorrermos todos os  elementos de
uma estrutura em busca do elemento “X” desejado.  Neste desafio, dada uma estrutura de vetor A [a1, a2...an],
percorra o vetor fazendo as comparações de A[N] = X. Caso a condição seja verdadeira, “X” existe na estrutura
e a busca será concluída com sucesso.*/

/*Considere um array de 10 elementos do tipo inteiro:
*   {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}.
 *  Carregue esses elementos em um array. Implementação da busca sequencial:
 *  Crie um método  que realiza uma busca sequencial.*/

/*Se o valor constar no array, retorne um texto contendo o valor e sua respectiva posição no array.
Caso contrario retorne um texto dizendo que o número não foi encontrado.*/

import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();

        buscaOrdenada(X);
    }

    public static void buscaOrdenada(int X){
        int[] vetor = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        for (int i = 0; i < vetor.length; i++) {
            if (X == vetor[i]) {
                System.out.println("Achei " + X + " na posicao " + i);
                break;
            } else if (i == vetor.length-1 && X != vetor[i]) {
                System.out.println("Numero " + X + " nao encontrado!");
            }
        }
    }
}
