package br.com.dio.Exercicios;

/*Faça um programa que leia 5 números e informe o maior número e a média*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int maior = 0;
        int cont = 5;

        for (int i = 1; i <= cont; i++) {
            System.out.println("Digite o "+ i + "° número:");
            numero = scan.nextInt();
            soma += numero;

            if(numero > maior) maior = numero;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + (float)(soma)/cont);
    }
}
