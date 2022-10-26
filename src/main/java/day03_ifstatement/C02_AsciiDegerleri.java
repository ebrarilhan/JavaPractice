package day03_ifstatement;

public class C02_AsciiDegerleri {

    public static void main(String[] args) {

        char r1 = 'a';
        char r2 = 'A';

        System.out.println("r1>r2 ==> " + (r1>r2));
        //karsilastirma islemlerinin sonucu true ya da false doner, yani boolean

        // buyuk haflerein ascii degeerleri kucuk harflerin ascii degerlerinden daha
        // kucuktur.

        // herhangi bir degerin ascii degerini kod yazarak bulunuz.

        // 1. yol

        char r3 = 'E';
        System.out.println(r3+0);

        char r4 = 'E';
        System.out.println("S'nin ascii degeri: " + (r4+0));

        // 2. yol
        int r5 = 'm';
        System.out.println(r5);

        // charlarda java char karaktere integer da atayabiliriz. bu sekilde bize matematiksel
        // deger verir. cunku charlarin bi resim karakteri bir de matematiksel ascii degeri
        //vardir. boylece ascii degerlerini hesaplayabiliriz.

        byte b1 = 12;
        byte b2 = -125;
        System.out.println("b1>b2 ==> " + (b1>b2));

        float f1 = 2.45645f;
        float f2 = 5.86786f;

        System.out.println("f1>f2 ==> " + (f1>f2));
        System.out.println("b1>f1 ==> " + (b1>f1));

        long l1 = 34645645L;
        System.out.println(b1<l1);

        char c1 = 'h';
        System.out.println(b1>c1);











    }
}
