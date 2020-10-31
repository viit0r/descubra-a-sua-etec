package com.vitor.descubraasuaetec.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.vitor.descubraasuaetec.R;
import com.vitor.descubraasuaetec.bean.Cursos;
import java.util.List;

public class ListAdapterCursos extends RecyclerView.Adapter<ListAdapterCursos.ListaCursosViewHolder> {

    private List<Cursos> list;

    public ListAdapterCursos(List<Cursos> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ListaCursosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,false);
        return new ListaCursosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapterCursos.ListaCursosViewHolder holder, int position) {

        holder.nome.setText(list.get(position).getNome());
        holder.descricao.setText(list.get(position).getDescricao());

    }

    @Override
    public int getItemCount() {
        return (list != null && list.size() > 0 ? list.size() : 0);
    }

    public class ListaCursosViewHolder extends RecyclerView.ViewHolder {

        private TextView nome, descricao;

        public ListaCursosViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.txtNome);
            descricao = itemView.findViewById(R.id.txtDescricao);
        }
    }
}
