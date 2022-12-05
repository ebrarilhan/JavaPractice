package hesapmakinesi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Toplama {

    static Scanner input = new Scanner(System.in);
    static List<Double> list = new ArrayList<>();

    public static void veriyiAl() {
        System.out.println("Toplama yapacaginiz sayilari giriniz. " +
                "Yeterli sayiya ulasinca q basiniz");

        String secim = input.next();
        hataVer(secim);

    }

    public static void hataVer(String secim){

        if ((secim.matches("[0-9]"))){
            sayilariAl(secim);

        } else if (secim.equals("q")) {
            toplamaYap();

        }else
            throw new IllegalArgumentException("Lutfen gecerli bir sey giriniz.");


    }

    public static void sayilariAl(String secim){


            double a = Double.parseDouble(secim);
            list.add(a);
            if (list.size()>4){
                System.out.println("en fazla bes sayi ile islem yapabilirsiniz.");
                System.out.println(list);
                toplamaYap();
            }
            veriyiAl();


    }



    public static void toplamaYap(){


        double sum = 0;

        for (double w : list){

            sum=sum+w;

        }

        System.out.println("Sonuc " +sum);

    }


}
