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

public class ListAdapterUnidades extends RecyclerView.Adapter<ListAdapterUnidades.ListaUnidadesViewHolder> {

    private List<Unidades> list;

    public ListAdapterUnidades(List<Unidades> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ListaUnidadesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,false);
        return new ListaUnidadesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapterUnidades.ListaUnidadesViewHolder holder, int position) {

        holder.nome.setText(list.get(position).getNome());
        holder.descricao.setText(list.get(position).getEndereco());

    }

    @Override
    public int getItemCount() {
        return (list != null && list.size() > 0 ? list.size() : 0);
    }

    public class ListaUnidadesViewHolder extends RecyclerView.ViewHolder {

        private TextView nome, descricao;

        public ListaUnidadesViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.txtNome);
            descricao = itemView.findViewById(R.id.txtDescricao);
        }
    }
}
