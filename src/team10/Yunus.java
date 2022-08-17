package team10;

public class Yunus extends Ogrenci {

    public static void main(String[] args) {
        Yunus obj1 = new Yunus();
        obj1.okulIsmi="yıldız koleji";
        System.out.println("obje1 için okul ismi :"+obj1.okulIsmi);//obje1 için okul ismi :yıldız koleji

        Yunus obj2=new Yunus();
        System.out.println("obje2 için okul ismi :"+obj2.okulIsmi);//obje2 için okul ismi :team10 koleji

        String okulIsmi="x koleji";

        System.out.println("atamadan sonra obj1 :"+obj1.okulIsmi);//atamadan sonra obj1 :yıldız koleji
        System.out.println("atamadan sonra obj2 :"+obj2.okulIsmi);//atamadan sonra obj2 :team10 koleji
        System.out.println(okulIsmi);//x koleji

        Ogrenci obj3=new Yunus();
        obj3.aidat();//yunus classından aidat methodu çalıştı

        Okul obj4=new Ogrenci();
        obj4.aidat();//ogrenci classından aidat methodu çalıştı
        System.out.println("obj4 için not : "+obj4.not);//obj4 için not : 0.0


        Okul obj5=new Okul();
        obj5.aidat();//okul classından aidat methodu çalıştı
        obj5.not=67;
        System.out.println(obj5.toString());//67.0
    }


    protected void aidat() {

        System.out.println("yunus classından aidat methodu çalıştı");

    }

}
