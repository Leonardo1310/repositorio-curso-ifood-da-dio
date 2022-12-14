package br.com.dio.Exercicios.Desafios;

/*Neste desafio, receba um número inteiro N,
 calcule e imprima o somatório de todos os números de N até 0.   */

import java.util.Scanner;

public class ChamadaRecursiva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N;
        N = scan.nextInt();
        System.out.println(somatorio(N));
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }

}
