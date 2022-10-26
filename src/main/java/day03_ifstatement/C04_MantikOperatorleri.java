package day03_ifstatement;

public class C04_MantikOperatorleri {

    public static void main(String[] args) {

        // & ile && arasindaki fark nedir?
        // ikisi de ve anlamina gelir ama & olan tum satiri kontrol edeceginden
        // daha yavas sonuc verir ama && direkt ilk durumda durur ve tum kodlari
        // arastirmaz. yani && hizli & yavastir.

        System.out.println(5+2==8);

        boolean s1 = 5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println(s1);

        boolean s2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println(s2);

        int s3 = 15;

        //java uclu karsilastirma yapmaz yani 10<s3<20 yapmaz
        // ikili karsilstirmalar yapip mantiksal operatorlerle birlestirmeliyiz.

        System.out.println(10<s3 && s3<20);

        int s4 = 5;
        System.out.println(s4>10 || s4<20);

        // || bu isaret de veya anlamina gelir.





    }
}
