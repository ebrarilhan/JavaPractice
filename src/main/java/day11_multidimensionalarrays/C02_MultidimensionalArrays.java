package day11_multidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class C02_MultidimensionalArrays
{

    /*Kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan kodu yaziniz
*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("array uzunlugunu yaziniz.");
        int auz = input.nextInt();
        int[] krr = new int[auz];

        for (int i = 0; i <auz ; i++) {
            System.out.println("arraye deger koyunuz");
            int deger = input.nextInt();
            krr[i] = deger;
        }

        System.out.println(Arrays.toString(krr));

//        Arrays.sort(krr);
//
//        System.out.println(Arrays.toString(krr));
//        System.out.println(krr[krr.length-1]-krr[0]);// ya da

        int min = krr[0];
        int max = krr[0];

        for (int i = 0; i <krr.length ; i++) {

            min= Math.min(min,krr[i]);
            max= Math.max(max,krr[i]);
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("fark = " + (max-min));



//hoca

        System.out.println("Array'in uzunlugunu giriniz ");
        int uzunluk=input.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array'in "+( i+1)+" .elemanini giriniz");
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(" Array'in en buyuk elemani :"+arr[uzunluk-1]);//Arrayin en buyuk lemanini verir
        System.out.println(" Array'in en kucuk elemani :"+arr[0]);//Array'in en kucuk elemanini verir
        System.out.println(arr[uzunluk-1]-arr[0]);
    }
}
