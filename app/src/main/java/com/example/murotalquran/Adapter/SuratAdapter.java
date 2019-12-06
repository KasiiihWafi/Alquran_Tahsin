package com.example.murotalquran.Adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.murotalquran.DetailSurat;
import com.example.murotalquran.Model.ModelSurat;
import com.example.murotalquran.R;

import java.util.ArrayList;

public class SuratAdapter extends RecyclerView.Adapter<SuratAdapter.SuratHolder> {

    private ArrayList<ModelSurat> listData;

    public SuratAdapter(ArrayList<ModelSurat> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public SuratAdapter.SuratHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_surat, viewGroup, false);
        return new SuratHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SuratAdapter.SuratHolder suratHolder, int i) {
        suratHolder.bindView(listData.get(i));

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class SuratHolder extends RecyclerView.ViewHolder {

        private TextView no, Judul, subJudul;

        public SuratHolder(@NonNull View itemView) {
            super(itemView);
            no = itemView.findViewById(R.id.no);
            Judul = itemView.findViewById(R.id.Judul);
            subJudul = itemView.findViewById(R.id.subJudul);
        }

        private void bindView(ModelSurat data)  {
            no.setText(data.getNo());
            Judul.setText(data.getJudul());
            subJudul.setText(data.getSubjudul());
            final String idSurat = data.getId();

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), DetailSurat.class)
                            .putExtra(DetailSurat.KEY_SURAT, idSurat));
                }
            });
        }

    }
}

