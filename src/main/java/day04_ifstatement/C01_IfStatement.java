package day04_ifstatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         *
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Y veya N harfi yaziniz");
        char x = input.next().charAt(0);

        if(x=='Y' || x=='y'){
            System.out.println("YES");

        }else if (x=='N' || x=='n') {
            System.out.println("NO");

        }else{
            System.out.println("gecerli bir harf giriniz.");
        }


    }
}
