package d04_practiceadvanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {


    public static void main(String[] args) {

         /*
Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
 */


        Scanner input = new Scanner(System.in);
        List<Integer> sayilar = new ArrayList<>();

        while(true){


            System.out.println("ekleme yapmak icin 'add'\n" +
                    "guncelleme yapmak icin 'update'\n" +
                    "silmek icin 'delete'\n" +
                    "cikmak icin 'quit' komutunu giriniz");
            String option = input.next();

            if (option.equalsIgnoreCase("add")){
                System.out.println("Eklemek istediginiz sayiyi giriniz.");
                int eklenecekSayi = input.nextInt();
                sayilar.add(eklenecekSayi);
            } else if (option.equalsIgnoreCase("update")) {
                System.out.println("guncellemek istediginiz sayiyi giriniz.");
                int guncellenecekSayi = input.nextInt();
                System.out.println("Girmek istediginiz yeni sayiyi giriniz.");
                int yeniSayi = input.nextInt();
                sayilar.set(sayilar.indexOf(guncellenecekSayi),yeniSayi);

            } else if (option.equalsIgnoreCase("delete")) {
                System.out.println("silmmek istediginiz sayiyi giriniz.");
                int silinecekSayi = input.nextInt();
                sayilar.remove((Integer)silinecekSayi);

            } else if (option.equalsIgnoreCase("quit")) {
                break;

            }else {
                System.out.println("Gecerli bir komut giriniz.");
            }
            System.out.println(sayilar);


        }

        System.out.println("Gule Gule...");


    }


}
