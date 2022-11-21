package d03_practiceadvanced;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q04_DoWhile_TopunSicramasi {

    public static void main(String[] args) {


        /*
 Bir top belirli yükseklikten atılmaktadır.
 Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
 Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
 Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yuksekligi giriniz.");
        double yuk = input.nextDouble();
        int counter = 0;
        double top = 0;

        do {
            counter++;
            top=top+yuk;
            yuk=yuk*3/4;
            top= top+yuk;

        }while(yuk>1);
        System.out.println(top);
        System.out.println(counter);

        NumberFormat numberFormat = new DecimalFormat(".#");
        System.out.println(numberFormat.format(top));


    }
}
