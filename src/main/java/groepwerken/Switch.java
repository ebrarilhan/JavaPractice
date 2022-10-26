package groepwerken;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        //1) Yazdırmak için switch ifadesini kullanınız.
        //a) Aralık, Ocak, Şubat için "Kış"
        //b) Mart, Nisan, Mayıs için "Bahar"
        //c) Haziran, Temmuz, Ağustos için "Yaz"
        //d) Eylül, Ekim, Kasım için "Güz"
        //e) Diğerleri için "Geçersiz ay adı"



        //2) Ayın numarasını girdiğinizde ayın adını yazdırmak için bir switch ifadesi kullanınız.
        //Örneğin;
        //kullanıcı 1 girerse kodunuz "Ocak" yazmalıdır,
        //kullanıcı 2 girerse kodunuz "Şubat" yazmalıdır vb.
        //Kullanıcı geçersiz ay numarası girerse kodunuz "Geçersiz numara" yazmalıdır.


        //3) Verilen ay numaralarından başlayarak tüm ay adlarını yazdıran bir kod yazınız.
        //Örnek: Ay numarası 9 ise konsolda kodunuz Eylül Ekim Kasım Aralık olacaktır.


        //4) Cinsiyet "Erkek" ise "Erkek" yazdırınız.
        //Cinsiyet "Kadın" ise "Kız" yazdırınız.
        //Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
        //Not : Bu seçenekler dışındakilerini yoksayınız.


        //5) Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
        //Örnek: 2000 yılının Şubat ayında gün sayısı 29.


        //6) Switch ifadesini kullanarak, herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme
        //yapan basit bir hesap makinesi oluşturmak için kod yazınız.
        //a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
        //b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
        //c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
        //d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
        //e) Kullanıcı 10 ve -5 girdiğinde +, -, *, / 'den farklı bir işlem yaptığında kodunuz "Geçersiz İşlem" yazmalıdır.


        //7) Switch ifadesini kullanarak, mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir
        //dönüştürücü oluşturmak için kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
        //a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
        //b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
        //kodunuz "2" yazmalıdır (sayı dinamik olacak)
        //c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
        //d) Kullanıcı mildenKmye, saniyedenSaate, fahrenaytdanSantigarata ‘dan farklı bir işlem girdiğinde, kodunuz "Bu operatör, o dönüştürücü için tanımlanmadı" yazmalıdır.

        Scanner input = new Scanner(System.in);
        System.out.println(" hangisi cevirme islemini yapmak istiyorsun uzunluk; mil, saat icin saniye, sicaklik icin f...");

        String don = input.next().toLowerCase();
        System.out.println("donusturmek istediginiz degeri giriniz.");
        double deger = input.nextDouble();



        switch (don){

            case "mil" :
                System.out.println((deger*1.60) + " kmdir" );
                break;
            case "saniye" :
                System.out.println((deger/360) + " saattir.");
                break;
            case "f" :
                System.out.println((deger-273) + " C dir.");
                break;
            default:
                System.out.println("gecersiz islem");



        }


        //8) Bir Enum oluşturun ve içine CHROME, SAFARI, IE, FIREFOX, YANDEX gibi tarayıcı adlarını
        //koyunuz. Switch ifadesini kullanın ve CHROME için 'CHROME kullanıyorum', SAFARI için
        //'SAFARI kullanıyorum', 'IE için IE kullanıyorum', 'FIREFOX için FIREFOX kullanıyorum' ve
        //YANDEX için 'YANDEX kullanıyorum', CHROME, SAFARI, IE, FIREFOX, YANDEX'ten farklı
        //tarayıcılar için 'Geçersiz tarayıcı' yazınız.
        //Not: Geliştirici konsolunda enum oluşturmalısınız.

        //9) Adı 'Seasons' olan bir Enum oluşturun ve Enum da switch-on deyimini kullanarak
        //aşağıdakileri yazdırınız.
        //Kış için 'Snowboard yapmak'
        //Yaz ve bahar için 'Balık tutmak'
        //Sonbahar için 'Doğa yürüyüşü yapmak'

        //10) myClass isminde bir class oluşturunuz, class'ta size rastgele bir alfabetik karakter veren bir
        //yöntem oluşturun ve ardından yöntemi kullanarak aşağıdakileri yazdırınız.
        //'A' ve 'a' için "İlk Karakter" yazdırınız.
        //'B' ve 'b' için "İkinci Karakter" yazdırınız.
        //'C' ve 'c' için "Üçüncü Karakter" yazdırınız.
        //'D' ve 'd' için "Dördüncü Karakter" yazdırınız.
        //Diğerleri için "Diğer Karakterleri" yazdırınız.






















    }


}
