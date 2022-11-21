package teamlead;

import java.util.Arrays;
import java.util.Scanner;

public class TeamLeadLoops04 {
    public static void main(String[] args) {


                /*  Problem Tanımı
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6
        Faktöriyeli: 720

        Bir sayı giriniz: 3
        Faktöriyeli 6
     */
        int sayi = 6;
        int multiply = 1;
        for (int i = sayi; i > 0; i--) {
            multiply *= i;
        }
        System.out.println(multiply);



        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("bir karakter giriniz");
            String str = input.next();

            if (!str.equalsIgnoreCase("x")){

                System.out.println("program calisiyor");

            }else {
                System.out.println("program bitti");
                break;
            }


        }while(true);


        /*
aşağıdaki kod bloğunun çıktısı ne olur?
 */
        int x = 3;
        int i = 0;
        while (i < 3) {
            x += 1;  //x = x + 1
            i += 1;
        }
        System.out.println("x = " + x);
        System.out.println("i = " + i);




// A) x = 3
//    i = 0

// B) x = 6  ****
//    i = 3

// C) x = 9
//    i = 0


        //TODO --------GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

        int sayi2 = 12345;
        int toplam = 0;
        int bolum;

        for (int j = sayi2 ; j >0 ; j=j/10){

            bolum=j%10;
            toplam+=bolum;


        }

        System.out.println(toplam);


        //TODO INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        int pin = 14255;
        int deneme = 3;
        System.out.println("Pin kodunuzu giriniz.");

        do {

            int g = input.nextInt();

            if (pin==g){
                System.out.println("Pin dogru...");
                break;
            }
            System.out.println("Yanlis pin...");
            deneme--;

            if (deneme==0){
                System.out.println("Bloke oldu.");
                break;
            }

            System.out.println("Pin kodunuzu tekrar giriniz. " + deneme + " hakkiniz kaldi.");

        }while (true);


             /*
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */


        int girilen = 34;

        for (int j = 1; j <= girilen ; j++) {
            if (j%2!=0){

                System.out.print(j + " ");
            }

        }



        System.out.println();
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        System.out.println("bes sayi giriniz.");
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int a3 = input.nextInt();
        int a4 = input.nextInt();
        int a5 = input.nextInt();
        int max = 0;

        int[] arr = {a1,a2,a3,a4,a5};
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++) {

            max = Math.max(max,arr[j]);

        }

        System.out.println(max);


        // Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true  değilse false yazdırınız.
        // 16 -> evet,  5 -> hayır

        int c = 0;

        do {
            System.out.println("pozitif bir sayi giriniz.");
            int pozitif = input.nextInt();

            for (int j = 1; j <=pozitif; j++) {
                c=0;
                if (j*j==pozitif){
                    System.out.println("tam kare cunku: " + j+"x"+j+"="+pozitif);
                    c++;
                    break;
                }
            }

            if (c==0){
                System.out.println("tam kare degil");
                break;
            }

        }while(true);

    }

}
