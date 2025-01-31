package br.com.buscadeendereco.consulta;

import br.com.buscadeendereco.interfaces.ConsultaAPIEndereco;
import br.com.buscadeendereco.interfaces.EditaJson;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class Busca implements ConsultaAPIEndereco, EditaJson {
    private String cep;
    private String uf;
    private String cidade;
    private String localDesejado;
    private Gson gson;

    public Busca(){
        gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
    }

    @Override
    public String consultaPorCep(String cep) throws IOException, InterruptedException {

        String enderecoWeb = "http://viacep.com.br/ws/";
        String tipoResposta = "/json/";
        String requisicao = enderecoWeb + cep + tipoResposta;
        System.out.println(requisicao);

        //Definição de comunicação HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(requisicao))
                .build();

        //Envio de requisição com nome do filme desejado
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //Atribuição de resposta a String
        return response.body();
    }

    @Override
    public Endereco jsonToEndereco(String json) {
        System.out.println(json);
        Endereco endereco =  gson.fromJson(json,Endereco.class);
        return endereco;
    }

}