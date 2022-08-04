package day26_constructor;

public class Ferrari {
    public String marka = "marka belirtilmedi";
    public String model = "model belirtilmedi";
    public int yil;
    public int fiyat;
    public boolean benzinliMi;

    Ferrari() {//related problem--> parametresiz const. olmayışından

    }

    public Ferrari(String ferrari, String italia, int i, int i1) {
        //parametre olarak gelen markayı instance variablellara eşitlemem lazım
        //instance modelin değeri parametre olarak gönderdiğim model olsun istiyorum
        marka=ferrari;
        model=italia;
        yil=i;
        fiyat=i1;

    }

    public Ferrari(String ferrari, String italia, int yil, int fiyat, boolean benzin) {
        this.fiyat=fiyat;
        this.yil=yil;
        this.model=italia;
        this.marka=ferrari;
        this.benzinliMi=benzin;
    }

    public Ferrari(String marka, int yil) {
       this.marka  = marka;
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Ferrari1{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
