package d09_practiceadvanced;

public class Q01_Varargs_NotOrtalamasi {

//	4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde
//	hesaplayan bir method yazınız.

    public static void main(String[] args) {

        ortalamaHesapla("Ali",96,96,100,100,96);
        ortalamaHesapla("Ayse",90,99,100,100);

    }

    public static void ortalamaHesapla(String isim, double... not){

        double sum = 0;
        for (double w : not){

            sum+=w;

        }

        System.out.println(isim + "'nin not ortalama: " + String.format("%.2f",sum/not.length));

    }

}
