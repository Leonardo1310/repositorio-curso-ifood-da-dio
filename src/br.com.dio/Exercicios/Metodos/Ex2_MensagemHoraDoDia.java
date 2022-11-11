package br.com.dio.Exercicios.Metodos;

/*Crie uma aplicação que a partir da hora do dia, informe uma mensagem adequada:
* Bom dia, Boa tarde, Boa noite.*/

import java.util.Scanner;

public class Ex2_MensagemHoraDoDia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hora;

        System.out.printf("Que horas são? ");
        hora = scan.nextInt();
        mensagem(hora);
    }

    public static void mensagem(int hora) {

        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> bomDia();
            case 13, 14, 15, 16, 17 -> boaTarde();
            case 18, 19, 20, 21, 22, 23, 24, 1, 2, 3, 4 -> boaNoite();
        }
    }

    public static void bomDia(){
        System.out.println("Bom dia!");
    }

    public static void boaTarde(){
        System.out.println("Boa Tarde!");
    }

    public static void boaNoite(){
        System.out.println("Boa noite!");
    }
}
