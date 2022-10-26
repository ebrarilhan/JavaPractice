package day08_practiceadvanced;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelsius {

    public static void main(String[] args) {

        // fahrenteit degeri celcius degere ceviren kodu yaziniz.
        //formul= c= (f-32)*5/9


        Scanner input = new Scanner(System.in);
        System.out.println("fahri giriniz");

        double fahri = input.nextDouble();
        double cecil = (fahri-32)*5/9;

        System.out.println(cecil);

        NumberFormat numberFormat = new DecimalFormat(".##");//doubleda noktadan sonra virgullu
        // kismi azaltma kodudur. # yerine sifir 0 da konulabilir.
        String formatedCecil = numberFormat.format(cecil);
        System.out.println(formatedCecil);

        double c = Double.valueOf(formatedCecil);
        System.out.println(c);



        //

    }
}
