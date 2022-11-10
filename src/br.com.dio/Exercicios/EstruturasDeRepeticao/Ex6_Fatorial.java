package br.com.dio.Exercicios;

/*Faça um programa que calcula o fatorial de um número inteiro fornecido pelo usuário*/

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int multiplica = 1;

        System.out.println("Fatorial: ");
        fatorial = scan.nextInt();

        for (int i = fatorial; i > 0; i--) {
            multiplica *= i;
        }
        System.out.println(fatorial + "! = " + multiplica);
    }
}
