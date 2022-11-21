package d08_practiceadvanced;

import java.util.Scanner;

public class Q03_String_RakamlarToplami {

    /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir string giriniz.");
        String str = input.nextLine();

        //1. yol
//        String rakam = str.replaceAll("[^0-9]","");
//        System.out.println(rakam);
//
//        int r = Integer.valueOf(rakam);
//        int bolum;
//        int toplam = 0;
//
//        for (int i = r; i >0 ; i=i/10) {
//            bolum=i%10;
//
//            toplam+=bolum;
//
//        }
//
//        System.out.println(toplam);

        //2.yol

        rakamlarToplami(str);


    }

    static void rakamlarToplami(String str){

        int toplam = 0;
        for (int i = 0; i < str.length() ; i++) {

            if(Character.isDigit(str.charAt(i))){
                toplam+=Integer.valueOf("" + str.charAt(i));//char in ascii degerini almamak icin hicik koyduk.


            }

        }

        System.out.println("rakamlar top : " + toplam);


    }
}
