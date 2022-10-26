package day05_ifstatement;

import java.util.Scanner;

public class C04_IfStatement {

    public static void main(String[] args) {

        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
// calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("yas ver");
        double yas = input.nextDouble();
        System.out.println("cinsiyet gir kadin veya erkek");
        String cns = input.next();

        if (cns.equalsIgnoreCase("kadin")){

            if (yas > 59 && yas <120 && yas >0){

                    System.out.println("emekli olabilirsin");

            } else if (yas<0 || yas>120) {
                System.out.println("gecerli yas degil");
            }else {
                System.out.println("emekli olamazsin");
            }


        } else if (cns.equalsIgnoreCase("erkek")) {
            if (yas > 64 && yas<120 && yas>0){

                    System.out.println("emekli olabilirsin");

            } else if (yas<0 || yas>120) {
                System.out.println("gecerli yas degil");
            }else {
                System.out.println("emekli olamazsin");
            }

        }else{
            System.out.println("gecerli bir cinsiyet giriniz");
        }


    }
}
