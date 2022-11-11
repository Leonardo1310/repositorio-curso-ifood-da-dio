package br.com.dio.Exercicios.EstruturasDeRepeticao;

/*Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer número iinteiro
* entre 1 e 10. O usuário deve informar qual número ele deseja ver a tabuada.
* A saída deve ser conforme o exemplo abaixo
*
* Tabuada 5:
* 5 x 1 = 5
* 5 x 2 = 10
* ...
* 5 x 10 = 50*/

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número que deseja para a tabuada: ");
        numero = scan.nextInt();
        System.out.println("Tabuada de " + numero);

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }

}
