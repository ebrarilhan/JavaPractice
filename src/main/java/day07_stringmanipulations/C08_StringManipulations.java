package day07_stringmanipulations;

import java.util.Scanner;

public class C08_StringManipulations {
    public static void main(String[] args) {


        //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("mailini gir");
        String mail = input.next();
        boolean et = mail.endsWith("gmail.com");
        boolean varMi = mail.contains("gmail.com");

        if (varMi){
            if (et){
                System.out.println("Email adresiniz kaydedildi ");
            }else{
                System.out.println("lutfen yazimı kontrol edin");
            }


        }else {
            System.out.println("lutfen gmail adresi giriniz");
        }



    }
}
