package br.com.dio.Exercicios.DesafiosBasico;

/*Dado um número A e o seu limite N, encontre a soma
* de todos os múltiplos A até o seu limite N*/

import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A;
        int N;
        int soma = 0;

        A = scan.nextInt();
        N = scan.nextInt();

        for (int i = A; i <= N; i += A){
            soma += i;
        }

        System.out.println(soma);
    }
}
