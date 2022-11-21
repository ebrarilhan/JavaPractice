package d08_practiceadvanced;

import java.util.Scanner;

public class Q01_ForEach_SayiUcgen {

    public static void main(String[] args) {

        /*
             Alttaki şekli veren bir kod yazınız:

                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6
         */


        Scanner input = new Scanner(System.in);
        System.out.println("satir sayisini veriniz.");
        int satir = input.nextInt();

        for (int i = 1; i < satir+1; i++) {

            for (int j = 1; j < i; j++) {

                System.out.print(" ");
            }

            for (int j = i; j <satir+1 ; j++) {

                System.out.print(j + " ");

            }

            System.out.println();

        }
    }
}
