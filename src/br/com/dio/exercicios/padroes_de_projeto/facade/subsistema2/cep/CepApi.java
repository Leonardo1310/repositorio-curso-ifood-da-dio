package br.com.dio.exercicios.padroes_de_projeto.facade.subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();
    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "São Paulo";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
}
