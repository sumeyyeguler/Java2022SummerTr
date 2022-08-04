package day38_exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C04Work {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> urunListesi = Arrays.asList("elma", "üzüm", "karpuz", "şeftali", "kavun");


        boolean dogruMu = true;

        while (dogruMu) {
            System.out.println("istediğiniz ürünün sıra numarasını giriniz : ");
            int secim = scan.nextInt();
            try {
                System.out.println("aranan ürün : " + urunListesi.get(secim));break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ürün bulunamadı");
            }
        }
    }
}