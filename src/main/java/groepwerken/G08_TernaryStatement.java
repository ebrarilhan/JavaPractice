package groepwerken;

public class G08_TernaryStatement {

    public static void main(String[] args) {
        //1) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        //Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
        //Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"




        //2) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        //a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        //b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        //c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "


        //3) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        //a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        //b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
        //Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
        // 125 yukarı yuvarlanacak ve değer 130 olacaktır.
        // 123 aşağı yuvarlanacak ve değer 120 olacaktır.


        //4) Nested Ternary kullanarak Apex kodunu yazınız.
        //Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
        //Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
        //Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.

        //5) Nested Ternary kullanarak;
        //Şifreyi kontrol etmek için kodu yazınız.
        //8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
        //8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.

        String sifre = "klguighdfh";
        int uzu = sifre.length();
        char bas = sifre.charAt(0);

        String sonuc = uzu>8 ? (bas=='i' ? "gecerli" : "gecersiz") : (bas=='K' ? "dogru1" : "yanlis1");
        System.out.println(sonuc);




        //6) Bir sayının mutlak değerini hesaplamak için kodu yazınız.
        //Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
        //Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.

        //7) Ternary kullanarak; 2 tamsayıdan küçük olanı konsola yazdıran bir program yazınız

        //8) Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır. Aksi takdirde,
        //kodunuz " Bu sayı 3 basamaklı değildir" olacaktır


        //9) Ternary kullanarak; konsolda tek sayılar için “Tek” , çift sayılar için “Çift” yazdırınız


        //10) Ternary kullanarak; konsolda sayı pozitif ise “Pozitif” , negatif ise “Pozitif Değil” yazdırınız.








    }
}
