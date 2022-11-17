package br.com.dio.Exercicios.Desafios;

/*Neste desafio, dados dois números, verifique se eles
* são iguais. Caso sejam, retorne "São iguais!". Caso
* contrário, retorne, "Nao sao iguais!" sem aspas.*/

import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;

        num1 = scan.nextInt();
        num2 = scan.nextInt();

        if (num1 == num2)
            System.out.println("Sao iguais!");
        else
            System.out.println("Nao sao iguais!");
    }
}
