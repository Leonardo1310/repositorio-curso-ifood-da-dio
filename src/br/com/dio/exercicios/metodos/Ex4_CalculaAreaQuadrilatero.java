package br.com.dio.Exercicios.Metodos;

/*Crie uma aplicação que calcula a área dos quadriláteros: quadrado, losango, retângulo e trapézio*/

public class Ex4_CalculaAreaQuadrilatero {
    public static void main(String[] args) {

        System.out.println("Área quadrado: " + calculaArea(3));
        System.out.println("Área retângulo: " + calculaArea(3, 4));
        System.out.println("Área trapézio: " + calculaArea(3,4,5));
        System.out.println("Área losango: " + calculaArea(2,3));
    }

    public static double calculaArea(double lado){
        return lado*lado;
    }

    public static double calculaArea(double base, double altura){
        return base*altura;
    }

    public static double calculaArea(double baseMenor, double baseMaior, double altura){
        return (baseMaior+baseMenor)*altura;
    }

    public static double calculaArea(float diagonalMaior, float diagonalMenor){
        return (diagonalMaior+diagonalMenor)/2;
    }
}
