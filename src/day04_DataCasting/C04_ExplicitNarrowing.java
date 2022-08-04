package day04_DataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1=500;
        byte sayi2= (byte) sayi1;
        System.out.println(sayi2); // 50
        /*
         Genis data turundeki degeri, dar data turundeki variable'a atamak isterseniz
         Java sizin genis data turundeki degerin, dar data turunun
         sinirlarina uyup uymayacagini calistirana kadar bilemez
         ama Java Risk almaz
         Riski sifira indirmek icin burada bir sorun olursa
         sorumlulugu kabul etmenizi bekler
         bunun icin degerin onune parantez icerisinde istedigimiz data turunu
         yazmamiz yeterlidir.
         */
    }
}
