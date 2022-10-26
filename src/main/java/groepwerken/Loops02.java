package groepwerken;

import java.util.Scanner;

public class Loops02 {

    public static void main(String[] args) {
        //21) Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
        //Örnek:12133455 ´ 2+4=6

        int tamsayi = 12133455;
        String yeniTamsayi = String.valueOf(tamsayi);
        String sonTamsayi = "";
        int i = 0 ;
        while (i<yeniTamsayi.length()){
            char ts = yeniTamsayi.charAt(i);

            if (yeniTamsayi.indexOf(ts)==yeniTamsayi.lastIndexOf(ts)){

                sonTamsayi= sonTamsayi + ts;
            }
            i++;
        }

        int iki = Integer.valueOf(sonTamsayi);

        int sum = 0;

        while (iki>0){

            sum = sum + iki%10;


            iki=iki/10;
        }
        System.out.println(sum);





        //22) 5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.

        int j = 3;
        while (j<10){

            if (j!=5){
                System.out.print(j + " ");
            }
            j++;
        }



        System.out.println();
        //23) Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
        //Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
        //olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
        //yönlendiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz.");
        int number = input.nextInt();
        int count = 0;
        if(number>0) {
            if (number == 2) {
                System.out.println(number + " bir asal sayidir");
            }else {
                for(int k=2; k<number; k++) {
                    if(number%k==0) {
                        count++;
                    }
                }
                if(count==0) {
                    System.out.println(number + " bir asal sayidir ");
                }else {
                    System.out.println(number + " bir asal sayi degildir ");
                }
            }
        }else {
            System.out.println("Pozitif bir tam sayi giriniz ");
        }


        System.out.println();
        //24) Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz. Ardından bu fibonacci
        //sayılarını yazdıran kodu yazınız.
        //Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.







        //25) Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
        //Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir
        //Armstrong sayısıdır. Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek
        //için bir kod yazınız.


        //26) Kullanıcıdan bir String ve bir karakter alınız.
        //String'de verilen karakterin ilk olduğu index ile son tekrarlandığı index arasındaki karakter
        //sayısını sayınız.
        //Boşluk karakterlerini saymayınız.
        //Kod, kullanıcının seçtiği karakter String ‘de sadece bir kez varsa konsolda -1,
        //Kod, kullanıcının seçtiği karakter String ‘de yoksa konsolda -1 döndürsün.
        //Örneğin; "Java is easy" - 'a' ==> 5
        // "Java is easy" - 'w' ==> -1
        // "Java is easy" - 'e' ==> -1


        //27) Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
        //Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır.


        //28) Belirli bir sayıdan küçük tüm asal sayıları yazdıran bir kod yazınız.
        //Örnek: kullanıcı 20 girerse çıktı 2, 3, 5, 7, 11, 13, 17, 19 olacaktır.


        //29) Herhangi bir döngü kullanmadan 1'den 100'e kadar tam sayıları yazdıran bir program
        //yazınız.


        //30) Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Sözcükler değişmeden,
        //her giriş satırındaki sözcüklerin sırasını tersine çevirmek için kod yazınız.
        //Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        //Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir.


        //31) Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Her giriş satırındaki ilk
        //ve son sözcükler dışındaki sözcüklerin sırasını tersine çevirip sözcükleri değiştirmeden
        //kodu yazınız.
        //Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        //Örnek; Kemal Can Tan Han Kuzu, Kemal Han Tan Can Kuzu'ya dönüşecektir.







    }
}
