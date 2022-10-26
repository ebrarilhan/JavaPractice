package day05_ifstatement;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {


        // Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin


        Scanner input = new Scanner(System.in);
        System.out.println("yas");
        int yas = input.nextInt();

        if (yas > 64 && yas<100){
            System.out.println("emekli olabilirsin");
        }else if (yas<65 && yas>=0) {

            System.out.println((65-yas) + " yil daha calisman gerek.");
        }else{
            System.out.println("gecerli bir yas giriniz");
        }



    }
}
