package day02_variables;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son
        //  rakaminin toplamini ekrana yazdiran programi yazdiriniz

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("4 basamakli bir sayi giriniz");
//
//        int sayi = input.nextInt();
//
//       int son = sayi%10;//bir sayiin birler basamagindaki rakami %10 ile hesaplatabiliriz
//       int ilk = sayi/1000;
//
//        System.out.println("toplam " + (son + ilk));

        //  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini
        //  birler, onlar ve yuzler basamagi olarak yazdirin

        // hocanin yaptigi

//        Scanner input = new Scanner(System.in);
//        System.out.println("3 basamakli bir sayi giriniz");
//        int sayi = input.nextInt();
//        // 1) 1 ler basamagindaki sayiyi bulun
//        int birler = sayi % 10;
//        System.out.println("girdiginiz sayinin birler basamagi " + birler);//3
//        sayi=sayi / 10;
//        //sayi /= 10;
//        System.out.println("ikiBas = " + sayi);//85
//        // 2) 10 lar basamagindaki sayiyi bulun
//        int onlar = sayi % 10;
//        System.out.println("girdiginiz sayinin onlar basamagi " + onlar);//5
//        sayi = sayi / 10;
//        // 3) 100 ler basamagindaki sayiyi bulun
//        int yuzler = sayi;
//        System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);
//
//        // benim yaptigim
//
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lütfen 3 basamaklı bir sayi giriniz:");
//        int sayii = scan.nextInt();
//        int birler = sayii%10;
//        int onlar = (sayii/10)%10;
//        int yuzler = sayii/100;
//
//        System.out.println("birler basamagi " + birler);
//        System.out.println("onlar basamagi " + onlar);
//        System.out.println("yuzler basamagi " + yuzler);
//
//       // Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve
//        // son 2 basamagindaki rakamlarin toplamini bulunuz
//        //         *   Ex :
//        //         *   input  : 12345==>1+2+4+5=12
//        //         *   output : 12
//
//        Scanner input2 = new Scanner(System.in);
//
//        System.out.println("Lutfen bes basamakli bir sayi giriniz.");
//        int sayiii = input.nextInt();
//        int a = sayiii%10;
//        int b = (sayiii/10)%10;
//        int c = (sayiii/1000)%10;
//        int d = sayiii/10000;
//
//        System.out.println(a+b+c+d);

        // Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve
        // son 2 basamagindaki SAYILARIN toplamini bulunuz

//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("bes basamakli sayi gir.");
//        int bes = scan2.nextInt();
//        int x = bes%100;
//        System.out.println(x);
//        int y = bes/1000;
//        System.out.println(y);
//        System.out.println("toplam " +(x+y));

        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz

//         *   Ex :
//         *   input  : 12345==>1+2+4+5=12
//         *   output : 12

        // hocanin yaptigi:



        Scanner input = new Scanner(System.in);

        System.out.println(" Lutfen 5 basamakli bir sayi giriniz ");

        int num=input.nextInt();

        int ilkIkirkm=num/1000;
        System.out.println("ilkIkirkm = " + ilkIkirkm);
        int ilkIkiTop=(ilkIkirkm%10)+(ilkIkirkm/10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);

        int sonIkiRkm=num%100;
        System.out.println("sonIkiRkm = " + sonIkiRkm);
        int sonIkiTop=(sonIkiRkm%10)+(sonIkiRkm/10);
        System.out.println("sonIkiTop = " + sonIkiTop);

        int toplam=ilkIkiTop+sonIkiTop;
        System.out.println("toplam = " + toplam);











    }
}
