package com.example.ieee04;

public class Modelkulup{
    private String isim;
    private int foto;

    public Modelkulup(String isim, int foto) {
        this.isim = isim;
        this.foto = foto;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getIsim() {
        return isim;
    }

}
