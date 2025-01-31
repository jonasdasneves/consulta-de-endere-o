package br.com.buscadeendereco.interfaces;

import java.io.IOException;

public interface ConsultaAPIEndereco {

    String consultaPorCep(String cepDesejado) throws IOException, InterruptedException;

}
