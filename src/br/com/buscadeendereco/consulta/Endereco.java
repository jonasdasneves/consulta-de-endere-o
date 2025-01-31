package br.com.buscadeendereco.consulta;

import com.google.gson.annotations.SerializedName;

public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private String ddd;

    public Endereco(){

    }

    public Endereco(EnderecoViaCep enderecoViaCep){
        this.cep = enderecoViaCep.cep();
        this.logradouro = enderecoViaCep.logradouro();
        this.complemento = enderecoViaCep.complemento();
        this.unidade = enderecoViaCep.unidade();
        this.bairro = enderecoViaCep.bairro();
        this.localidade = enderecoViaCep.localidade();
        this.uf = enderecoViaCep.uf();
        this.estado = enderecoViaCep.estado();
        this.regiao = enderecoViaCep.regiao();
        this.ddd = enderecoViaCep.ddd();
    }

    @Override
    public String toString(){
        return getLogradouro() + ", " + getComplemento() + ", " + getLocalidade() + ", " + getUf() + " - " + getCep();
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
