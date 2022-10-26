package groepwerken;

import java.util.Arrays;
import java.util.Comparator;

public class Arrayler {

    public static void main(String[] args) {

        /*
        1) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
        Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
         (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
         */

        double sayilar[] = {12, 5, 8, 7, 4, 1, 10, 21};


            if ((sayilar.length)%2==0){

                int sayi = (sayilar.length)/2;//4

                double sonuc = (sayilar[sayi] + sayilar[sayi-1])/2;
                System.out.println(sonuc);

            }else {
                int sayi2 = (sayilar.length)/2;
                System.out.println(sayilar[sayi2]);


            }




 //BUNA BAK
        /*
        2) String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
         */

        String[] isimler = new String[5];
        isimler[0]="Kemal";
        isimler[1]="Jonathan";
        isimler[2]="Mark";
        isimler[3]="Angie";
        isimler[4]="Veli";

        Arrays.sort(isimler, Comparator.comparingInt(String::length));


        String enKucuk = isimler[0];

        for (String w : isimler){

        }









//BUNA BAK
        /*
        3) Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        bulunuz.
        Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
         */

        int[] arr = {-12, 18, -5, 23, -2};

        Arrays.sort(arr);





        /*
        4) String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        alınız.
        Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JMJ

         */

        String brr[] = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
        String bos = "";
        for (String w : brr){
            if (w.endsWith("n") || w.endsWith("k")){

                bos = bos + w.charAt(0);
            }

        }
        System.out.println(bos);



        /*
        5) String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

         */

        String crr[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int sum = 0;
        for (String w : crr){

            sum = sum + w.length();
        }
        System.out.println(sum);


        /*
        6) Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.

         */

        String cumle = "Ahmet aksam eve gittikten sonra aklina koydugunu yapar.";
        String[] drr = cumle.split(" ");
        System.out.println(Arrays.toString(drr));
        int counter = 0;

        for (String w : drr){
            if (w.startsWith("a") || w.startsWith("A")){

                counter++;
            }
        }

        System.out.println(counter);

        /*
        7) Verilen bir String'deki sesli harf sayısını bulunuz.
         */
        String verilen = "Verilen bir String'deki sesli harf sayisini bulunuz.";
        String[] vrr = verilen.split(" ");


        int count = 0;
        for (String w : vrr){

                count = count + w.replaceAll("[^aeiouAEIOU]","").length();


        }
        System.out.println(count);



        /*
        8) İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
         */
        String[] grr = {"ada", "ala", "Mark", "Angie", "kabuk"};

        String bbos = "";

        for (String w : grr){

            if (w.charAt(0)==w.charAt(w.length()-1)){

                bbos = bbos + w + " ";
            }
        }

        System.out.println(bbos);






        /*

       9) Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.
         */

        String srr[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        Arrays.sort(srr);//siraya diziyor.

        int sonuc = Arrays.binarySearch(srr,"Veli");
        System.out.println(sonuc);//-1 veli icin 4

        if (sonuc>0){

            System.out.println("arrayde var");
        }else {
            System.out.println("arrayde yok");
        }



        /*
        10) Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.
         */

        /*
        11) Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

         */

        /*
        12) Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
        büyük öğeler arasındaki farkı konsolda yazdırınız.
         */

        int tamsayi[] = {5, -1, 2, 0, 3};

        Arrays.sort(tamsayi);
        System.out.println(Arrays.toString(tamsayi));

        int top = tamsayi[tamsayi.length-1] - tamsayi[0];
        System.out.println(top);

        /*
        13) Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
        konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
        Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.
         */




        









    }
}
