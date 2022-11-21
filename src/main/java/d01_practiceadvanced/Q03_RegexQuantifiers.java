package d01_practiceadvanced;

public class Q03_RegexQuantifiers {
    public static void main(String[] args) {

        //Bir String değerin belirli sayıda karakter içerip belirli bir karakter ile
        // bitip bitmediğini kontrol eden bir kod yazınız.

        String str = "sos";

        boolean krk = str.matches("s.s");//herhangi bir karakter ile baslayi s harfi ile bittigi
        //anlamina gelir. yani hem uzunluk hem de ne ile bittigini gosterir. veya basladigini
        System.out.println(krk);

        //matches() methodu regex ile calisip string degerin regex ile karsilastirmasini yapar.

        //Bir String değerin ikinci karakterinin belirli bir karakter olup
        // olmadığını kontrol eden bir kod yazınız.

        System.out.println("qsjfgkl".trim().matches(".s.*"));//buradaki * sonuna istedigin kadar
        //karakter koy o onemli degil onu sayma demek. ancak *denn once mutlaka bir tane nokta .
        //koymaliyiz.

        //Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.

        System.out.println("abc".matches("[a-zA-Z]*"));//amcak eger stringde harf disinda karakter
        //olursa false verir. cunku bu aslinda tum karakterler harf ile eslesiyo mu anlamina geliyor

        System.out.println("abcdefghjklmn".matches("\\w*"));// bu da ayni islevi gorur.

        System.out.println("abcde".matches("[a-zA-Z]{5}"));//bu da kac tane oldugunu verir

        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini
        // kontrol eden bir kod yazınız.
        System.out.println("abcdef".matches("[a-zA-Z]{6}"));
        System.out.println("3bcde".matches("[a-zA-Z]{5}"));//false verir. cunku harf disinda
        //karakter de iceriyor.

        //Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini
        // kontrol eden bir kod yazınız.
        System.out.println("12345634".matches("[0-9]{6,}"));//en az 6 tane rakam icerdigi anlamina
        //gelir

        //Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip içermediğini
        // kontrol eden bir kod yazınız.
        System.out.println("abcd1_345".matches("\\w{7,10}"));//en az 7 en fazla 10 olabilir
        // 7 ve 10 dahildir.

        // \\w == [a-zA-Z0-9_]

        // ilk karakter 1, ikinci karekter noktalama işareti ve kalan 8 karakter
        // rakam toplam 10 karakter olmali,

        System.out.println("1?12345678".matches("[1][\\p{Punct}][0-9]{8}"));//8 yerine
        // parantessiz * da konulabilir.
        // 1 in ve punctin yanina da parantezle birlikte kac tane oldugu belirtilebilir.













    }
}
