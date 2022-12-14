package br.com.dio.Exercicios.Arrays;

/*Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) e  armazene-os num vetor.
* Ao final mostre os números e seus sucessores/antecessores.*/

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros aletórios: ");
        for ( int numeros : numerosAleatorios ) {
            System.out.print(numeros + " ");
        }

        System.out.print("\nSucessores       : ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

        System.out.print("\nAntecessores     : ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
    }
}
