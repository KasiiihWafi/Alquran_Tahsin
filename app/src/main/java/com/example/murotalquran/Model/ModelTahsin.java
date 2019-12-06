package com.example.murotalquran.Model;

public class ModelTahsin {

    private String id;
    private String materi;
    private String isi;

    public ModelTahsin(String id, String materi, String isi) {
        this.id = id;
        this.materi = materi;
        this.isi = isi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMateri() {
        return materi;
    }

    public void setMateri(String materi) {
        this.materi = materi;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
