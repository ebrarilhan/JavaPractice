package random;

import java.util.Scanner;

public class Ekstra {
    public static void main(String[] args) {

// kullanicidan mail iste @ iceriyorsa gecerli icermiyorsa gecersiz

        Scanner input = new Scanner(System.in);
        System.out.println("mail gir");
        String x = input.next();

        boolean y = x.contains("@");

        if (y==true){
            System.out.println("Gecerli");
        }else{
            System.out.println("gecersiz");
        }


        System.out.println();
// loopsda asagidaki sekli ciziniz.
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

         */

        for (int i = 1; i < 6; i++) {
            System.out.println();
            for (int j = 1; j < i+1; j++) {
                System.out.print(j + " ");

            }

        }

        System.out.println();

        //asagidaki sekli ciz
        /*
        .
        ..
        . .
        .  .
        .....
         */

        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");

        // Print i number of stars
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=i; j++) {
                if( j == 1 || j == i || i == rows) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
















    }
}
