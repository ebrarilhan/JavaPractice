package day04_ifstatement;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz.");
        int not = input.nextInt();

        if (not>89 && not<101){
            System.out.println("Cok Iyi");

        }else if (not>79 && not<90){
            System.out.println("Iyi");

        }else if (not>69 && not<80){
            System.out.println("Orta");

        }else if (not>59 && not<70){
            System.out.println("Gecer");
        }else if (not>=0 && not<=60){
            System.out.println("Zayif");
        }else{
            System.out.println("lutfen gecerli bir not giriniz.");
        }








    }
}
