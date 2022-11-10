package br.com.dio.Exercicios;

/*Faça um programa que peça uma nota entre 0 e 10
* Motre uma mensagem caso o valor seja inválido e continue pedindo
* até que o usuário informe o valor válido*/

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex2_Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota inválida, insira uma nota entre 0 e 10: ");
            nota = scan.nextInt();

        }
    }


}
