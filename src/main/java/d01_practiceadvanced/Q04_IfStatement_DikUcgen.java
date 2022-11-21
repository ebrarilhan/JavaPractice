package d01_practiceadvanced;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {
    public static void main(String[] args) {

        /*
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı:
        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
        Bu bir dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("ilk kenari giriniz.");
        double ilk = input.nextDouble();
        System.out.println("ikinci kenari giriniz.");
        double iki = input.nextDouble();
        System.out.println("ucuncu kenari giriniz.");
        double uc = input.nextDouble();

        boolean dik1 = (ilk*ilk) + (iki*iki) == (uc*uc);
        boolean dik2 = (uc*uc) + (iki*iki) == (ilk*ilk);
        boolean dik3 = (ilk*ilk) + (uc*uc) == (iki*iki);

        if (dik1 || dik2 || dik3){

            System.out.println("bu bir dik ucgendir");
        }else System.out.println("bu bir dik ucgen degildir.");

    }
}
