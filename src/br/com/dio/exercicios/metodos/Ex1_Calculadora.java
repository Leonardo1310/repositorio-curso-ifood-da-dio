package br.com.dio.Exercicios.Metodos;

/*Criar uma aplicação que calcule as 4 operações básicas: soma, divisão, subtração, multiplicação
* sempre 2 valores devem ser passados*/

import java.util.Scanner;

public class Ex1_Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero1;
        double numero2;

        System.out.print("Digite o primeiro numero: ");
        numero1 = scan.nextDouble();
        System.out.print("Digite o segundo numero: ");
        numero2 = scan.nextDouble();

        operacao(numero1, numero2);
    }

    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;

        System.out.println("Soma: " + numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("Subtração: " + numero1 + " - " + numero2 + " = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("Multiplicação: " + numero1 + " * " + numero2 + " = " + resultado);
    }

    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("Divisão: " + numero1 + " / " + numero2 + " = " + resultado);
    }

    public static void operacao(double numero1, double numero2){
        Scanner scan = new Scanner(System.in);
        String op;

        System.out.print("Escolha a operação: ");
        op = scan.next();

        switch (op) {
            case "+" -> soma(numero1, numero2);
            case "-" -> subtracao(numero1, numero2);
            case "*" -> multiplicacao(numero1, numero2);
            case "/" -> divisao(numero1, numero2);
            default -> System.out.println("Operação inválida!");
        }
    }
}
