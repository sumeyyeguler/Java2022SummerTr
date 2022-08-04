package day25_constructor;

public class StaticDeneme {

    static int sayi1=1;
    int sayi2=2;

    public static void main(String[] args) {
        System.out.println(sayi1);

        StaticDeneme obj1=new StaticDeneme();

    }

    public void sayi2Deneme(){
        System.out.println(sayi1);
    }
}
