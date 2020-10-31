package com.vitor.descubraasuaetec.utils;

import android.content.Context;
import android.database.Cursor;
import com.vitor.descubraasuaetec.bean.Cursos;
import com.vitor.descubraasuaetec.bean.Unidades;
import java.util.ArrayList;
import java.util.List;

public class DBController {

    private DBConnection dbConnection;

    public DBController(Context context) {
        dbConnection = new DBConnection(context);
    }

    //SELECT * FROM CURSOS
    public List<Cursos> selecionaTudoCursos(){
        List<Cursos> listaCursos = new ArrayList<>();
        Cursor cursor = dbConnection.getReadableDatabase().rawQuery("SELECT * FROM " + dbConnection.TABELA_CURSOS, null);

        while (cursor.moveToNext()){
            int id = cursor.getInt(cursor.getColumnIndex(dbConnection.CURSO_ID));
            String nome = cursor.getString(cursor.getColumnIndex(dbConnection.CURSO_NOME));
            String descricao = cursor.getString(cursor.getColumnIndex(dbConnection.CURSO_DESCRICAO));
            String funcao = cursor.getString(cursor.getColumnIndex(dbConnection.CURSO_FUNCAO));
            String tipos = cursor.getString(cursor.getColumnIndex(dbConnection.CURSO_TIPOS));
            String link = cursor.getString(cursor.getColumnIndex(dbConnection.CURSO_LINK));

            listaCursos.add(new Cursos(id, nome, descricao, funcao, tipos, link));
        }
        cursor.close();
        return listaCursos;
    }

    //SELECT * FROM UNIDADES
    public List<Unidades> selecionaTudoUnidades(){
        List<Unidades> listaUnidades = new ArrayList<>();
        Cursor cursor = dbConnection.getReadableDatabase().rawQuery("SELECT * FROM " + dbConnection.TABELA_UNIDADES, null);

        while (cursor.moveToNext()){

            int id = cursor.getInt(cursor.getColumnIndex(dbConnection.UNIDADES_ID));
            String nome = cursor.getString(cursor.getColumnIndex(dbConnection.UNIDADES_NOME));
            String cursos = cursor.getString(cursor.getColumnIndex(dbConnection.UNIDADES_CURSOS));
            String etim = cursor.getString(cursor.getColumnIndex(dbConnection.UNIDADES_ETIM));
            String endereco = cursor.getString(cursor.getColumnIndex(dbConnection.UNIDADES_ENDERECO));
            String site = cursor.getString(cursor.getColumnIndex(dbConnection.UNIDADES_SITE));
            String telefone = cursor.getString(cursor.getColumnIndex(dbConnection.UNIDADES_TELEFONE));

            listaUnidades.add(new Unidades(id, nome, cursos, etim, endereco, site, telefone));
        }
        cursor.close();
        return listaUnidades;
    }

}
