package br.com.dio.exercicios.padroes_de_projeto.strategy;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
