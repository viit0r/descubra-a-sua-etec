package com.vitor.descubraasuaetec.bean;

public class Cursos {

    private int id;
    private String nome, descricao, funcao, tipos, link;

    public Cursos(){
    }

    public Cursos(int id, String nome, String descricao, String funcao, String tipos, String link) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.funcao = funcao;
        this.tipos = tipos;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
