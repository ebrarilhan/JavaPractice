package d07_practiceadvanced;

/*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */

import java.util.*;

public class Q02_UzunKelime {

    public static void main(String[] args) {

        System.out.println(enUzunKelime());



    }

    public static List<String> enUzunKelime(){
        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle gir");
        String cumle = input.nextLine();
        String arr[] = cumle.split(" ");

        int max = 0;

        for (String w : arr){
            if (w.length()>max){

                max = w.length();
            }



        }

        List<String> enUzunKelimeler = new ArrayList<>();
        for (String w : arr){

            if (w.length()==max){

                enUzunKelimeler.add(w);
            }
        }


        return enUzunKelimeler;
    }
}
