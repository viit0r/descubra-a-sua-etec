package com.vitor.descubraasuaetec.bean;

public class Unidades {

    private int id;
    private String nome, cursos, etim, endereco, site, telefone;

    public Unidades() {
    }

    public Unidades(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Unidades(int id, String nome, String cursos, String etim, String endereco, String site, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cursos = cursos;
        this.etim = etim;
        this.endereco = endereco;
        this.site = site;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public String getEtim() {
        return etim;
    }

    public void setEtim(String etim) {
        this.etim = etim;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
