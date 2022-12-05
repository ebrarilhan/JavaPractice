package groepwerken;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class G13_Sets {

    public static void main(String[] args) {


        // 1) Bir listede tekrarsiz kaç farklı öğe olduğunu gösteren kodu yazınız.
        //Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(31);
        list1.add(15);
        list1.add(7);
        list1.add(15);
        list1.add(7);
        list1.add(7);

        Set<Integer> set1 = new HashSet<>(list1);

        System.out.println(set1.size());




        //2) Set ve Liste arasındaki ortak öğeleri yazdırmak için kod yazınız.

        Set<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(15);
        set2.add(13);
        set2.add(8);
        set2.add(9);
        set2.add(7);





        //3) Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
        //Örnek: ‘Mississippi’ ´ Misp


        //4) Bir liste ve bir set oluşturunuz. Set içerisinde var olan listenin bütün elemanlarını kaldıran
        //bir kod yazınız.

        //5) Bir listede tekrarlanan öğeler olup olmadığını kontrol etmek için kodu yazınız.


    }
}
