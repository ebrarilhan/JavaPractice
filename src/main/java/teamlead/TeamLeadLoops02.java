package teamlead;

import java.util.Scanner;

public class TeamLeadLoops02 {

    public static void main(String[] args) {


//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

        int sayi = 6;
        for (int i = 0; i <sayi ; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print(" ");

            }

            for (int j = i+1; j <=sayi ; j++) {

                System.out.print(j + " ");

            }

            System.out.println();

        }



//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21
//        22 23 24 25 26 27 28
//        29 30 31 32 33 34 35 36

        int kaca = 8;
        int x = 1;

        for (int i = 1; i <=kaca ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(x + " ");
                x++;
            }

            System.out.println();

        }



     /*
        Girilen bir stringdeki a harfi sayısını bulunuz.
         c harfine sıra gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */

        String str = "Bugün hava oldukca güzel.";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                count++;

            } else if (str.charAt(i)=='c') {
                break;

            }

        }
        System.out.println(count);

        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.


        Scanner input = new Scanner(System.in);
        System.out.println("bes sayi giriniz");
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        int s4 = input.nextInt();
        int s5 = input.nextInt();

        int arr[] = {s1,s2,s3,s4,s5};
        int top = 0;

        for (int w : arr){

            if (w>4 && w<11){
                continue;
            }
            top+=w;
        }

        System.out.println(top);



        // Aşağıdaki şekilde çıktı veren programı print içerisinde
// sadece bir tane # kullanarak yazıdırınız

//            #####
//            #####
//            #####
//            #####
//            #####


        int kare = 5;
        for (int i = 0; i < kare; i++) {

            for (int j = 0; j < kare; j++) {

                System.out.print("#");
            }
            System.out.println();

        }


        // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir string yaziniz.");
        String str2 = scan.nextLine().toLowerCase();
        String bos = "";

        for (int i = str2.length()-1; i >=0; i--) {

            bos += str2.charAt(i);

        }

        if (str2.equals(bos)){
            System.out.println("palindrome");
        }else {
            System.out.println("palindrome degil");
        }


        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.

        int rakam = 5;

        for (int i = 1; i < 11; i++) {

            for (int j = i; j <=i; j++) {

                System.out.print(rakam + " x " + j + " = " + rakam*j);

            }
            System.out.println();

        }


       /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */

        do {

            System.out.println("bir karakter giriniz");
            String sh = scan.next().toLowerCase();
            char ch = sh.charAt(0);
            boolean isHarf = (ch>= 'a' && ch<='z') || (ch>= 'A' && ch<='Z');
            boolean isChar = sh.length()==1;
            int countt=0;

            if (isHarf && isChar) {

                switch (ch) {

                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        countt++;
                        break;

                }

                if (countt>0){
                    System.out.println("sesli harf");
                }else {
                    System.out.println("sessiz harf");
                }

            }else {
                System.out.println("yanlis karakter girdiniz");
                break;
            }

        }while(true);


    }


}
