package day05_ifstatement;

import java.util.Scanner;

public class C01_IfStatement {

    /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayi1");
        double a = input.nextDouble();
        System.out.println("sayi2");
        double b = input.nextDouble();

        if (a>0 && b>0){
            System.out.println(a+b);

        } else if (a<0 && b<0) {
            System.out.println(a*b);

        } else if (a==0 || b==0) {
            System.out.println("sifir carpmaya gore yutan elemandir");

        } else{
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        }

    }



















}
