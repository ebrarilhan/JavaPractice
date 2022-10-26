package preclass;

import java.util.Scanner;

public class P02 {



    public static void main(String[] args) {

        int yas = 25;
        String tc = "0123456789";
        float boy = 1.55F;

        System.out.println(yas + " " + tc + " " + boy);

        String isim = "Ebrar";
        String soyIsim = "Ilhan";
        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyIsim);

        int x = 3463467;
        byte y = 34;
        System.out.println(x+y);

        long a = 34863298;
        double b = 31.567879;
        System.out.println(a+b);

        char h = '*';
        System.out.println(h);

        short s = 45;
        char c = 'A';
        System.out.println(c+s);

        int sayi1 = 10;
        int sayi2 = 20;

        sayi1=20;
        sayi2=10;
        System.out.println("sayi1 " + sayi1);
        System.out.println("sayi2 " + sayi2);

        int sayi3 = 3;
        int sayi4 = 4;
        sayi3++;
        sayi4--;
        sayi3=sayi3*10;
        sayi4=sayi4*10;
        System.out.println(sayi3);
        System.out.println(sayi4);

        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen bir tamsayi giriniz.");
//        int ilk = input.nextInt();
//        System.out.println("Lutfen bir tane daha tamsayi giriniz.");
//        int ikinci = input.nextInt();
//        int toplam = ilk+ikinci;
//        int carpim = ilk*ikinci;
//        boolean buyuk = ilk>ikinci;
//        int fark = ilk-ikinci;
//
//        if (buyuk){
//            System.out.println("" + toplam + " " + carpim + " " + fark);
//        }else{
//            System.out.println("kucukten buyugu cikartamazsiniz. toplam ve carpim sonuclari : " + toplam + " " + carpim);
//        }

        System.out.println("ismini gir");
        String ss = input.next();
        char sss = ss.charAt(0);
        System.out.println(sss);


        byte by = 34;
        short newBy = by;
        int intby = newBy;
        long longby = intby;
        float floatby = longby;
        double doubleby = floatby;
        System.out.println(doubleby);

        double dd = 255.36;
        int newDd = (int)dd;
        byte yeniDd = (byte)newDd;
        System.out.println(yeniDd);

        int mat = 25;
        double mat2 = 5.84957958;
        System.out.println(mat/mat2);





    }
}
