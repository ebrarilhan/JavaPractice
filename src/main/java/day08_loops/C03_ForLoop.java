package day08_loops;

import java.util.Scanner;

public class C03_ForLoop {

    /*
     Kullanicidan bir cumle ve bir harf alin,
     Cumlede verilen harfin kac kere
     kullanildigini bulup, yazdirin
     ORNEK:
     INPUT : Cumle: Java ogrenmek cok guzel. ==> Harf :e
     OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
    */
    public static void main(String[] args) {

        String str = "Saliha Ebrar Ilhan";
        char hrf = 'e';
        int c = 0;

        for (int i = 0; i < str.length() ; i++) {

            if (str.charAt(i)==hrf){
                c++;
            }

        }

        System.out.println("Girdiginiz cumlede " + hrf + " harfi, " + c + " kere kullanilmis.");





//hoca



        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle=input.nextLine().toLowerCase();
        System.out.println("Lutfen saydirmak istediginiz harfi giriniz");
        char harf=input.next().toLowerCase().charAt(0);
        int sayac=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.charAt(i)==harf){
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumlede "+harf+ " harfi "+sayac+ " tanedir");
    }
}
