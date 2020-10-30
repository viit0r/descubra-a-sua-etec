package com.vitor.descubraasuaetec.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vitor.descubraasuaetec.R;
import com.vitor.descubraasuaetec.bean.Unidades;

import java.util.List;

public class ListAdapterUnidades extends RecyclerView.Adapter<ListAdapterUnidades.ListaUnidadesAdapterViewHolder> {

    private List<Unidades> list;

    public ListAdapterUnidades(List<Unidades> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ListAdapterUnidades.ListaUnidadesAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ListaUnidadesAdapterViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapterUnidades.ListaUnidadesAdapterViewHolder holder, int position) {

        holder.nome.setText(list.get(position).getNome());
        holder.descricao.setText(list.get(position).getEndereco());

    }

    @Override
    public int getItemCount() {
        return (list!= null && list.size() > 0 ? list.size() : 0);
    }

    public class ListaUnidadesAdapterViewHolder extends RecyclerView.ViewHolder {

        private TextView nome, descricao;

        public ListaUnidadesAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.txtNome);
            descricao = itemView.findViewById(R.id.txtDescricao);
        }
    }
}
