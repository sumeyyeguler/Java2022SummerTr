package day26_constructor;

public class FerrariRunner {
    public static void main(String[] args) {

        Ferrari frr1=new Ferrari();
        System.out.println("ferrari1 özellikleri :"+frr1.toString());

        Ferrari frr2=new Ferrari("ferrari","italia",2009,123000);
        System.out.println("ferrari2 bilgileri :"+frr2.toString());//toString demesekte yazdırır

        Ferrari frr3=new Ferrari("ferrari","italia",2009,128000,true);
       //Ferrari{marka='marka belirtilmedi', model='model belirtilmedi', yil=0, fiyat=0}-->> this yazmadan önce
        System.out.println("ferrari3 bilgileri :"+frr2);

        Ferrari frr4=new Ferrari("ferrari",1998);
        System.out.println("ferrari 4 bilgileri : "+frr4);
        //ferrari 4 bilgileri : Ferrari1{marka='ferrari', model='model belirtilmedi', yil=1998, fiyat=0}
    }
}
