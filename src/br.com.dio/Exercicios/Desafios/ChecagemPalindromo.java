package br.com.dio.Exercicios.Desafios;

/* Contrua uma função quye recebe uma String e identifique se a mesma
 * é um palíndromo, ou seja, se a String é igual a ela mesma invertiva*/

import java.util.Scanner;

import static java.lang.Boolean.FALSE;

public class ChecagemPalindromo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        String invertida = new StringBuffer(palavra)
                .reverse()
                .toString()
                .toUpperCase();

        if(palavra.toUpperCase().equals(invertida))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
