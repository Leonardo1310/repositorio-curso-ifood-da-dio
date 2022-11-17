package br.com.dio.Exercicios.Desafios;

/*Neste desafio, você terá que criar uma função que faça um número
como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz".

Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ;
Se o número for apenas múltiplo de 3 -> "Fizz" ;
Se o número for apenas múltiplo de 5 -> "Buzz";
Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido;
*/

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

       verifica(numero);
    }

    public static void verifica(int numero){

        if (numero%3 == 0 && numero%5 == 0)
            System.out.println("FizzBuzz");
        else if (numero%3 == 0) {
            System.out.println("Fizz");
        } else if (numero%5 == 0) {
            System.out.println("Buzz");
        }
        else
            System.out.println(numero);
    }

}
