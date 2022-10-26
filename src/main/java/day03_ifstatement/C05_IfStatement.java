package day03_ifstatement;

import java.util.Scanner;

public class C05_IfStatement {

    public static void main(String[] args) {

        //kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islemden
        // biri ile isleme koyup sonucu yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen\n toplama islemi icin 1 \n cikarma icin 2 " +
                "\n bolme icin 3 \n carpma icin 4 giriniz");
        int x = input.nextInt();
        System.out.println("lutfen iki tam sayi giriniz.");
        double y = input.nextDouble();
        double z = input.nextDouble();

        if(x==1){
            System.out.println("toplama isleminin sonucu: " + y + "+" + z + "=" + (z+y));
        } else if (x==2) {
            System.out.println(y-z);

        } else if (x==3) {
            System.out.println(y/z);

        } else if (x==4) {
            System.out.println(y*z);

        }else{
            System.out.println("hatali bir islem girdiniz.");
        }

    }
}
