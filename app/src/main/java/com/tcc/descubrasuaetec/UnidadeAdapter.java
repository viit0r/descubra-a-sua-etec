package com.tcc.descubrasuaetec;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

//ADAPTER PARA INSERIR OS DADOS NA LISTA DE UNIDADES
public class UnidadeAdapter extends ArrayAdapter<EtecBean> {
    private final Context context;
    private final ArrayList<EtecBean> elementos;

    public UnidadeAdapter(Context context, ArrayList<EtecBean> elementos){
        super(context, R.layout.linha_unidade,elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha_unidade, parent, false);
        TextView nomeEtec = rowView.findViewById(R.id.nomeCurso);
        TextView descricaoID = rowView.findViewById(R.id.descricaoID);
        nomeEtec.setText(elementos.get(position).getNome());
        descricaoID.setText(elementos.get(position).getEndereco());
        return rowView;
    }
}