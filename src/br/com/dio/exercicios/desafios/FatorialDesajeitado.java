package br.com.dio.Exercicios.Desafios;

/* O fatorial de um número inteiro positivo N é o produto de todos os inteiros positivos menores ou iguais a n.
Fazemos um fatorial desajeitado usando os inteiros em ordem decrescente, trocando as operações de multiplicação por uma
rotação fixa de operações cuja ordem é: multiplicar '*', dividir '/', adicionar '+' e subtrair '-'.
Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1.
Lembre-se que no fatorial desajeitado as operações ainda são aplicadas usando a ordem usual de operações aritméticas.
Além disso, a divisão neste caso sempre resulta em um número inteiro, por exemplo, 90 / 8 = 11.
Dado um inteiro N, retorne o fatorial desajeitado de n.*/

import java.util.Scanner;

public class FatorialDesajeitado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatorial = scanner.nextInt();

        System.out.println(fatorialDesajeitado(fatorial));
    }

    public static int fatorialDesajeitado(int fatorial){
        if(fatorial<=2)
            return fatorial;
        else if (fatorial<=4) {
            return fatorial+3;
        } else if (fatorial%4 == 0) {
            return fatorial+1;
        } else if (fatorial%4 == 3) {
            return fatorial-1;
        }
        return fatorial+2;
    }
}
