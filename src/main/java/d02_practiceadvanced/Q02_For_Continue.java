package d02_practiceadvanced;

import java.util.Scanner;

public class Q02_For_Continue {

    public static void main(String[] args) {

        /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

        Scanner input = new Scanner(System.in);
        int toplam = 0;


        for (int i = 1; i < 6; i++) {
            System.out.println("bir sayi giriniz");
            int sayi = input.nextInt();
            if (sayi>5 && sayi<10){
                System.out.println("girfiginiz sayi 5 ile 10 arasinda oldugundan isleme alinmyacaktir.");

                continue;
            }
            toplam+= sayi;//toplam==toplam+sayi

        }

        System.out.println(toplam);
    }
}
