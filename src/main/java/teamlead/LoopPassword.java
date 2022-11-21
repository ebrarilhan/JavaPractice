package teamlead;

import java.util.Scanner;

public class LoopPassword {

    /*
     * kullanıcıdan bir şifre oluşturmasını isteyin.
     *en az olmalı
     * 1 özel karakter
     * 1 büyük harf
     * 1 küçük harf
     * 1 basamak rakam
     * şifre uzunluğu en az 8 karakter olmalıdır
     */
    // 1- Kullanıcıdan bir şifre oluşturmasını isteyin. koşulları söyle

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Sifrenizi giriniz.");
            System.out.println("en az bir karakter, bir buyuk, kucuk harf ve sayi icermeli" +
                    " uzunlugu en az 8 olmalidir");
            String sifre = input.nextLine();
            boolean uzunluk = sifre.length()>7;
            String harfler = sifre.replaceAll("[^A-Za-z]","");
            boolean kucukVar = harfler.toUpperCase()!=harfler;
            boolean buyukVar = harfler.toLowerCase()!=harfler;
            String sayilar = sifre.replaceAll("[^0-9]","");
            boolean sayiVar = sayilar.length()>0;
            String karakter = sifre.replaceAll("[A-Za-z0-9]","");
            boolean karakterVar = karakter.length()>0;

            if (uzunluk && kucukVar && buyukVar && sayiVar && karakterVar){

                System.out.println("sifreniz basariyla olusturulmustur.");
                break;

            }else {

                if (uzunluk==false){
                    System.out.println("uzunlugu 8den az olamaz");
                }
                if (kucukVar==false){
                    System.out.println("en az bir kucuk harf olmali");
                }
                if (buyukVar==false){
                    System.out.println("en az bir buyuk harf olmali");
                }
                if (sayiVar==false){
                    System.out.println("en az bir rakam olmali");
                }
                if (karakterVar==false){
                    System.out.println("en az bir karakter olmali");
                }

                System.out.println("Tekrar sifre olusturmaniz gerekecektir.");

            }

        }while(true);


    }
}
