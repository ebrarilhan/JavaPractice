package teamlead;

import java.util.Scanner;

public class TeamLeadLoops03 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
     */

        int yildiz = 5;
        for (int i = 1; i <=yildiz ; i++) {

            for (int j = yildiz-i; j >=1 ; j--) {

                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }


        /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

        System.out.println("1 den buyuk tam sayi giriniz.");
        int tamSayi = input.nextInt();
        int kareleriToplami = 0;

        for (int i = 1; i <= tamSayi; i++) {

            kareleriToplami+=i*i;

        }

        System.out.println(kareleriToplami);


        /* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */

        int toplam;
        int counter = 0;

        do {

            System.out.println("Lutfen bir sayi giriniz");
            int sayi1 = input.nextInt();
            counter++;
            System.out.println("Lutfen bir sayi daha giriniz");
            int sayi2 = input.nextInt();
            counter++;
            toplam=sayi1+sayi2;
            System.out.println("sayilarin toplami: " + toplam);

        }while(toplam<101);

        System.out.println(counter + " kere sayi girdin. bu kadar sayi yeter");



        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede �e� harfi 3 kere kullanilmis.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("bir harf giriniz.");
        char harf = scan.next().charAt(0);
        int say = 0;

        for (int i = 0; i < cumle.length() ; i++) {

            char ch = cumle.charAt(i);

            if (ch==harf){
                say++;
            }
        }

        if (say>0){
            System.out.println(harf + " harfi cumle icinde " + say +  " kere tekrarlanmistir");

        }else {
            System.out.println("girdiginiz harf cumle icinde bulunamadi.");
        }



        // Kullanicidan 2 sayi alalim.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplayalim.
        // 3, 3  sonuc = 27

        //2  3 = 2*2*2=8


        System.out.println("bir sayi giriniz");
        int taban = scan.nextInt();//2
        System.out.println("bir sayi daha giriniz.");
        int us = scan.nextInt();//5
        int hesapla = 1;

        if (taban!=0) {

            for (int i = 1; i <= us; i++) {

                hesapla = hesapla * taban;

            }

            System.out.println(hesapla);

        }else {
            System.out.println("taban 0 olamaz.");
        }



          /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)


        */

        System.out.println("Lutfen bir sayi giriniz.");
        int sayi = input.nextInt();
        int sum = 0;


        for (int i = 1; i < sayi; i++) {

            if (sayi%i==0){
                sum=sum+i;
            }

        }
        if (sum==sayi){
            System.out.println("mukemmel sayi");
        }else {
            System.out.println("mukemmel sayi degil");
        }






    }

}
