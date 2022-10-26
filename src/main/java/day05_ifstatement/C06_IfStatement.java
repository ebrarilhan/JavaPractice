package day05_ifstatement;

import java.util.Scanner;

public class C06_IfStatement {

    public static void main(String[] args) {

        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
// Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
// Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
// Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
// Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

        Scanner input = new Scanner(System.in);
        System.out.println("sayi gir");
        int x = input.nextInt();
        int xx = Math.abs(x);


        boolean y = xx<10000 && xx>999;

        if (xx%5==0 && y){
            if ((xx%10)==0){
                System.out.println("5e bolunen cift sayi");


            } else  {
                System.out.println("5’e bölünen tek sayı");

            }

        }else if(xx%5!=0 && y){
            System.out.println("tekrar deneyin");
        }else{

            System.out.println("sayi dort basamakli degil");
        }


    }
}
