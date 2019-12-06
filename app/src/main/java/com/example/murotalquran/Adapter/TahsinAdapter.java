package com.example.murotalquran.Adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.murotalquran.Model.ModelTahsin;
import com.example.murotalquran.R;

import java.util.ArrayList;

public class TahsinAdapter extends RecyclerView.Adapter<TahsinAdapter.TahsinHolder> {

private ArrayList<ModelTahsin> listData;

public TahsinAdapter(ArrayList<ModelTahsin> listData) {
        this.listData = listData;
        }

@NonNull
@Override
public TahsinAdapter.TahsinHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_tahsin, viewGroup, false);
        return new TahsinHolder(view);
        }

@Override
public void onBindViewHolder(@NonNull TahsinAdapter.TahsinHolder tahsinHolder, int i) {
        tahsinHolder.bindView(listData.get(i));

        }

@Override
public int getItemCount() {
        return listData.size();
        }

public class TahsinHolder extends RecyclerView.ViewHolder {

    private TextView materi, isi;

    public TahsinHolder(@NonNull View itemView) {
        super(itemView);
        materi = itemView.findViewById(R.id.materi);
        isi = itemView.findViewById(R.id.isiarab);
    }

    private void bindView(ModelTahsin data)  {
        materi.setText(data.getMateri());
        isi.setText(data.getIsi());
        final String idTahsin = data.getId();


    }

}
}

