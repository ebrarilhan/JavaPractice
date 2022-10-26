package preclass;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("tamsayi ver salak");
        int t = input.nextInt();

        if (t%2==0) {
            System.out.println("cift");
        }else{
            System.out.println("tek");
        }

        Scanner input2 = new Scanner(System.in);
        System.out.println("gun isimlerinden birinin bas harfini ver sana o harfle baslayan gunleri yazayim");
        String gun = input2.next();
        String kucuk = gun.toLowerCase();
        char yeni = kucuk.charAt(0);


        if (yeni=='p'){
            System.out.println("pazartesi persembe pazar");
        } else if (yeni=='s') {
            System.out.println("sali");
        } else if (yeni=='c') {
            System.out.println("carsamba cuma cumartesi");
        } else {
            System.out.println("gecerli bir bas harf giriniz");
        }

        Scanner input3 = new Scanner(System.in);
        System.out.println("gun ismi ver sana haftaici mi haftasonu mu diyeyim hadi bakalim");
        String hafta = input3.next();
        boolean dogru = hafta.equalsIgnoreCase("pazartesi") ||
                        hafta.equalsIgnoreCase("sali") ||
                        hafta.equalsIgnoreCase("carsamba") ||
                        hafta.equalsIgnoreCase("persembe") ||
                        hafta.equalsIgnoreCase("cuma");

        boolean dogru2 = hafta.equalsIgnoreCase("cumartesi") ||
                hafta.equalsIgnoreCase("pazar");
        if (dogru){
            System.out.println("haftaici");
        } else if (dogru2) {

            System.out.println("haftasonu");

        }else {
            System.out.println("gecerli bir gun ismi giriniz");
        }


        Scanner input4 = new Scanner(System.in);
        System.out.println("dikdortgenin kenar uzunluklarindan ilkini ver");
        double kare = input4.nextDouble();
        System.out.println("dikdortgenin kenar uzunluklarindan digerini ver sana kare olup olmadigini yazayim");
        double kare2 = input4.nextDouble();
        if (kare==kare2){
            System.out.println("kareedir");
        }else {
            System.out.println("kare degildir");
        }


        Scanner input5 = new Scanner(System.in);
        System.out.println("gun ismi ver sana hangi dinde kutsal oldugunu yazayim note sadece cuma cumartesi pazar");
        String gun2 = input5.next();
        if (gun2.equalsIgnoreCase("cuma")){
            System.out.println("muslumanlarin kutsal gunu");
        } else if (gun2.equalsIgnoreCase("cumartesi")) {
            System.out.println("yahudilerin kutsal gunu");
        } else if (gun2.equalsIgnoreCase("pazar")) {
            System.out.println("hristiyanlarin kutsal gunu");
        }else {
            System.out.println("sayilan gunlerin disindadir");
        }


        //ekstraaaa sacmalik
        Scanner input6 = new Scanner(System.in);
        System.out.println("bana bir sey soyle sana kim oldugunu soyleyeyim");
        String bisey = input6.nextLine();
        if (bisey.equalsIgnoreCase("ben malim")){
            System.out.println("hayir degilsin");
        }else{
            System.out.println("evet oylesin");
        }




















    }







}
