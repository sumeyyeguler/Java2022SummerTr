package team10;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        kontrol();
    }

    private static void kontrol() {
        Scanner scan=new Scanner(System.in);
        System.out.println("vize notunuzu giriniz : ");
        try {
            double vize= scan.nextDouble();
            if (vize>100&&vize<0){
                
            }
        } catch (Exception e) {

            System.out.println("geçerli girin");
        }
    }
}
