package d07_practiceadvanced;

/*
      Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
      Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
      Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
      Örn: A-->Z, B-->Y ...
      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";
     */

import java.util.Scanner;

public class Q03_AtbashCode {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin = input.nextLine();
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        String str2 = "zyxwvutsrqponmlkjihgfedcba";

        for (int i = 0; i < metin.length() ; i++) {

            if (metin.charAt(i)==' '){
                System.out.print(metin.charAt(i));
                continue;
            }

            for (int j = 0; j < str1.length(); j++) {


                if (metin.charAt(i)==str1.charAt(j)){

                    System.out.print(str2.charAt(j));
                }

            }

        }

        System.out.println();
        //2. yol

        System.out.println("bir string giriniz.");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {

            int idx = 'z' - str.charAt(i);

            System.out.print((char)('a' + idx));

        }

    }
}
