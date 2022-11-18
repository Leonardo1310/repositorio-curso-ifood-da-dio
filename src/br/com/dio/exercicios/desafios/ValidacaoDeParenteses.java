package br.com.dio.Exercicios.Desafios;

/* Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']'
determine se uma determinada string é válida. */

import java.util.Scanner;

public class ValidacaoDeParenteses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s){
        return switch (s) {
            case "[]", "()", "{}", "" -> true;
            default -> false;
        };
    }
}
