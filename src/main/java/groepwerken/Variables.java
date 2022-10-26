package groepwerken;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {


        /*

        1) Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların
        toplamını konsola yazdırınız.

         */

        // byte < short < int < long (L/l kurali eger int araligi disindaysa) < float (F/f kurali ) < double ==> primitive
        // boolean ve char ==> primitive
        // String ==> non primitive

        double gomlek = 13.99;
        double sapka = 9.99;
        double corap = 10;
        double toplam = gomlek+sapka+corap;
        System.out.println(toplam);




        /*
        byte short int long float double
        2) Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
        değişkenlerin değerlerinin çarpımını konsolda yazdırınız.
        */

        float x = 34.56F;
        long y = 433;
        int z = 78;
        System.out.println(x*y*z);


/*
        3) Basit faizi bulmak için bir kod yazınız.
        Not: Basit faiz formülü = anapara * oran * yılDegeri /100
        */

        double anapara = 15000;
        double oran = 20;
        double yilDegeri = 50;
        System.out.println(anapara*oran*yilDegeri/100);





        /*


        4) Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
        toplamını ve çarpımını String ile yazdırınız.*/

        String toplami = "Toplam ve carpim ";
        long a = 4567;
        long b = 1234;
        System.out.println(toplami + (a+b) + " " + a*b);

        /*

        5) Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve bu değerleri iki
        ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.
        */
        boolean e = true;
        boolean f = false;
        System.out.println(e + " " + f);


/*
        6) 3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
        Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.
*/



/*
        7) İki tamsayıyı değiştirmek için bir kod yazınız.


         */



        Scanner input = new Scanner(System.in);

        System.out.println("2 sayi giriniz :");

        double n1 = input.nextDouble();

        double n2 = input.nextDouble();

        System.out.println("Degistirmeden once : " + n1 + " - " + n2);









    }
}
