package day07_stringmanipulations;

public class C04_StringManipulationsStartsWith {
    public static void main(String[] args) {

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        // ka ile basliyor mu

        String cumle="Kazananlar hic hata yapmayanlar degil,vazgecmeyenlerdir";
        boolean ka = cumle.startsWith("Ka");
        System.out.println(ka);

        // dir ile bitiyor mu
        boolean dir = cumle.endsWith("dir");
        System.out.println(dir);





    }
}
