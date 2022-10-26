package mijnhuiswerk;

import java.util.Scanner;

public class HJava03 {

    public static void main(String[] args) {
        // example1 Kullanıcının girdiği 4 basamaklı sayının ilk ve son rakamının toplamını
        //ekrana yazdıran bir program yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen dort asamakli sayi giriniz");
        int sayi = input.nextInt();
        int sayi1 = sayi%10;
        int sayi2 = sayi/1000;

        System.out.println(sayi1+sayi2);

        // example 2 Kullanıcının girdiği 3 basamaklı sayının tüm rakamlarının toplamını
        //ekrana yazdıran bir program yazınız.

        Scanner input2 = new Scanner(System.in);
        System.out.println("lutfen uc basamakli bir sayi giriniz");
        int a = input.nextInt();
        int b = a%10;
        int c = (a/10)%10;
        int d = a/100;

        System.out.println(b+c+d);


         //bir variable degerini arrtirma
         //example 3 Bir int variable oluşturunuz ve bu variable’ın değerini 3 farklı yoldan
       // 1 artırınız.

        int yas = 25;
        yas = yas + 1;

        double boy = 1.55;
        boy = boy += 1;

        byte x = 23;
        x++;

        short y = 54;//bu carpma islemi
        y = y*=2;
        System.out.println(yas);
        System.out.println(boy);
        System.out.println(x);
        System.out.println(y);

        //int numA = 2;
        //int numB = 3;
        //String str1 = “Çok”
        //String str2 = “Çalış”
        //Aşağıdaki çıktıları ekrana yazdırmak icin program yazınız.
        //A) Çok Çalış B) 5 Çok C) Çalış23 D) Çok1

        int numA = 2;
        int numB= 3;
        String str1 = "Cok";
        String str2 = "Calis";

        //A

        System.out.println(str1 + " " + str2);

        //B

        System.out.println((numA+numB) + " " + str1);

        //C

        System.out.println(str2 + "" + numA + numB);

        //D

        System.out.println(str1 + (numB-numA));

        //int n1 = 2;
        //int n2= 3;
        //String s1 = “Study”
        //String 2 = “Hard”
        //Yukarıdaki variable’lari kullanarak ekrana “61 Study-1”
        //yazdıran bir program yazınız.

        int n1 = 2;
        int n2 = 3;
        String s1 = "Study";
        String s2 = "Hard";

        System.out.println((n1*n2) + "" + (n2-n1) + " " + s1 + "" + - + 1);









    }
}
