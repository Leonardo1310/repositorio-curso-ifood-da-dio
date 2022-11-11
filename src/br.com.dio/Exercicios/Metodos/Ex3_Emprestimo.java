package br.com.dio.Exercicios.Metodos;

/*Crie uma aplicação que calcule o valor de um empŕestimo, a partir do valor solicitado.
* Taxas e parcelas influenciam. Defina arbritariamente as faixas que influenciam nos valores*/

import java.util.Scanner;

public class Ex3_Emprestimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valor;
        int parcelas;

        System.out.print("Valor do empréstimo: ");
        valor = scan.nextDouble();
        System.out.print("Quantidade de parcelas: ");
        parcelas = scan.nextInt();

        calculaValorEmprestimo(valor, parcelas);
    }

    public static double getDuasParcelas(){
        return 0.05;
    }

    public static double getTresParcelas(){
        return 0.1;
    }

    public static double getQuatroParcelas(){
        return 0.15;
    }

    public static void calculaValorEmprestimo(double valor, int parcelas){

        double valorFinal = 0;

        switch (parcelas){
            case 2 -> valorFinal = valor + (valor * getDuasParcelas());
            case 3 -> valorFinal = valor + (valor * getTresParcelas());
            case 4 -> valorFinal = valor + (valor * getQuatroParcelas());
        }

        if (valorFinal != 0)
            System.out.print("O valor do empréstimo é: " + valorFinal);
        else
            System.out.print("Quantidade de parcelas inválida");
    }
}
