package br.com.dio.Exercicios.EstruturasDeRepeticao;

/*Faça um programa que peça N números inteiros,
* calcule e mostre a quantidade de números pares e a quantidade de números ímpares*/

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int par = 0;
        int impar = 0;

        System.out.println("Digite um número diferente de Zero: ");
        numero = scan.nextInt();

        while(numero != 0){

            if(numero % 2 == 0) par++;
            else impar++;
            
            System.out.println("Digite um número diferente de Zero: ");
            numero = scan.nextInt();
        }

        System.out.println("Números ímpares: " + impar);
        System.out.println("Números pares: " + par);
    }




}
