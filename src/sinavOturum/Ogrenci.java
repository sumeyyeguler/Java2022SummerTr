package sinavOturum;

public class Ogrenci {

    String ogrenciAdiSoyadi;
    String ogrenciDers;
    String oturumSinifi;
    String ogrenciNo;

    public Ogrenci(String ogrenciAdiSoyadi, String ogrenciDers, String oturumSinifi, String ogrenciNo) {
        this.ogrenciAdiSoyadi = ogrenciAdiSoyadi;
        this.ogrenciDers = ogrenciDers;
        this.oturumSinifi = oturumSinifi;
        this.ogrenciNo = ogrenciNo;
    }

    public Ogrenci(String ogrenciAdiSoyadi, String ogrenciDers) {
        this.ogrenciAdiSoyadi = ogrenciAdiSoyadi;
        this.ogrenciDers = ogrenciDers;
    }

    public Ogrenci() {
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciAdiSoyadi='" + ogrenciAdiSoyadi + '\'' +
                ", ogrenciDers='" + ogrenciDers + '\'' +
                '}';
    }

}
