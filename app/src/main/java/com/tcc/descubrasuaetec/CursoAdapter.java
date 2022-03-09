package com.tcc.descubrasuaetec;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

//ADAPTER PARA INSERIR OS DADOS NA LISTA DE CURSOS
public class CursoAdapter extends ArrayAdapter<EtecBean> {

    private final Context context;
    private final ArrayList<EtecBean> elementos;

    public CursoAdapter(Context context, ArrayList<EtecBean> elementos){
        super(context, R.layout.linha_curso,elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha_curso, parent, false);
        TextView nome = rowView.findViewById(R.id.nomeCurso);
        TextView profissional = rowView.findViewById(R.id.proId);
        nome.setText(elementos.get(position).getNomeCurso());
        profissional.setText(elementos.get(position).getProfissionalCurso());
        return rowView;

    }
}
