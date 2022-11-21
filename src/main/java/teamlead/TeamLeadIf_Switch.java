package teamlead;

import java.util.Scanner;

public class TeamLeadIf_Switch {

    public static void main(String[] args) {


        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.


        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz.");
        int sayii = input.nextInt();

        if (sayii>-1){

            if (sayii<10){

                System.out.println("bu sayi rakamdir");
            }else{

                System.out.println("pozitif sayi");
            }


        }else {

            System.out.println("negatif sayi");
        }



        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii değeri

        System.out.println("bir karakter giriniz.");
        char ch = input.next().charAt(0);


        if (ch>='A' && ch<='Z'){

            System.out.println("buyuk harf");
        } else if (ch>='a' && ch<='z') {
            System.out.println("kucuk harf");

        }else {
            System.out.println("harf degil");
        }

        input.close();


        // Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”

        System.out.println("lutfen pozitif bir tam sayi giriniz.");
        int tsayi = input.nextInt();

        if (tsayi>99 && tsayi<1000){

            System.out.println("uc basamakli");

        }else {
            if (tsayi%2==0){

                System.out.println("3 basamaklı olmayan çift sayı");
            }else {
                System.out.println("3 basamaklı olmayan tek sayı ");
            }
        }



        // 1- Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
        // 1. 0()dahil ile 50 arasi - D   2. 50(dahil) ile 60 arası - C   3. 60(dahil) ile 80 arası - B  4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
        // switch() kullanarak yapiniz.

        // switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
        // switch() de int, byte, short, char, String kullanilir.


        System.out.println("Lutfen notunuzu giriniz.");
        int not = input.nextInt();//58
        String notYeni = String.valueOf(not);

        char ilk = notYeni.charAt(0);//5
        char ikinci = notYeni.charAt(1);//8

        switch (ilk) {

            case '0' :
                System.out.println("D");
                break;
            case '1' :
                System.out.println("D");
                break;
            case '2' :
                System.out.println("D");
                break;
            case '3' :
                System.out.println("D");
                break;
            case '4' :
                System.out.println("D");
                break;
            case '5' :
                switch (ikinci){
                    case '0' :
                        System.out.println("D");
                        break;
                    default:
                        System.out.println("C");
                }



        }


        // 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        System.out.println("pozitif uc basamakli sayi giriniz");
        int sayi= input.nextInt();
        int sayi1 = sayi%10;
        int sayi2 = (sayi/10)%10;
        int sayi3 = sayi/100;

        if(sayi>99 && sayi<1000){

            switch (sayi3){

                case 1 :
                    System.out.print("yuz ");
                    break;
                case 2 :
                    System.out.print("iki yuz ");
                    break;
                case 3 :
                    System.out.print("uc yuz ");
                    break;
                case 4 :
                    System.out.print("dort yuz ");
                    break;
                case 5 :
                    System.out.print("bes yuz ");
                    break;
                case 6 :
                    System.out.print("alti yuz ");
                    break;
                case 7 :
                    System.out.print("yedi yuz ");
                    break;
                case 8 :
                    System.out.print("sekiz yuz ");
                    break;
                case 9 :
                    System.out.print("dokuz yuz ");
                    break;


            }
            switch (sayi2){
                case 0 :
                    System.out.print(" ");
                    break;
                case 1 :
                    System.out.print("on ");
                    break;
                case 2 :
                    System.out.print("yirmi ");
                    break;
                case 3 :
                    System.out.print("otuz ");
                    break;
                case 4 :
                    System.out.print("kirk ");
                    break;
                case 5 :
                    System.out.print("elli ");
                    break;
                case 6 :
                    System.out.print("altmis ");
                    break;
                case 7 :
                    System.out.print("yetmis ");
                    break;
                case 8 :
                    System.out.print("seksen ");
                    break;
                case 9 :
                    System.out.print("doksan ");
                    break;
            }

            switch (sayi1){
                case 0 :
                    System.out.print("");
                    break;
                case 1 :
                    System.out.print("bir");
                    break;
                case 2 :
                    System.out.print("iki");
                    break;
                case 3 :
                    System.out.print("uc");
                    break;
                case 4 :
                    System.out.print("dort");
                    break;
                case 5 :
                    System.out.print("bes");
                    break;
                case 6 :
                    System.out.print("alti");
                    break;
                case 7 :
                    System.out.print("yedi");
                    break;
                case 8 :
                    System.out.print("sekiz");
                    break;
                case 9 :
                    System.out.print("dokuz");
                    break;
            }


        }else {
            System.out.println("Sacmaladin yine");
        }


        System.out.println();
        // 3- Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız.

        //ocak, mart, mayis,temmuz,agustos, ekim, aralik 31
        // nisan, haziran,eylul, kasim 30
        // subat artik yillarda 29, diger yillarda 28 ceker

         /*

        "leap year" (artik yil)
        1) yil 100e bolunurse 400e de bolunmelidir. ==> 1600 artik yildirn 1800 degildir
        2) yil 100e bolunmezse 4 e bolunmelidir. ==> 1996 artik yildir. 2001 degildir.

         */

        System.out.println("bir ay ismi giriniz.");
        String ay = input.next();
        ay = ay.toLowerCase();
        boolean ay31 = ay.equals("ocak") ||
                        ay.equals("mart") ||
                        ay.equals("mayis") ||
                        ay.equals("temmuz") ||
                        ay.equals("agustos") ||
                        ay.equals("ekim") ||
                        ay.equals("aralik");

        boolean ay30 = ay.equals("nisan") ||
                        ay.equals("haziran") ||
                        ay.equals("eylul") ||
                        ay.equals("kasim");

        if (ay31){
            System.out.println("bu ay 31 cekmektedir.");
        } else if (ay30) {
            System.out.println("bu ay 30 cekmektedir.");

        } else if (ay.equals("subat")) {

            System.out.println("lutfen hangi yilda oldugunuzu yaziniz.");

            int yil = input.nextInt();

            if (yil%100==0){
                if (yil%400==0){


                    System.out.println(yil + " yilinda subat ayi 29 ceker");



                }else{

                    System.out.println(yil + " yilinda subat ayi 28 ceker");
                }



            } else {
                if (yil%4==0){

                    System.out.println(yil + " yilinda subat ayi 29 ceker");


                }else{
                    System.out.println(yil + " yilinda subat ayi 28 ceker");

                }


            }


        }else System.out.println("Lutfen gecerli bir ay ismi yaziniz.");





        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.


        //p.tes ise 1 sali ise 2 c.ba 3
        int gunNo = 6;


        if (gunNo<1 || gunNo>7){

            System.out.println("Hatali veri girdiniz.");
        }else {

            int kacGunSonrasi = 100;
            int bulunanGun = (kacGunSonrasi+gunNo)%7;

            switch (bulunanGun){

                case 1 :
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden sali");
                    break;
                case 3 :
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden carsamba");
                    break;
                case 4 :
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden persembe");
                    break;
                case 5 :
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden cuma");
                    break;
                case 6 :
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden cumartesi");
                    break;
                case 0 :
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden pazar");
                    break;
                default:
                    System.out.println("Lutfen gecerli bir deger giriniz");

            }
        }






    }
}
