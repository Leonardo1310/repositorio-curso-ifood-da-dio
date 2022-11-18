package br.com.dio.Exercicios.Desafios;

/* Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n.
Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras,
é o produto de algum inteiro consigo mesmo. Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos,
enquanto 3 e 11 não são. */

import java.util.Scanner;

public class QuadradosPerfeitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(quadradoPerfeito(n));

    }

    public static int quadradoPerfeito(int n){
        int cont = 0;
        for (int i = n; i > 0; i--) {
            if(Math.sqrt(i) == (int)Math.sqrt(i)){
                int soma = 0;
                while(soma+i <= n){
                    soma += i;
                    cont++;
                    n = n - soma;
                }
            }
        }
        return cont;
    }
}
