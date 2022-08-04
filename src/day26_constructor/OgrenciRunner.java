package day26_constructor;

public class OgrenciRunner {
    public static void main(String[] args) {

        Ogrenci ogr1=new Ogrenci();
        System.out.println("ogrenci 1 : "+ogr1);
        //Ogrenci{isim='isim belirtilmedi', SoyIsim='Soyisim belirtilmedi', dogumTarihi='tarih belirtilmedi', dal='dal belirtilmedi'}

        Ogrenci ogr2=new Ogrenci("sümeyye","güler","1994","IT");
        System.out.println(ogr2);
    }
}
