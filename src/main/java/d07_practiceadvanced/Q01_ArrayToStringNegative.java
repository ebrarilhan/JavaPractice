package d07_practiceadvanced;

import java.util.Arrays;

public class Q01_ArrayToStringNegative {

/*
      Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {

        String arr[] = {"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        System.out.println(Arrays.toString(arr));
        String bos = "";

        for (String w : arr){

            bos+=w;

        }

        System.out.println(bos);

        String bosNegative = bos.replace("Is","IsNOT");
        System.out.println(bosNegative);

    }
}
