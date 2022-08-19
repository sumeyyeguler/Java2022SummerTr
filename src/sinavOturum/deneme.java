package sinavOturum;

import java.util.HashMap;
import java.util.Map;

public class deneme {

    public static void main(String[] args) {

        Map<String, Ogrenci> ogrencilerMap = new HashMap<>();
        Ogrenci ogrenci1=new Ogrenci("nurettin","sosyal");
        Ogrenci ogrenci2=new Ogrenci("fatma","hukuk");
        Ogrenci ogrenci3=new Ogrenci("sümeyye","hukuk");
        ogrencilerMap.put("hukuk",ogrenci1);
        ogrencilerMap.put("hukuk",ogrenci2);
        ogrencilerMap.put("hukuk",ogrenci3);
        System.out.println(ogrencilerMap);
    }
}
