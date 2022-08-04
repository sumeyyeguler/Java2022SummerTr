package day26_constructor;

public class Ogrenci {

    String isim="isim belirtilmedi";
    String SoyIsim="Soyisim belirtilmedi";
    String dogumTarihi="tarih belirtilmedi";
    String dal="dal belirtilmedi";

    public Ogrenci() {
    }

    public Ogrenci(String isim, String soyIsim, String dogumTarihi, String dal) {
        this.isim = isim;
        SoyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
        this.dal = dal;
    }

    public Ogrenci(String isim, String soyIsim) {
        this.isim = isim;
        SoyIsim = soyIsim;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", SoyIsim='" + SoyIsim + '\'' +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                ", dal='" + dal + '\'' +
                '}';
    }
}
