package com.vitor.descubraasuaetec.utils;

public class SQLite {

    private static String nomeBanco = "etec_db";
    private static String tabelaCurso = "cursos";
    private static String tabelaUnidade = "unidades";

    public static String banco(){
        return nomeBanco;
    }

    public static String tabelaCurso(){
        return tabelaCurso;
    }

    public static String tabelaUnidade(){
        return tabelaUnidade;
    }

    public static String criaTabelaCursos(){

        String tabela = "CREATE TABLE IF NOT EXISTS " + tabelaCurso() + "(" +
                "id INTEGER PRIMARY KEY NOT NULL AUTOINCREMENT, " +
                "nome_curso VARCHAR NOT NULL, " +
                "descricao_curso VARCHAR NOT NULL, " +
                "trabalhos_curso VARCHAR NOT NULL, " +
                "tipo_curso VARCHAR, " +
                "link_curso VARCHAR NOT NULL);";
        return tabela;
    }

    public static String criatabelaUnidades(){

        String tabela = "CREATE TABLE IF NOT EXISTS " + tabelaUnidade() + "(" +
                "id INTEGER PRIMARY KEY NOT NULL AUTOINCREMENT, " +
                "nome_unidade VARCHAR NOT NULL, " +
                "curso_unidade VARCHAR NOT NULL" +
                "etim_unidade INTEGER NOT NULL, " +
                "endereco_unidade NOT NULL VARCHAR" +
                "site_unidade VARCHAR NOT NULL, " +
                "tel_unidade VARCHAR NOT NULL);";
        return tabela;
    }

    public static String insereCurso(){

        return "";

    }


}
