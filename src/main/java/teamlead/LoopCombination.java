package teamlead;

public class LoopCombination {

    /* Problem Tanımı
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)
        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365
        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10

        !her sayıda dogru veriyor 15 ile 4 ? 2 veriyor
      */

    public static void main(String[] args) {
        int n = 15;
        int r = 4;
        int eksi = n-r;//11

        int multiply = 1;

        for (int i = n; i >eksi ; i--) {

            multiply*=i;
        }

        int multiply2 = 1;

        for (int k = r; k >0 ; k--) {

            multiply2*=k;
        }

        int sonuc = multiply/multiply2;
        System.out.println(sonuc);
    }
}
