package teamlead;

import java.util.Scanner;

public class TeamLeadLoops05 {
    public static void main(String[] args) {

         /*
aşağıdaki kod bloğunun çıktısı ne olur?
 */
        int i = 3;
        while (i < 6) {
            System.out.println(i);
            i += 1;
        }

        // A) 3
//    4
//    5
//    6

// B) 3 ****
//    4
//    5

// C) 1
//    2
//    3
//    4
//    5

          /*
         sayinin basamak degerlerinin toplamini while loop ile yapiniz
         */

        int sayi = 1996;
        int toplam = 0;
        int bolum;

        while(sayi>0){

            bolum=sayi%10;

            toplam+=bolum;

            sayi=sayi/10;
        }

        System.out.println(toplam);




            //Bir top 220m yükseklikten atılmaktadır.
            // Atıldıktan sonra, atıldığı yüksekliğin ¾ ü kadar yerden yukarı doğru zıplamaktadır
            // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
            // Bu ana kadar aldığı yolu ve yere vurma sayısını bulunuz.


        double yukseklik = 220;
        double toplamYol = 220;
        double yeniYukseklik=0;
        int yereVurma=0;

        do {
            yereVurma++;
            yeniYukseklik= yukseklik*0.75;
            toplamYol+=yeniYukseklik;
            yukseklik=yeniYukseklik;

        }while(yukseklik>1);


        System.out.println(toplamYol);
        System.out.println(yereVurma);

    }


}
