package day06_nestedifswitch;

import java.util.Scanner;

public class C01Ternary {

    /*
    TASK :
     Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
     Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
     3 basamaklı degilse çift olup olmadigini kontrol edin.
     Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
     Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" sifirdan buyuk pozitif bir tamsayı gir");
        int sayi = input.nextInt();

        if (sayi>99 && sayi<1000){
            System.out.println("3 basamakli");

        } else if(!(sayi>99 && sayi<1000) && sayi>0){
            if (sayi%2==0){
                System.out.println("3 basamaklı olmayan çift sayı");
            }else{
                System.out.println("3 basamaklı olmayan tek sayı");
            }
        }else {
            System.out.println("Lutfen sifirdan buyuk sayi yaziniz.");
        }


        //2.yol
        String sonuc = (sayi>0) ? ((sayi>99 && sayi<1000) ? "3 basamakli" :
                (sayi%2==0) ? ("3 basamaklı olmayan çift sayı") : ("3 basamaklı olmayan tek sayı")) :
                "Lutfen sifirdan buyuk sayi yaziniz.";

        System.out.println(sonuc);


    }

}
