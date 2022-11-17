package br.com.dio.Exercicios.Desafios;

/*Dado um array inteiro nums, mova todos os inteiros pares no início do array seguido por todos os inteiros ímpares.
Retorne um array que satisfaça essa condição. A primeira linha da entrada deverá conter um inteiro que corresponda ao tamanho do array.
As linhas seguintes deverão conter os valores que esse array receberá.*/

import java.util.Scanner;

public class ClassificandoMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] numeros = new int[N];
        int aux;


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if(numeros[i] % 2 == 0 && numeros[j] % 2 != 0){
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
