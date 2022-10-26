package day05_ifstatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.
        //1.yol



        Scanner input = new Scanner(System.in);
        System.out.println("sayi1");
        int x = input.nextInt();
        System.out.println("sayi2");
        int y = input.nextInt();
        
        if (x<y){
            System.out.println(x);
        } else if (y<x) {
            System.out.println(y);
            
        }else{
            System.out.println("sauilar birbirine esittir.");
        }

        //2.yol

        Object son = x<y ? x : (y<x ? y :  "esittir");
        System.out.println(son);




    }
}
