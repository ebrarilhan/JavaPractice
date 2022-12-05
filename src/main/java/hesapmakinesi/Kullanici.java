package hesapmakinesi;

import java.util.Scanner;

public class Kullanici {

    static Scanner input = new Scanner(System.in);

    public static void secimAlma(){

        System.out.println("Yapmak istediginiz islemi giriniz...");
        System.out.println("toplama icin 1, cikarma icin 2, carpma icin 3, bolme icin 4'e basiniz");
        String secim = input.next();

        try{
            hataVer(secim);

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            secimAlma();
        }

        switch (secim){
            case "1":
                Toplama.veriyiAl();
                break;

        }



    }

    public static void hataVer(String secim){

        if (!(secim.matches("[1-4]{1}"))){
            throw new IllegalArgumentException("Lutfen gecerli bir sayi giriniz.");
        }

    }



}
