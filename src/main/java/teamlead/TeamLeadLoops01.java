package teamlead;

import java.util.Scanner;

public class TeamLeadLoops01 {

    public static void main(String[] args) {

          /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
        //0+1=1
        // 1+1=2
        // 2+3=5


        //3+5=8
        //5+8=13

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.print(n1 + " " + n2);
        for (int i = 2; i < sayi; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }


        System.out.println();
    /*  Problem Tanımı
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).

         Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13       */

        for (int i = 100; i >= 0; i--) {

            if (i % 13 == 0) {

                System.out.println(i);
            }

        }



    /*  Problem Tanımı
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

       Örnek Ekran çıktısı
       1 2 3 4  5
       2 4 6 8 10
       3 6 9 12 15
       4 8 12 16 20
       5 10 15 20 25

       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */

        int satir = 5;
        int sutun = 5;

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= sutun; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }

        




        /*  Problem Tanımı
            Matrisin boyutunu kullanıcıdan okuyup.
            Sadece diyagonu (köşegeni) 1 olan ve
            diğer elemanları 0 olan bir kare matrisi ekrana bastırın.

           Ekran Çıktısı
            Bir sayı giriniz: 7
            1000000
            0100000
            0010000
            0001000
            0000100
            0000010
            0000001

            Bir sayi giriniz: 5
            10000
            01000
            00100
            00010
            00001
       */

        int boyut = 5;
        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <= boyut; j++) {

                if (j == i) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }

            }
            System.out.println();

        }





    /*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

        int satirr = 5;
        for (int i = 1; i <= satirr; i++) {

            for (int j = 1; j <= satirr - i; j++) {


                    System.out.print(" ");


            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */

        int kacSatir = 6;
        char ch = 65;


        for (int i = 0; i <kacSatir; i++) {

            for (int j = 0; j <=i; j++) {

                System.out.print((char)(ch + j) + " ");


            }


            System.out.println();

        }


    /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */

        int kacSatirr = 6;
        char chh = 65;


        for (int i = 1; i <=kacSatirr; i++) {

            for (int j = 1; j <=i; j++) {

                System.out.print(chh + " ");



            }
            chh++;

            System.out.println();

        }





        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        for (int i = 65; i<91 ; i++){

            System.out.print(i + " "  + (char)i + " ");

        }

        System.out.println();
        for (int i = 97; i <123 ; i++) {

            System.out.print(i + " " + (char)i + " ");

        }


    }
}
