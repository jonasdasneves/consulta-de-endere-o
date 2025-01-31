package br.com.buscadeendereco.interfaces;

import br.com.buscadeendereco.consulta.Endereco;

public interface EditaJson {

    public Endereco jsonToEndereco(String json);
}
