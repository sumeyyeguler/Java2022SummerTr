package dersTekrari;

import java.util.*;

public class C01Map {
    public static void main(String[] args) {

        Map<Integer,String>ogrenciBilgiler=new HashMap<>();
        ogrenciBilgiler.put(101,"sümeyye, Güler, QA");
        ogrenciBilgiler.put(102,"fatma, Cimen, QA");
        ogrenciBilgiler.put(103,"hilal, Arslan, QA");

        System.out.println(ogrenciBilgiler);//{101=sümeyye, Güler, QA, 102=fatma, Cimen, QA, 103=hilal, Arslan, QA}

        System.out.println(ogrenciBilgiler.keySet());//[101, 102, 103]
        System.out.println(ogrenciBilgiler.values());//[sümeyye, Güler, QA, fatma, Cimen, QA, hilal, Arslan, QA]

        System.out.println(ogrenciBilgiler.size());//3

        //tüm öğrencilerin isim ve soyisimlerini alt alta yazdırınız

        Collection<String> tumValueCol=ogrenciBilgiler.values();

        for (String each:tumValueCol
             ) {
            System.out.println(each);
        }

        String eachArr[];
        int sira=1;
        for (String each:tumValueCol
             ) {
          eachArr = each.split(", ");//[sümeyye, Güler, QA]
            System.out.println(sira+"-"+eachArr[0]+" "+eachArr[1]);
            sira++;
        }

        //mapte bulunan öğrencilerin isim ve soyilimlerini birleşrtirerek bir sınıf listesi oluşturun

        List <String> sinifIsimSoyIsımListe=new ArrayList<>();

        for (String each:tumValueCol
             ) {
            eachArr=each.split(", ");
            sinifIsimSoyIsımListe.add(eachArr[0]+" "+eachArr[1]);

        }
        System.out.println(sinifIsimSoyIsımListe);//[sümeyye Güler, fatma Cimen, hilal Arslan]

    }
}
