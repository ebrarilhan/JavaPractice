package random;

import java.util.Scanner;

public class Ekstra2 {

    public static void main(String[] args) {

         /*

        kullanicidan alinan bir sayiyi tersine ceviren kodu yaziniz
         */

        Scanner input =new Scanner(System.in);
                System.out.println("bir sayi giriniz");
                int sayi = input.nextInt();//12345

                String ters = "";//54321

                while(sayi>0){

                    ters= ters + sayi%10;


                    sayi=sayi/10;

                }

               int son = Integer.valueOf(ters);
        System.out.println(son);


    }
}
