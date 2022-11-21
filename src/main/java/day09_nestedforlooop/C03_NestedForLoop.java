package day09_nestedforlooop;

import java.util.Scanner;

public class C03_NestedForLoop {


    //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi =5 olsun
         /* tac uzunlugu -> 6 iken
            ^
            ^^
            ^^^
            ^^^^
            ^^^^^
            ^^^^^^
            |||
            |||
            |||
            |||
            |||
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("tas uzunlugu giriniz");
        int tac = input.nextInt();

        for (int i = 1; i <= tac; i++) {

            for (int j = 0; j < i ; j++) {

                System.out.print("^");

            }
            System.out.println();

        }

        for (int i = 0; i < tac-1 ; i++) {

            for (int j = 0; j < tac/2 ; j++) {
                System.out.print("|");
            }
            System.out.println();

        }


        //hocanin cozumu
        System.out.println();

        int tacUzunluk= 6;
        String yaprak="";
        for (int i = 0; i <tacUzunluk ; i++) {
            yaprak+="^";
            System.out.println(yaprak);
        }
        for (int i = 0; i <6 ; i++) {
            System.out.println("|||");
        }

    }
}
