package br.com.dio.exercicios.padroes_de_projeto.singleton;

public class SingletonLazyHolder {
    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){ super();}
    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }

}
