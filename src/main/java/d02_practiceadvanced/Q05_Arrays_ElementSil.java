package d02_practiceadvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {
    public static void main(String[] args) {

/*
     Elementlerini kullanıcan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */

        Scanner input = new Scanner(System.in);

        System.out.println("array limitini giriniz.");
        int eleman = input.nextInt();

        int[] arr = new int[eleman];

        for (int i = 0; i < eleman; i++) {

            System.out.println("giribiz: Index " + i);
            arr[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("silmek istedigiiz indeksi giriniz.");
        int removeIndex = input.nextInt();
        int idx = 0;

        int[] brr = new int[eleman-1];

        for (int i = 0; i < eleman; i++) {
            if (removeIndex!=i) {
                brr[idx] = arr[i];
                idx++;
            }

        }

        System.out.println(Arrays.toString(brr));

        //2. Yol
        List<Integer> numberList = new ArrayList<>();
        for (int w : arr){
            numberList.add(w);
        }
        System.out.println(numberList);
        System.out.println("Silmek istediğiniz elementin indeksini giriniz.");
        int silinecekIdx = input.nextInt();
        numberList.remove(silinecekIdx);//index ile siliyoruz
        System.out.println(numberList);
        System.out.println("Silmek istediğiniz elementi giriniz");
        numberList.remove(numberList.indexOf(input.nextInt()));//elementin indeksini alarak siliyoruz.
        System.out.println(numberList);







    }
}
