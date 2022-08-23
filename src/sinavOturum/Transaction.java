package sinavOturum;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transaction {
    /*
    1 - Derslere göre öğrencileri belirleyeceğiz
    2 - Öğrencileri sınıflara atayacağız
    3 - Öğretmenleri sınıflara atayacağız
    4 -

     */

    public static Map<String, List<String>> dersBelirleme() throws IOException {

        Map<String, List<String>> derslereGoreOgrenciler = new HashMap<>();
        List<String> ogrenciler = new ArrayList<>();
        List<String> ogrenciler2 = new ArrayList<>();



        int count = 0;
        for (Map.Entry<String, String> each : VeriAktarma.derslerVeKodlari().entrySet()
        ) {


            String dersKodu = each.getKey();
            for (Map.Entry<String, Ogrenci> each2 : VeriAktarma.ogrenciler().entrySet()) {
                String ogrenciDersi = each2.getValue().ogrenciDers;

                if (dersKodu.equals(ogrenciDersi)) {
                    ogrenciler.add(each2.getValue().ogrenciAdiSoyadi);
                    count++;

                }
                ogrenciler2.addAll(ogrenciler);
                System.out.println("o2 "+ogrenciler2);
                System.out.println(ogrenciler2.size());
                derslereGoreOgrenciler.put(dersKodu, ogrenciler2);

                ogrenciler2.removeAll(ogrenciler);
            }

            System.out.println(count);}
        for (Map.Entry<String, List<String>> each3 : derslereGoreOgrenciler.entrySet()
        ) {
            System.out.println(each3);
        }

        return derslereGoreOgrenciler;

    }
}
