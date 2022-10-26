package teamlead;

import java.util.Scanner;

public class TeamLeadIfStatement {

    public static void main(String[] args) {

        /*
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */
        Scanner input = new Scanner(System.in);
//        System.out.println("vize notu");
//        int vize = input.nextInt();
//        System.out.println("final notu");
//        int finalN = input.nextInt();
//        System.out.println("vizenin yuzde kac etki ettigini giriniz");
//        int vizeYuzdelik = input.nextInt();
//
//        int finalYuzdelik = 100-vizeYuzdelik;
//
//        double notOrt = (vize*vizeYuzdelik)/100 + (finalN*finalYuzdelik)/100;
//        System.out.println("not ortalamaniz = " + notOrt);
//
//        if (notOrt>49){
//            System.out.println("Tebrikler dersi başarı ile geçtiniz...");
//
//        }else{
//            System.out.println("Malesef dersten kaldınız...");
//        }







/*  Problem Tanımı
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
        Bu bir dik üçgendir
     */
        // a2+b2=c2
        //b2+c2=a2
        // a2+c2=b2


//        System.out.println("ilk kenari giriniz");
//        double ilk = input.nextDouble();
//        System.out.println("ikinci kenari giriniz");
//        double ikinci = input.nextDouble();
//        System.out.println("ucuncu kenari giriniz");
//        double ucuncu = input.nextDouble();
//
//        boolean dik1 = (ilk*ilk) + (ikinci*ikinci) == ucuncu*ucuncu;
//        boolean dik2 = (ilk*ilk) + (ucuncu*ucuncu) == ikinci*ikinci;
//        boolean dik3 = (ucuncu*ucuncu) + (ikinci*ikinci) == ilk*ilk;
//
//        if (dik1 || dik2 || dik3){
//
//            System.out.println("dik ucgendir");
//        }else {
//            System.out.println("dik ucgen degildir");
//        }





 /* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.
        ax^2 + bx + c=0
        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac// b 3 a 0.25 c  5
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */

        System.out.println("ax^2 + bx + c = 0 denkleminin koklerini bulamk icin a b ve c yi sirasiyla giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = (b*b) - (4*a*c);


        if (delta>0){

            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("iki kok vardir.");
            System.out.println("x1 = " + x1);//-2.75
            System.out.println("x2 = " + x2);//-3.25


        } else if (delta==0) {
            double x = -b/(2*a);
            System.out.println("bir tane kok vardir.");
            System.out.println("x = " + x);

        }else {
            System.out.println("kok yoktur");

        }





        /*Kullanici tarafindan girilen bir sayinin
         *mutlak degerini yazdirmak icin bir program yazin.
         */

//        System.out.println("0 dan farkli bir tam sayi giriniz");
//        int sayi = input.nextInt();
//
//        Object sonuc = sayi<0 ? (sayi*(-1)) : (sayi>0 ? sayi : "0 yazamazsiniz");
//        System.out.println(sonuc);




/*
        Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
        en kucuk olanlarini konsola yazdiriniz
        int num1
        int num2
        int num3
*/

//        System.out.println(" uc nunara giriniz");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();
//
//        if (num1>num2 && num1>num3){
//            if (num2>num3){
//                System.out.println("buyuk = " + num1 + " kucuk = " + num3);
//            } else {
//                System.out.println("buyuk = " + num1 + " kucuk = " + num2);
//
//            }
//
//        } else if (num2>num1 && num2>num3) {
//            if (num1>num3){
//                System.out.println("buyuk = " + num2 + " kucuk = " + num3);
//            } else {
//                System.out.println("buyuk = " + num2 + " kucuk = " + num1);
//
//            }
//
//        } else {
//            if (num1>num2){
//                System.out.println("buyuk = " + num3 + " kucuk = " + num2);
//            } else {
//                System.out.println("buyuk = " + num3 + " kucuk = " + num1);
//
//            }
//
//        }

        //2.yol;







                /*  Problem Tanımı
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.
    ipucu: her else komutundan sonra return; komutu kullanınız...
        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

//        System.out.println("lutfen gunu giriniz");
//        String gun = input.next();
//        System.out.println("lutfen ayi giriniz");
//        String ay = input.next();
//        System.out.println("lutfen yili giriniz");
//        String yil = input.next();
//        System.out.println("Gün ay yıl: 1 Yıl ay gün: 2 Ay gün yıl: 3 tuslayin  ");
//        int form = input.nextInt();
//
//
//        if (gun.length()==2 && gun.charAt(0)!='0') {
//
//
//        } else if (gun.length()==2 && gun.charAt(0)=='0') {
//
//
//        }else if (gun.length()==1){
//            gun="0" + gun;
//
//
//        }else{
//            System.out.println("gecerli gun degil");
//
//        }
//
//
//        if (form==1){
//
//            System.out.println("" + gun + "." + ay + "." + yil );
//        } else if (form==2) {
//            System.out.println("" + yil + "." + ay + "." + gun );
//
//        } else if (form==3) {
//            System.out.println("" + ay + "." + gun + "." + yil );
//
//        }else {
//
//            System.out.println("gecersiz form");
//        }


    }
}
