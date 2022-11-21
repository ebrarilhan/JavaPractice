package day08_loops;

import java.util.Scanner;

public class C01_ForLoop {

    //Kullanicidan baslangic , bitis ve artis miktarini alarak
    // aradaki tum sayilari aralarina virgul koyarak yazdirin
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("baslangic yazin");
        int bas = input.nextInt();
        System.out.println("bitis yazin");
        int son = input.nextInt();
        System.out.println("artis yazin");
        int art = input.nextInt();

        for (int i = bas; i <=son ; i=i+art) {
            System.out.print(i + " ");

        }


        System.out.println();


        //hocaninki



        // Scanner input = new Scanner(System.in);
        int baslangic=10;
        int bitis=50;
        int artisMiktari=5;
        for (int i = baslangic; i <=bitis ; i+=artisMiktari) {
            if(i<bitis){
                System.out.print(i+",");
            }else
                System.out.println(i);
        }
    }
}
