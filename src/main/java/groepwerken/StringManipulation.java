package groepwerken;

public class StringManipulation {

    public static void main(String[] args) {
        /*


        1) Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
            ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
            yazdırınız.
                Örnek: mIAMI - Miami
                miami - Miami
                MIAMI - Miami
                mIaMi - Miami
               */

                String a = "istANBuL";//lenght-1+1
                String b = a.substring(0,1).toUpperCase();
                String cc = a.substring(1,a.length()).toLowerCase();
        System.out.println(b+cc);



/*
          2) Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
             karakter sayısının toplamını yazdırınız.
                Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
*/
                String c = "Ali Can";
                String d = "Merve Star";
                String e = "Mark Tom";



               int newC = c.replace(" ","").length();
               int newD = d.replace(" ","").length();
               int newE = e.replace(" ","").length();



        System.out.println(newC+newD+newE);


        /*
            3) Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
            konsolda yazdırınız.
            Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
            */

        String f = "   Miami   33018!!!  /^^  ";
        int newF = f.replaceAll("[^A-Za-z0-9]","").length();
        System.out.println(newF);
/*
            4) Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
            konsolda yazdırınız.
            Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
            */

        String g = "1a3Bcf4!...";
        int newG = g.replaceAll("\\d","").length();
        System.out.println(newG);

        /*
        5) Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
        Örnek:'Ali Can    ' için n yazdırmalısınız.
         ‘Miami’ için i yazdırmalısınız.*/
        String h = "Ali Can";
        String newH = h.replace(" ", "");//AliCan
        char chh = newH.charAt(newH.length()-1);
        System.out.println(chh);



/*
        6) Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
        toplamını bulunuz.*/

        String i = "Ebrar";
        int ae = i.charAt(0);
        int ar = i.charAt(i.length()-1);
        System.out.println(ae+ar);



/*
        7) Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
        yazdırınız.
        Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
                */

        String j = "Java";
        String newJ = j.substring(1,j.length());
        System.out.println(newJ);




        /*
        8) Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        büyük harfle yazdırınız.
        Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
                */

        String k = "String";
        String k2 = k.substring(0,k.length()-1);
        System.out.println(k2.toUpperCase());


        /*
        9) Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
        karakterleri büyük harflerle yazdırınız.
        Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
                */

        String l ="Ebrar";
        String l2 = l.substring(1,l.length()-1).toUpperCase();
        System.out.println(l2);



        /*
        10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        olmadığını kontrol etmek için kod yazınız.
        Örnek:‘Ali     Can’ için konsolda false yazmalıdır.
         ‘ Ali  Can ’ için konsolda false yazmalıdır.
         ‘ Ali   Can ’ için konsolda false yazmalıdır.
         ‘Ali Can’ için konsolda true yazmalıdır.
                */
       /*
       1) saginda bosluk olmamali
       2)solunda bosluk olamamli
       3) sadece ortada bosluk olmali
       4) ortadaki bozluk bir tane olmali
        */

        String  ali = "Ali Can";
        String sifirsiz = ali.trim();//"Ali Can"
        int aU = ali.length();//7
        int sU = sifirsiz.length();//7

        boolean varMi = sifirsiz.contains(" ");//true
        int kac = sifirsiz.replaceAll("[^ ]","").length();//1

        if(sU>=aU){

            if (varMi){
                if (kac==1){

                    System.out.println("Gecerli");

                }else{
                    System.out.println("Gecersiz");
                }

            }else{
                System.out.println("Gecersiz");
            }

        }else{

            System.out.println("Gecersiz");
        }





        /*
        11) Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod
        yazınız.
        Örnek:‘ Ali ’ için kodunuz konsolda false yazmalıdır
         ‘Ali’ için kodunuz konsolda true yazmalıdır
                */
        String bslk = "Ali";
        int bu = bslk.length();
        int zu = bslk.trim().length();
        String ts = bu<=zu ? "True" : "False";
        System.out.println(ts);



        /*
        12) Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
        yazınız.
        Örnek:‘Ali’ için kodunuz konsolda false yazdırmalıdır
         ‘ali.’ için kodunuz konsolda false yazdırmalıdır
         ‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
         ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
         ‘ALI.’ için kodunuz konsolda true yazdırmalıdır

         1) basinda ve sonunda bosluk olmamali
          2) ilk hari buyuk olmali
         2) sonunda nokta olmali

                */
        String z = "Ali.  ";
        if(!z.contains(" ")){

            z.trim();

            if(z.charAt(0)>='A' && z.charAt(0)<='Z'){

                if (z.charAt(z.length()-1)=='.'){

                    System.out.println("true");
                }else{
                    System.out.println("false");
                }

            }else{
                System.out.println("false");

            }

        }else{
            System.out.println("false");
        }




        /*
        13) Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
        sembol olmalıdır.
        Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
         'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
         '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
         '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
         '! a b 3 k' kodunuz konsolda false yazdırmalıdır.
                */

        /*
        1) bosluklar cikarildiginda parolanin uzunlugu en az sekiz karakter olmalidir. true false vermeli
        2) en az bir sembol bulunmalidir

         */

        String pwd = "!1a23b4?es";
        boolean uzun = pwd.replace(" ","").length()>8;
        boolean sem = pwd.replaceAll("[^0-9A-Za-z\\p{Punct} ]","").length()>0;


        if (uzun){

            if (sem){
                System.out.println("True");

            }else{
                System.out.println("False");
            }

        }else{
            System.out.println("False");
        }

        //2. yol
        String pwdSon = (uzun && sem)==true ? "True" : "False";
        System.out.println(pwdSon);




        /*
        14) Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek
        için kod yazınız.
                */
        /*

         */

        String krk = "g";
        boolean krk2 = krk.isBlank();
        String snc = krk2==true ? "Karakter icermiyor" : "Karakter iceriyor";
        System.out.println(snc);


        /*
        15) String gomlekFiyat = ‘$12.99’;
        String kitapFiyat = ‘$35.99’;
        Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.
*/

        /*
        16) Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
        Not: İkinci isim kapsam dışındadır.
        Örnek: Tom Hanks ==> TH, Mary Star ==> MS
                */


        /*
        17) Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.


         */

        String sey = "?.,''fgjdj";

        String isaretsiz = sey.replaceAll("\\w","");
        System.out.println(isaretsiz);
        int uznlk = isaretsiz.length();
        System.out.println(uznlk);









    }



}
