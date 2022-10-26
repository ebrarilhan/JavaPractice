package day06_nestedifswitch;

import java.util.Scanner;

public class C06SwitchCase {

    public static void main(String[] args) {
        //Ex: Girilen Pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız
        //Ex : 568
        //Besyuzaltmissekiz


        Scanner input = new Scanner(System.in);
        System.out.println("pozitif uc basamakli sayi giriniz");
        int sayi= input.nextInt();
        int sayi1 = sayi%10;
        int sayi2 = (sayi/10)%10;
        int sayi3 = sayi/100;

        if(sayi>99 && sayi<1000){

            switch (sayi3){

                case 1 :
                    System.out.print("yuz ");
                    break;
                case 2 :
                    System.out.print("iki yuz ");
                    break;
                case 3 :
                    System.out.print("uc yuz ");
                    break;
                case 4 :
                    System.out.print("dort yuz ");
                    break;
                case 5 :
                    System.out.print("bes yuz ");
                    break;
                case 6 :
                    System.out.print("alti yuz ");
                    break;
                case 7 :
                    System.out.print("yedi yuz ");
                    break;
                case 8 :
                    System.out.print("sekiz yuz ");
                    break;
                case 9 :
                    System.out.print("dokuz yuz ");
                    break;


            }
            switch (sayi2){
                case 0 :
                    System.out.print(" ");
                    break;
                case 1 :
                    System.out.print("on ");
                    break;
                case 2 :
                    System.out.print("yirmi ");
                    break;
                case 3 :
                    System.out.print("otuz ");
                    break;
                case 4 :
                    System.out.print("kirk ");
                    break;
                case 5 :
                    System.out.print("elli ");
                    break;
                case 6 :
                    System.out.print("altmis ");
                    break;
                case 7 :
                    System.out.print("yetmis ");
                    break;
                case 8 :
                    System.out.print("seksen ");
                    break;
                case 9 :
                    System.out.print("doksan ");
                    break;
            }

            switch (sayi1){
                case 0 :
                    System.out.print("");
                    break;
                case 1 :
                    System.out.print("bir");
                    break;
                case 2 :
                    System.out.print("iki");
                    break;
                case 3 :
                    System.out.print("uc");
                    break;
                case 4 :
                    System.out.print("dort");
                    break;
                case 5 :
                    System.out.print("bes");
                    break;
                case 6 :
                    System.out.print("alti");
                    break;
                case 7 :
                    System.out.print("yedi");
                    break;
                case 8 :
                    System.out.print("sekiz");
                    break;
                case 9 :
                    System.out.print("dokuz");
                    break;
            }


        }else {
            System.out.println("Sacmaladin yine");
        }


    }
}
