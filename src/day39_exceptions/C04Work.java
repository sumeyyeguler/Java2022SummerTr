package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04Work {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");

        // text yolunu kopyalamak için --> sağ click copy/path reference>path from content
        // altını kırmızı çizecek, eklediğimiz dosya yolunun doğru olup olmayacağını java bilemez.
        // bu yüzden istersek more actiondan surround with try catch seçilir
        // yada "add ezxeption to method signature" seçip sorumluluğu üstlenebiliriz (yaani main methodun signatur'ına ekleme yaptı)
    }
}
