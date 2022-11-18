package br.com.dio.exercicios.padroes_de_projeto;

import br.com.dio.exercicios.padroes_de_projeto.facade.Facade;
import br.com.dio.exercicios.padroes_de_projeto.singleton.SingletonEager;
import br.com.dio.exercicios.padroes_de_projeto.singleton.SingletonLazy;
import br.com.dio.exercicios.padroes_de_projeto.singleton.SingletonLazyHolder;
import br.com.dio.exercicios.padroes_de_projeto.strategy.*;

public class Teste {
    public static void main(String[] args) {

        //Testes relacionados ao Design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Testes relacionados ao Design Pattern Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        //Testes relacionados ao Design Pattern Facade
        Facade facade = new Facade();
        facade.migrarCliente("Leonardo", "72045-40");
    }
}
