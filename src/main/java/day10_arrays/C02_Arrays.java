package day10_arrays;

import java.util.Arrays;

public class C02_Arrays {

    //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
    // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.

    // int arr1[][] = {{1, 2}, { 3, 4, 5},{6}};
    // int arr2[][] = {{7, 8,9},{10,11 }, {12}};
    public static void main(String[] args) {
        int arr1[][] = {{2, 1}, {4, 3, 6}, {7}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        int sinir = 0;
        int toplam = 0;


        //benim cozum



        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i].length>=arr2[i].length){

                for (int k = 0; k <arr2[i].length ; k++) {

                    System.out.println(arr1[i][k]+arr2[i][k]);

                }

            }else {

                for (int k = 0; k <arr1[i].length ; k++) {

                    System.out.println(arr1[i][k]+arr2[i][k]);

                }

            }
        }








            //hocaninki
        if (arr1.length <= arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                sinir = arr1[i].length;
                if (arr1[i].length > arr2[i].length) {//sinir uzunlugu buldum
                    sinir = arr2[i].length;
                }
                for (int j = 0; j < sinir; j++) {//asil islemi burada yapiyorum
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println(i + "," + j + " indexindeki elemanlarin toplami" + toplam);
                }
            }
        } else {
            for (int i = 0; i < arr2.length; i++) {
                sinir = arr1[i].length;
                if (arr1[i].length > arr2[i].length) {
                    sinir = arr2[i].length;
                }
                for (int j = 0; j < sinir; j++) {
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println(i + "," + j + " indexindeki elemanlarin toplami" + toplam);
                }
            }
        }
    }


}
