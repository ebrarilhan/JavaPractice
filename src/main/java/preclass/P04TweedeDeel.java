package preclass;

import java.util.Scanner;

public class P04TweedeDeel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir karakter");
        String ch = input.next();
        char a = ch.charAt(0);
        if ((a>=65 && a<=90) || (a>='a' && a<='z')){
            System.out.println("bu karakter bir harftir.");
        }else{
            System.out.println("bu bir harf degildir.");
        }

        // 5. sayfa 2. konu




    }
}
