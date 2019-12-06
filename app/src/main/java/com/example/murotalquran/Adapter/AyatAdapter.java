package com.example.murotalquran.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.murotalquran.Model.ModelAyat;
import com.example.murotalquran.R;

import java.util.ArrayList;

public class AyatAdapter extends RecyclerView.Adapter<AyatAdapter.AyatHolder> {

    private ArrayList<ModelAyat> listData;

    public AyatAdapter(ArrayList<ModelAyat> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public AyatAdapter.AyatHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_ayat, viewGroup, false);
        return new AyatAdapter.AyatHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AyatAdapter.AyatHolder ayatHolder, int i) {
        ayatHolder.bindView(listData.get(i));

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class AyatHolder extends RecyclerView.ViewHolder {

        private TextView no, Arab, Latin, Arti;

        public AyatHolder(@NonNull View itemView) {
            super(itemView);
            no = itemView.findViewById(R.id.noayat);
            Arab = itemView.findViewById(R.id.Arab);
            Latin = itemView.findViewById(R.id.Latin);
            Arti = itemView.findViewById(R.id.Arti);
        }

        private void bindView(ModelAyat data)  {
            no.setText(data.getNo());
            Arab.setText(data.getArab());
            Latin.setText(data.getLatin());
            Arti.setText(data.getArti());


        }

    }
}


