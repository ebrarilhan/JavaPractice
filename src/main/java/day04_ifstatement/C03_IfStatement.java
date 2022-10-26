package day04_ifstatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("gun ismi");
        String gun = input.next().toLowerCase();

        switch (gun){
            case "cuma":
                System.out.println("Muslumanlar icin kutsal gundur.");
                break;
            case "cumartesi":
                System.out.println("Yahudiler icin kutsal gundur.");
                break;
            case "pazar":
                System.out.println("Hristiyanlar icin kutsal gundur.");
                break;
            default:
                System.out.println("gecerli bir gun girin");
        }

        if (gun.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar icin kutsal gundur.");

        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Yahudiler icin kutsal gundur.");

        } else if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hristiyanlar icin kutsal gundur.");

        }else {
            System.out.println("kutsal gun degil");}



    }









}

