package day01_variables;

public class C04_Java_Variables {

    // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin

    public static void main(String[] args) {

        String name = "Ahmet";

        System.out.println("Adi: " + name);

        char bas = 'A';

        System.out.println("Bas harfi: " + bas);

        int age = 26;

        System.out.println("Yasi: " + age);

        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        int x = 25;
        short y = 124;

        System.out.println("iki farkli data turunun toplami " + (x + y));

        //4- Bir tamsayi ve bir ondalikli variable olusturun
        //bunlarin toplamini yazdirin

        int a = 56;
        float b = 14.95F;

        System.out.println(a+b);

        //5 – char data turunde bir variable olusturun ve yazdirin

        char sembol = '*';
        System.out.println("sembol: " + sembol);

        //6-Peki bir tamsayi ile bir harfi toplayabilirmiyiz.

        char harf = 'A';
        int tamsayi = 23;

        //1. yontem: hoca sout biraz sade olsun diye bu yontemi oneriyor
        //bu sadece bu soru icin degil normalde de kullanilabilir

        int toplam = tamsayi+harf;
        System.out.println(toplam);



        //2. yontem

        System.out.println(harf + tamsayi);

        //bir harfin ascii degerini bulmak icin 0 ile toplama islemi yaptirabiliriz.

        int sayi = 0;
        char bilmek = 'E';

        System.out.println(sayi + bilmek);

        // Initializing Variable  (variable baslangic degeri verme)
        int age2 = 26;

        //  Soru-1 :   konsola      "Hello ", "World  //"        seklinde yazdiriniz

        String hello = "Hello World";

        System.out.println(hello);
















    }

}
