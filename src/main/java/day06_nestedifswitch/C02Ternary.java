package day06_nestedifswitch;

import java.util.Scanner;

public class C02Ternary {

    /*
    Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
    'A'  ->  "Cok Basarili"
    'B'  ->  "Basarili"
    'C'  ->  "Orta"    bu notlar disindakilere de
             Digerleri..
                yazdiriniz.Nested Ternary ile cozunuz
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("notunu gir");
        char not = input.next().charAt(0);


        String sonuc = not=='A' || not=='a' ? "Cok Basarili"
                    : not=='B' || not=='b' ? "Basarili"
                    : not=='C' || not=='c' ? "Orta"
                    : "Digerleri";

        System.out.println(sonuc);

    }
}
