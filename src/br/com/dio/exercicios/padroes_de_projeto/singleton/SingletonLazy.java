package br.com.dio.exercicios.padroes_de_projeto.singleton;

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if( instancia == null)
            instancia = new SingletonLazy();
        return instancia;
    }

}
