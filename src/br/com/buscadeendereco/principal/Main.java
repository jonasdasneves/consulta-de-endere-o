package br.com.buscadeendereco.principal;

import br.com.buscadeendereco.consulta.Busca;
import br.com.buscadeendereco.consulta.Endereco;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Busca busca = new Busca();
        String json = busca.consultaPorCep("05876030");

        Endereco endereco = busca.jsonToEndereco(json);

        System.out.println(endereco);
    }
}
