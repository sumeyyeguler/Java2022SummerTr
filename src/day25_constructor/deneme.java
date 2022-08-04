package day25_constructor;

public class deneme {


    public static int sayi1=2;
     public int sayi2=0;

    public void staticOlmayan(){
        System.out.println(sayi2);
        System.out.println(sayi1);

    }

    public static void staticOlan(){
        System.out.println(sayi1);


        deneme obj1=new deneme();
        System.out.println(obj1.sayi2);
    }

    public static void main(String[] args) {

        staticOlan();

        deneme obj2=new deneme();
        obj2.staticOlmayan();

    }
}
