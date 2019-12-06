package com.example.murotalquran.Model;

public class ModelAyat {

    private String id;
    private String no;
    private String arab;
    private String latin;
    private String arti;

    public ModelAyat(String id, String no, String arab, String latin, String arti) {
        this.id = id;
        this.no = no;
        this.arab = arab;
        this.latin = latin;
        this.arti = arti;
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

    public String getArab() {
        return arab;
    }

    public void setArab(String arab) {
        this.arab = arab;
    }

    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public String getArti() {
        return arti;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }

}

