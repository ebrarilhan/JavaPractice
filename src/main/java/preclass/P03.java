package preclass;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        int a = 15;
        int b = ++a;
        System.out.println(b);

        Scanner input = new Scanner(System.in);
        System.out.println("4 basamakli");
        int dort = input.nextInt();
        int d1 = dort%10;
        int d2 = (dort/10)%10;
        int d3 = (dort/100)%10;
        int d4 = (dort/1000);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d1+d2+d3+d4);

        int aa = Integer.MAX_VALUE;
        System.out.println(aa);

    }
}
