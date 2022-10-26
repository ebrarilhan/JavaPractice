package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulationsLength {

    public static void main(String[] args) {

        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */

        String cumle = "Bugun hava yagmurlu";
        System.out.println(cumle.length());

        String str1 = "";
        System.out.println(str1.length());

        String str2 = " ";
        System.out.println(str2.length());

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun
        // oldugunu yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = input.nextLine();
        System.out.println("soy isminizi giriniz");
        String soy = input.nextLine();

        if (isim.length()>soy.length()){
            System.out.println("isminiz soy isminizden uzundur");
        } else if (isim.length()==soy.length()) {
            System.out.println("isminiz soy isminizle ayni uzunlukta");

        } else{
            System.out.println("soy isminiz isminizden uzundur");
        }

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        System.out.println("dort harfli bir kelime yaziniz");
        String klm = input.next();
        char bir = klm.charAt(0);
        char iki = klm.charAt(1);
        char uc = klm.charAt(2);
        char dort = klm.charAt(3);

        if (klm.length()==4){
            System.out.println("" + dort + uc + iki + bir);
        }else {
            System.out.println("dort harfli dedim");
        }


    }
}
