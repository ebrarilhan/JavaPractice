package day01_variables;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {
        //kullanicidan ad soyad memlekt konu yas boy kilo bilgilerini aliniz

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz.");
        String isim = scan.nextLine();

        // next line kullandik cunku iki isim yazabilir kullanici. next yazmadik

        System.out.println("lutfen soyadinizi giriniz");
        String soyad = scan.nextLine();

        System.out.println("memleket gir");
        String memleket = scan.nextLine();

        System.out.println("konum gir");
        String konum = scan.nextLine();

        System.out.println("yas gir");
        byte yas = scan.nextByte();

        System.out.println("boy gir");
        short boy = scan.nextShort();

        System.out.println("kilo gir");
        int kilo = scan.nextInt();

        System.out.println("javayi sevdin mi");
        boolean sevmek = scan.hasNextBoolean();





    }
}
