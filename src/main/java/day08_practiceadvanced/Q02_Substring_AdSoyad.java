package day08_practiceadvanced;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {
    public static void main(String[] args) {

        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

        Scanner input = new Scanner(System.in);
        System.out.println("ad soyad giriniz");

        String tamIsim = input.nextLine().trim();
        String ad = tamIsim.split(" ")[0];
        String soyad = tamIsim.split(" ")[1];

        System.out.println(ad);
        System.out.println(soyad);

        //2.yol

        int idx = tamIsim.indexOf(" ");
        System.out.println(tamIsim.substring(0,idx));
        System.out.println(tamIsim.substring(idx+1));



    }
}
