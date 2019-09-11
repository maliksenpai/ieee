package com.example.ieee04;


public class sınıf {
    private String isim;
    private String durum;
    private String aciklama;
    public sınıf(String isim, String durum, String aciklama) {
        this.isim = isim;
        this.durum = durum;
        this.aciklama = aciklama;
    }

    public String getIsim() {
        return isim;
    }

    public String getDurum() {
        return durum;
    }
    public String getAciklama(){
        return aciklama;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
    public void setAciklama(String aciklama){
        this.aciklama=aciklama;
    }
}
