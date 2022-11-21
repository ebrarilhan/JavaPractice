package teamlead;
     /*
            Array’ler object’tir. Bu yuzden
    - Heap Memory’de depolanirlar.
    - Value ile birlikte method’lara da sahiptirler - runtime’da olusturulurlar.
    Bir Array nasil declare edilir? Array olusturmak icin iki yol vardir :
    - int myArray[ ] ; Bu daha cok kullanilir
    - int [ ] myArray;

    Bir Array nasil olusturulur..
    int myArray[ ] = new int[6];
    - Yukaridaki kod length’i 6 olan bir array olusturur.
    - Biz array’e eleman eklemezsek Java elemanlar icin data type’ina uygun
    default degerler atar.
    Eger yukaridaki array’i yazdirirsaniz ekranda {0, 0, 0, 0, 0, 0} gorursunuz
    Not: Array olustururken length’i yazmazsaniz compile time error alirsiniz.

    Array’e deger nasil atanir...
    int myArray[] = new int[3];
    myArray[0] = 9;
    myArraytl] = 10;
    myArray[2] = 11;
    Veya
    int myArray[] = {9, 10, 11};

    Array’in elemanlarina nasil ulasilir ve nasil update edilir ?
    int myArray[] = {9, 10, 11};
    Array elemanlarina index’ler kullanilarak ulasilir.
    myArray[0] ==> 9,
    myArray[1] ==> 10,
    myArray[2] ==> 11,
    NOT 1 : “n” array’in length’i olmak uzere myArray[n-1] son elemani gosterir
    NOT 2 : Bir Array’de olmayan index’i kullanmak isterseniz “ArraysIndexOutOfBoundsException” hatası alirsiniz.

     Multi Dimesional Array :
    Deger Atama -->int arr[][] = { {1, 2}, {3}, {4, 5, 6, 7}, {8, 9} };
    yazdırma-->System.out.println(Arrays.deepToString(arr));

    Bir Array’in uzunlugu nasil bulunur?
    int myArray[] = {9, 10, 11}; --> int size = myArray.length;
    NOT : String ve Array icin length method’larinda dikkatli olmak gerekir.
    Strings ==> length()
    Arrays ==> length

    Bir Array’in tum eleamanlari nasil yazdirilir?
    int myArray[] = {9, 10, 11};
    A) for(int i=0; i<size; i++) {
    System.out.println(myArray[i]);}
    B) System.out.println(Arrays.toString(myArray));

    Bir Array’in tum elemanlari nasil siralanir?
    int myArray[] = {9, 15, 11}; Arrays. sort (myArray);
    Siralama buyukten kucuge nasil yapilir ?
    - Once sort methodu kullanilir
    - Sonra siralamayi ters cevirmek icin loop kullanilir

    Bir Array’de istenen bir elemanin varligi nasil kontrol edilir?
    binarySearch() methodu belli bir elemanin bir array’de olup olmadigini kontrol etmek icin kullanilir.
    Not: binarySearch() methodunu kullanmadan once mutlaka sort() methodu kullanilmalidir.
    int[ ] numbers = { 2, 4, 6, 8 };
    System.out. printin (Arrays. binarySearch(numbers, 2)); =======> 0
    System.out. printin (Arrays. binarySearch(numbers, 4)); =======> 1

    Not: Eger bir eleman array’de yoksa output negatif olur.
    1) O eleman var olsaydi sira numarasi ka$ olurdu, bulunuz.
    2) Sira numarasinin negatif degeri binarySearch() outputu olur
    System.out.println(Arrays.binarySearch(numbers, 1)); =======> -1
    System.out.println(Arrays.binarySearch(numbers, 3)); =======> -2
    System.out.println(Arrays.binarySearch(numbers, 9)); =======> -5

    Iki array’in esit olup olmadigi nasil kontrol edilir?
    equals() method’u degerleri ve indexleri birlirkte kontrol edip, boolean bir deger return eder.

    Bir String nasil array’e cevrilir ?
    split() method’u String’e ait bir method’dur ve belirledigimiz ayirac’a gore String’i parcalara ayirip bir Array’e cevirir.


             */

public class Arrays01 {

    public static void main(String[] args) {

        /*
         Java'da String içindeki her karakterin oluşumunu saymak için bir Java programı yazın. Dize ise
         "Java Hungry" o zaman cevap olmalı

          Kullanıcıdan alınan bir String'deki herbir karakterin adedini bir dizi içinde bir java programı yazında.
          "Java Hungry" Stringi şöyle olmalıdır:
          { =1, a=2, r=1, u=1, v=1, g=1, H=1, y=1, J=1, n=1}
     */

        String str1 = "Java Hungry";
        String[] arr1 = str1.split("");

        for (String w : arr1){


        }





        //multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        // ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaz
        //örneğin {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

        // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
        // ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
        // java programi yazin

        //Array elemanlarinin matematige gore tersini alan bir method yazalim.
        //1,2,-3,4,-5,-6
        //-1,-2,3,-4,5,6

        //  // Kullan�c�dan 25.01.2000 format�nda tarih alaca��z ve bu tarihi yaz�ya �eviren java kodu yazal�m
        //yirmibes ocakikibin
        //"ocak", "subat", "mart", "nisan", "mayis", "haziran", "temmuz", "agustos","eylul", "ekim", "kasim", "aralik"
        //"bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"
        //"on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan"
        //"yuz", "ikiyuz", "ucyuz", "dortyuz", "besyuz", "altiyuz", "yediyuz","sekizyuz", "dokuzyuz"
        //"bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin","sekizbin", "dokuzbin"

        /*
         * Bir array'deki en buyuk ve en kucuk sayiyi iki ayri methodda Arrays.sort() methodu
         * kullanmadan method olusturucak sekilde yapiniz
         */

        // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
        // ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
        // java programi yazin

        /* bir multidimensional array'i parametre olarak kabul eden bir method yazin
         * bu method array'deki elemanlari arraylist'e aktarsin
         * ve arraylist'i natural order'a gore yazdirin
         *
         * Eg : Input : {{John,Brad,Fox},{Lee,Ali},{Suzan}}
         * 		Output:[Ali, Brad, Fox, John, Lee, Suzan]
         */




        /*

    iki ayrı int array oluşturun. İkisinin de eleman sayısı  5 olsun.

    Elemanlar .random atansın. (15 e kadar - 15 dahil)


    2 int array'i de ekrana yazdırınız.  (1.dizi =
                                                            2.dizi=        )



    Eğer iki arrayda ortak elemanlar varsa o elemanları yazdırınız.
    Yoksa, "ortak eleman yoktur" mesajını konsola yazdırınız.

    ÖRNEK:
    1.Dizi : [1,2,3,4,5]
    2.Dizi : [4,5,6,7,8]

    ortak eleman: 4     ortak eleman: 5

        // TODO: 1  İpucu :

               Ortak eleman ararken oluşturacağınız koşula int count ekleyin.
    Eğer ortak eleman varsa count++
    Eğer ortak eleman yoksa, count==0 ise           "ortak eleman yoktur".

         */










    }
}
