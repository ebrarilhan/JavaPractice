package day06_nestedifswitch;

import java.util.Scanner;

public class C04SwitchCase {

    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre;
        // Kullanicinin verecegi gun kadar sonraki günun  hangi gün olduğunu yazdırınız.
        // pazartesi hafta başlangıcı
        //BulunanGun = (kacGunSonrasi + kacıncıGun) % 7;

        Scanner input = new Scanner(System.in);
        System.out.println("p.tes ise 1 sali ise 2 c.ba 3 ...");
        int gunNo = input.nextInt();


        if (gunNo<1 || gunNo>7){

            System.out.println("Hatali veri girdiniz.");
        }else {

            System.out.println("Kac gun sonrasini bilmek istiyorsunuz?");
            int kacGunSonrasi = input.nextInt();
            int bulunanGun = (kacGunSonrasi+gunNo)%7;

            switch (bulunanGun){

                case 1 :
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden sali");
                    break;
                case 3 :
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden carsamba");
                    break;
                case 4 :
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden persembe");
                    break;
                case 5 :
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden cuma");
                    break;
                case 6 :
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden cumartesi");
                    break;
                case 0 :
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden pazar");
                    break;
                default:
                    System.out.println("Lutfen gecerli bir deger giriniz");

            }
        }






    }
}
