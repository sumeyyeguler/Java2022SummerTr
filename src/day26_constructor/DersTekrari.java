package day26_constructor;

public class DersTekrari {
    public static void main(String[] args) {


        Araba araba1 = new Araba();
        araba1.fiyat = 10000;
        araba1.marka = "Mercedes";
        araba1.yil = 2010;
        araba1.model = "C180";

        System.out.println("Araba1 bilgileri\nMarka : " + araba1.marka + "\nModel : " + araba1.model
                + "\nYil : " + araba1.yil + "\nFiyat : " + araba1.fiyat);

        Araba araba2=new Araba("BMW","5.20",2011,150000,"benzinli");

    }
}
