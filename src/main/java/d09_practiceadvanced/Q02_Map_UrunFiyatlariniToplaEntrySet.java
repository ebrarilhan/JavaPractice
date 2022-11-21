package d09_practiceadvanced;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q02_Map_UrunFiyatlariniToplaEntrySet {

    //Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    //Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
    public static void main(String[] args) {
        HashMap<String, Double> urunlerveFiyatlar = new HashMap<>();

        urunlerveFiyatlar.put("Kemer",19.99);
        urunlerveFiyatlar.put("Gomlek",29.99);
        urunlerveFiyatlar.put("Ayakkabi",89.99);
        urunlerveFiyatlar.put("Kazak",24.99);
        urunlerveFiyatlar.put("Kravat",19.99);

        System.out.println(fiyatToplami(urunlerveFiyatlar));


    }

    public static double fiyatToplami(Map<String, Double> map){

        System.out.println("Urunler ve fiyatlari: " + map);

        double sum = 0;
        for (Map.Entry<String, Double> w: map.entrySet()){
            sum+=w.getValue();

        }

        return sum;

    }






}
