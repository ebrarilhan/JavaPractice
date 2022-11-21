package groepwerken;

import java.util.Arrays;
import java.util.Scanner;

public class G10_Loops2 {

    public static void main(String[] args) {
        //21) Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
        //Örnek:12133455 ´ 2+4=6

//        int tamsayi = 12133455;
//        String yeniTamsayi = String.valueOf(tamsayi);
//        String sonTamsayi = "";
//        int i = 0 ;
//        while (i<yeniTamsayi.length()){
//            char ts = yeniTamsayi.charAt(i);
//
//            if (yeniTamsayi.indexOf(ts)==yeniTamsayi.lastIndexOf(ts)){
//
//                sonTamsayi= sonTamsayi + ts;
//            }
//            i++;
//        }
//
//        int iki = Integer.valueOf(sonTamsayi);
//
//        int sum = 0;
//
//        while (iki>0){
//
//            sum = sum + iki%10;
//
//
//            iki=iki/10;
//        }
//        System.out.println(sum);





        //22) 5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.

//        int j = 3;
//        while (j<10){
//
//            if (j!=5){
//                System.out.print(j + " ");
//            }
//            j++;
//        }



//        System.out.println();
        //23) Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
        //Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
        //olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
        //yönlendiriniz.

//        Scanner input = new Scanner(System.in);
//        System.out.println("lutfen bir tam sayi giriniz.");
//        int number = input.nextInt();
//        int count = 0;
//        if(number>0) {
//            if (number == 2) {
//                System.out.println(number + " bir asal sayidir");
//            }else {
//                for(int k=2; k<number; k++) {
//                    if(number%k==0) {
//                        count++;
//                    }
//                }
//                if(count==0) {
//                    System.out.println(number + " bir asal sayidir ");
//                }else {
//                    System.out.println(number + " bir asal sayi degildir ");
//                }
//            }
//        }else {
//            System.out.println("Pozitif bir tam sayi giriniz ");
//        }



        //24) Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz. Ardından bu fibonacci
        //sayılarını yazdıran kodu yazınız.
        //Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.


//        System.out.println("Kac tane fibonacci sayisi gormek istiyorsunuz?");
//        int fib = input.nextInt();
//        int n1=0;
//        int n2=1;
//        int n3;
//
//        System.out.print(n2 + " ");
//        for (int k = 0 ; k <fib-1 ; k++ ){
//
//            n3=n1+n2;
//
//            System.out.print(n3 + " ");
//            n1=n2;
//            n2=n3;
//        }


//        System.out.println();
        //25) Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
        //Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir
        //Armstrong sayısıdır. Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek
        //için bir kod yazınız.
//        System.out.println("bir sayi giriniz");
//        int sayi = input.nextInt();
//        int top = 0;
//        int bas;
//
//        for (int k = sayi; k >0 ; k=k/10) {
//
//            bas=k%10;
//            top=top+(bas*bas*bas);
//
//        }
//        System.out.println(top);
//
//        if (top==sayi){
//            System.out.println("bu bir armstrong sayidir");
//
//        }else {
//            System.out.println("bu bir armstrong sayi degildir.");
//        }


        //26) Kullanıcıdan bir String ve bir karakter alınız.
        //String'de verilen karakterin ilk olduğu index ile son tekrarlandığı index arasındaki karakter
        //sayısını sayınız.
        //Boşluk karakterlerini saymayınız.
        //Kod, kullanıcının seçtiği karakter String ‘de sadece bir kez varsa konsolda -1,
        //Kod, kullanıcının seçtiği karakter String ‘de yoksa konsolda -1 döndürsün.
        //Örneğin; "Java is easy" - 'a' ==> 5
        // "Java is easy" - 'w' ==> -1
        // "Java is easy" - 'e' ==> -1

        Scanner scan = new Scanner(System.in);
//        System.out.println("Bir sey yaziniz");
//
//        String kelime = scan.nextLine();
//
//        System.out.println("Bir karakter giriniz");
//        char ch = scan.next().charAt(0);
//        int counter = 0;
//
//        if (kelime.indexOf(ch)<0){
//            System.out.println("-1");
//        } else if (kelime.indexOf(ch)==kelime.lastIndexOf(ch)) {
//            System.out.println("-1");
//
//        }else {
//            for (int k = kelime.indexOf(ch)+1; k < kelime.lastIndexOf(ch) ; k++) {
//
//                if (kelime.charAt(k)==' '){
//                    continue;
//
//                } else {
//                    counter++;
//                }
//            }
//            System.out.println(counter);
//
//        }







        //27) Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
        //Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır.

        System.out.println("toplam sayisi giriniz.");
        int toplam = scan.nextInt();
        int arr[] = {4, 6, 5, -10, 8, 5, 20};
        int idx = 0;



        for (int w : arr){


            for (int j = idx+1; j < arr.length; j++) {
                if (arr[idx] + arr[j] == toplam) {

                    System.out.println(arr[idx] + "+" + arr[j] + "=" + toplam);

                }

            }
            idx++;

        }


        //28) Belirli bir sayıdan küçük tüm asal sayıları yazdıran bir kod yazınız.
        //Örnek: kullanıcı 20 girerse çıktı 2, 3, 5, 7, 11, 13, 17, 19 olacaktır.


        System.out.println("bir sayi giriniz.");
        int bir = scan.nextInt();
        System.out.print(2 + " ");
        int counter =0;

        for (int i =3 ; i < bir ; i++) {


            for (int j = 2; j < i; j++) {

                if (i%j==0){
                    counter++;
                    break;
                }
            }
            if (counter==0){
                System.out.print(i + " ");

            }
            counter=0;

        }


        //29) Herhangi bir döngü kullanmadan 1'den 100'e kadar tam sayıları yazdıran bir program
        //yazınız.////////////////////////////////////////////


        System.out.println();
        //30) Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Sözcükler değişmeden,
        //her giriş satırındaki sözcüklerin sırasını tersine çevirmek için kod yazınız.
        //Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        //Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir.

        String girdi = "Kemal Can Kuzu";
        String bos = "";
        int bosluk = girdi.replaceAll("[^ ]","").length();

        for (int i = bosluk; i >=0 ; i--) {

            bos = bos + girdi.split(" ")[i]+ " ";
        }
        System.out.println(bos);


        //31) Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Her giriş satırındaki ilk
        //ve son sözcükler dışındaki sözcüklerin sırasını tersine çevirip sözcükleri değiştirmeden
        //kodu yazınız.
        //Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        //Örnek; Kemal Can Tan Han Kuzu, Kemal Han Tan Can Kuzu'ya dönüşecektir.

        String girdi2 = "Kemal Can Tan Han Kuzu";
        System.out.println(girdi2);
        String[] arr2 = girdi2.split(" ");
        System.out.println(Arrays.toString(arr2));
        String[] bosArr = new String[arr2.length];


        for (int i = 0; i < arr2.length; i++) {

            if (i==0 || i== arr2.length-1){

                bosArr[i] = arr2[i];
                continue;
            }


                bosArr[i] = arr2[arr2.length-(i+1)];



        }

        String bos2 = "";

        for (String w : bosArr) {

            bos2+= w + " ";

        }

        System.out.println(bos2);


    }
}
