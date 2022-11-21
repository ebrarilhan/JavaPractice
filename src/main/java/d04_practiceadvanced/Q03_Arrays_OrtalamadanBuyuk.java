package d04_practiceadvanced;

public class Q03_Arrays_OrtalamadanBuyuk {

    public static void main(String[] args) {

        //Elemetlerin ortalamasından büyük elementleri yazdıran bir kod yazınız.

        int arr[] = {5, 9, 15, 1, 0, 11,3,55,0};

        int sum = 0;

        for (int w : arr){

            sum+=w;

        }

        double ortalama = sum/arr.length;
        System.out.println(ortalama);

        for (int w : arr){

            if (w>ortalama){

                System.out.print(w + " ");
            }
        }





    }
}
