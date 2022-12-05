package uyap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Avukatlar {

    public static Scanner input = new Scanner(System.in);
    public static Map<String,AvukatBilgileri> girisBilgileri = new HashMap<>();

//// yeni kayit olan avukatlar icin sirayla baro numarasi veren bir sistem  yazabilirsin.
    //bunun icin belki sirali yazmaya yarayan mapler kullanilabilir

    public static void avukatHavuzu(){

        AvukatBilgileri av1 = new AvukatBilgileri("Ebrar","Ilhan","Istanbul",77755,1234);
        girisBilgileri.put("77755-Ebrar",av1);
        AvukatBilgileri av2 = new AvukatBilgileri("Said","Ilhan","Istanbul",65672,1071);
        girisBilgileri.put("65672-Said",av2);


    }

    public static void avukatKaydolma(){

        do {
            System.out.println("Lutfen adinizi giriniz.");
            String avukatAdi = input.nextLine();
            System.out.println("Soyadinizi giriniz.");
            String avukatSoyadi = input.nextLine();
            System.out.println("Bagli oldugunuz baro ilini giriniz");
            String avukatBarosu = input.next();
            System.out.println("Baro sicil numaranizi giriniz");
            int baroSicilNo = input.nextInt();
            System.out.println("uyap sifresi olusturunuz");
            int uyapGirisSifresi = input.nextInt();
            System.out.println("Kaydolma islemi basarili. e imzanizi Baronuzdan teslim aliniz.");
            AvukatBilgileri av = new AvukatBilgileri(avukatAdi,avukatSoyadi,avukatBarosu,baroSicilNo,uyapGirisSifresi);
            String eimza = baroSicilNo + "-" + avukatAdi;
            girisBilgileri.put(eimza,av);
            System.out.println(girisBilgileri);

        }while (true);

    }


}
