package d09_practiceadvanced;

import java.util.HashMap;

public class Q05_MapAdSoyAd {

    /*
      İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
          output : {John=Doe, Mark=Twain, Ali=Can};
       */

    public static void main(String[] args) {

        String[] adlar = {"John", "Mark", "Ali"};
        String[] soyAdlar = {"Doe", "Twain", "Can"};
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i <adlar.length ; i++) {

            map.put(adlar[i],soyAdlar[i]);

        }

        System.out.println(map);

    }
}
