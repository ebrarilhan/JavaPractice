package groepwerken;

import java.util.Scanner;

public class G07_IfStatement {

    public static void main(String[] args) {

        /*

        1) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "İlkbahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Sonbahar"
        e) Diğerleri için "Geçersiz ay adı"
        */

        Scanner input = new Scanner(System.in);
//        System.out.println("ay ismi giriniz");
//        String a = input.next();
//        boolean b = a.equalsIgnoreCase("Aralik") ||
//                a.equalsIgnoreCase("Ocak") ||
//                a.equalsIgnoreCase("Subat");
//        boolean b1 = a.equalsIgnoreCase("Mart") ||
//                a.equalsIgnoreCase("Nisan") ||
//                a.equalsIgnoreCase("Mayis");
//        boolean b2 = a.equalsIgnoreCase("Haziran") ||
//                a.equalsIgnoreCase("Temmuz") ||
//                a.equalsIgnoreCase("Agustos");
//        boolean b3 = a.equalsIgnoreCase("Eylul") ||
//                a.equalsIgnoreCase("Ekim") ||
//                a.equalsIgnoreCase("Kasim");
//        if (b){
//            System.out.println("Kis");
//
//        } else if (b1) {
//            System.out.println("Ilkbahar");
//
//        } else if (b2) {
//            System.out.println("Yaz");
//
//        } else if (b3) {
//            System.out.println("Sonbahar");
//
//        }else {
//            System.out.println("Gecersiz ay");
//        }





/*
        2) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
        c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
        Not: Çözümdeki koşulların sıralarına dikkat ediniz.
*/
        //1) sifrede bosluk karakteri olmayacak ve karakter sayisi en az 8 gecerli sifre
        //2) bosluk varsa kulanmayin
        //3) ikiside olmazsa gecersiz sifre

//        String pwd = "asdfgtgsdr";
//
//        if (!pwd.contains(" ")){
//
//            if (pwd.length()>9){
//                System.out.println("Gecerli Sifre");
//            }else{
//                System.out.println("Gecersiz Sifre");
//            }
//
//
//        }else {
//            System.out.println("Şifrede boşluk karakteri kullanmayınız");
//        }




        /*
        3) Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
        Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb.


*/
//        int ayNo = 9;
//        if (ayNo==1){
//            System.out.println("Ocak");
//        } else if (ayNo==2) {
//            System.out.println("Subat");
//        }  else if (ayNo==3) {
//            System.out.println("Mart");
//        }else if (ayNo==4) {
//            System.out.println("Nisan");
//        }else if (ayNo==5) {
//            System.out.println("Mayis");
//        }else if (ayNo==6) {
//            System.out.println("Haziran");
//        }else if (ayNo==7) {
//            System.out.println("Temmuz");
//        }else if (ayNo==8) {
//            System.out.println("Agustos");
//        }else if (ayNo==9) {
//            System.out.println("Eylul");
//        }else if (ayNo==10) {
//            System.out.println("Ekim");
//        }else if (ayNo==11) {
//            System.out.println("Kasim");
//        }else if (ayNo==12) {
//            System.out.println("Aralik");
//        }else{
//            System.out.println("lutfen gecerli bir numara giriniz.");
//        }


        /*
        4) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”*/

//        int yuv = 12639;
//        if (yuv%10>4){
//
//            System.out.println((yuv/10+1)*10);
//        }else {
//            System.out.println((yuv/10)*10);
//        }



/*
        5) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen" */

//        double ken = 4;
//        double ken2 = 4;
//        double ken3 = 4;
//
//        if (ken==ken2 && ken2==ken3){
//
//            System.out.println("eskenar ucgen");
//        } else if (ken==ken2 || ken2==ken3 || ken==ken3) {
//            System.out.println("ikizkenar ucgen");
//        } else {
//            System.out.println("cesitkenar ucgen");
//        }



/*
        6) Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
        kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
        a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
        b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
        kodunuz "2" yazmalıdır (sayı dinamik olacak)
        c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
        */









/*
        7) Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.

        a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.

//        b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
//         "Ali" veya "Can" veya "ali"

        c)Kodunuz  "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.


//        d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
//        yazmalıdır.


//        e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
//        yazmalıdır.

        Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
        görünmelidir. Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve
        "Geçersiz Ad"

        */

        System.out.println("tam adinizi giriniz");
        String tamIsim =input.nextLine();//Ali Can


        //c sarti icin
        String tumHarflerBuyuk = tamIsim.toUpperCase();//ALI CAN

        //d sarti icin
        int tamIsimUzunluk = tamIsim.length();
        int basSonBosluklarsizUzunluk = tamIsim.trim().length();//Ali Can


        //e sarti icin
        String harfleryok = tamIsim.replaceAll("[A-Za-z]","");//
        String harflerVeBoslukyok = harfleryok.replaceAll(" ","");//


        if (tamIsim.contains(" ")){
            //a sarti icin
            String isim = tamIsim.split(" ")[0];//Ali icin
            String soyisim = tamIsim.split(" ")[1];//Can icin


            if ((basSonBosluklarsizUzunluk==tamIsimUzunluk) && tamIsim.replaceAll("[^ ]","").length()==1){

                if (harflerVeBoslukyok.length()==0){

                    if ((isim.charAt(0)>='A' && isim.charAt(0)<='Z') && (soyisim.charAt(0)>='A' && soyisim.charAt(0)<='Z')){

                        if (!tumHarflerBuyuk.equals(tamIsim)){

                            System.out.println("isim dogru");

                        }else {

                            System.out.println("Format hatası");
                        }

                    }else {

                        System.out.println("Baş harflerinde hata");
                    }

                }else {
                    System.out.println("Geçersiz Ad");
                }

            }else {

                System.out.println(" Isim girilmedi");
            }

        }else {

            System.out.println("Ad veya soyadı eksik");
        }




        /*

        8) ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
        a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla olamaz" yazmalıdır.
        b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
        c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır.
        Not: Kısaltmada 1'den fazla hata varsa ilgili tüm hata mesajları yazdırılmalıdır.
        örnek; "fl3" için kodunuz; "Eyalet kısaltmaları 2 karakterden fazla olamaz", "Eyalet kısaltmaları
        küçük harf içeremez", ve "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez"
        yazmalıdır.
*/




        /*
        9) Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
        oluşturmak için kod yazınız.
        a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
        b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
        c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
        d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
        */




        /*

        10) Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod
        yazınız.
        Geçersiz BMI değeri < 0
        Zayıf = <18.5
        Normal ağırlık = 18.5–24.9
        Fazla kilolu = 25–29.9
        Obezite = 30 veya daha büyük BMI

         */
    }
}
