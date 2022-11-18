package br.com.dio.exercicios.padroes_de_projeto.facade;

import br.com.dio.exercicios.padroes_de_projeto.facade.subsistema1.crm.CrmService;
import br.com.dio.exercicios.padroes_de_projeto.facade.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }

}
