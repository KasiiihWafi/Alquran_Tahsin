package com.example.murotalquran.Model;

public class ModelSurat {

    private String id;
    private String no;
    private String judul;
    private String subjudul;

    public ModelSurat(String id, String no, String judul, String subjudul) {
        this.id = id;
        this.no = no;
        this.judul = judul;
        this.subjudul = subjudul;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSubjudul() {
        return subjudul;
    }

    public void setSubjudul(String subjudul) {
        this.subjudul = subjudul;
    }
}