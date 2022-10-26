package day02_variables;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//
//        System.out.println("lutfen isminizi giriniz.");
//
//        String isim = input.nextLine();
        // noktadan sonra nexti secersek sadece ilk kelimeyi alir.
        //nextline secersek hepsini alir

        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini
        // ve dairenin alanini hesaplatan bir program yazdirin
        // ( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )

        System.out.println("lutfen dairenin yaricapini giriniz.");
        double yaricap = input.nextDouble();

        double r = 3.14;

        System.out.println("dairenin cevresi "+ 2*yaricap*r);
        System.out.println("dairenin alani "+ yaricap*yaricap*r);


        //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip
        // o dikdortgenin alan ve cevre hesabini yapan bir program yaziniz.

        Scanner input2 = new Scanner(System.in);

        System.out.println("dikdortgenin kisa kenarini giriniz");
        double kisaKenar = input2.nextDouble();
        System.out.println("dikdortgenin uzun kenarini giriniz");
        double uzunKenar = input2.nextDouble();

        System.out.println("dikdortgenin alani " + kisaKenar*uzunKenar);
        System.out.println("dikdortgenin cevresi " + (kisaKenar+uzunKenar)*2);

        //Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin cevresini hesaplayan
        // bir program yaziniz.(byte kullanin) Ucgenin cevresi=a+b+c

        Scanner input3 = new Scanner(System.in);
        System.out.println("ucgenin uc kenar uzunlugunu giriniz");
        byte kenar = input3.nextByte();
        byte kenar2 = input3.nextByte();
        byte kenar3 = input3.nextByte();

        System.out.println("cevresi " + (kenar+kenar3+kenar2));

        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir
        // gorunum olusturan bir kod yaziniz

/*
             A
            A A
           A A A
    */

        Scanner input4 = new Scanner(System.in);
        System.out.println("herhangi bir sey giriniz");
        char a = input4.next().charAt(0);

        System.out.println("  " + a + "  ");
        System.out.println(" " + a + " " + a + " ");
        System.out.println(a + " " + a + " " + a);

        //ekstraaa ahmet alistirmasi

        String a2 = "Ahmet";
        System.out.println("      " + a2 + "   ");
        System.out.println("   " + a2 + " " + a2);
        System.out.println(" " + a2 + " " + a2 + " " + a2);
        System.out.println(a2 + " " + a2 + " " + a2 + " " + a2);








    }
}
