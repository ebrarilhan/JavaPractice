package groepwerken;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class G12_Lists {

    public static void main(String[] args) {

        //1) Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.

        List<Integer> tamsayi = new ArrayList<>();
        tamsayi.add(1);
        tamsayi.add(3);
        tamsayi.add(5);
        tamsayi.add(7);
        tamsayi.add(9);
        tamsayi.add(10);
        tamsayi.add(13);
        tamsayi.add(16);

        int sum = 0;

        for (int w : tamsayi){

            sum+=w;
        }

        System.out.println(sum);

        //2) Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz

        int toplam = 0;

        for (int w : tamsayi){

            if (w==13){
                break;
            }
            toplam+=w;

        }

        System.out.println(toplam);


        //3) Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.

        int multiply = 1;

        for (int w : tamsayi){

            if (w%2==0){

                multiply= multiply*w;


            }
        }
        System.out.println(multiply);


//        4) Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
//        Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
//         (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır


        //5) Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        //Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(12);
        sayilar.add(11);
        sayilar.add(15);
        sayilar.add(34);
        sayilar.add(43);
        sayilar.add(15);

        for (int w : sayilar){

            if (w==15){
                sayilar.set(sayilar.indexOf(15),51);
            }
        }

        System.out.println(sayilar);


        //6) Listede 15 veya 13 varsa, bu elemanları kaldırınız.
        //Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)

        sayilar.add(0,13);
        sayilar.add(3,15);
        System.out.println(sayilar);

        List<Integer> istenmeyenler = new ArrayList<>();

        for (int w : sayilar){

            if (w==15 || w==13){

                istenmeyenler.add(w);
            }

        }
        sayilar.removeAll(istenmeyenler);
        System.out.println(istenmeyenler);
        System.out.println(sayilar);


        //7) Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        //Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

        List<Integer> tSayi = new ArrayList<>();
        tSayi.add(12);
        tSayi.add(31);
        tSayi.add(100);
        tSayi.add(85);
        tSayi.add(54);

        int fark = Integer.MAX_VALUE;

        for (int w : tSayi){

            for (int i = 0; i < tSayi.size(); i++) {

                if (tSayi.indexOf(w) ==i){
                    continue;
                }

                if (w>=tSayi.get(i)){
                    fark = Math.min(fark,w-(tSayi.get(i)));
                }else {
                    fark = Math.min(fark,(tSayi.get(i))-w);
                }


            }

        }

        System.out.println("7. soru : " + fark);


        for (int w : tSayi){

            for (int i = tSayi.indexOf(w)+1; i < tSayi.size() ; i++) {

                if (Math.abs(w-tSayi.get(i))==fark){

                    System.out.println(w + " ve " + tSayi.get(i));


                }

            }
        }




        //8) Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        //Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)

        List<Integer> sayi = new ArrayList<>();
        sayi.add(12);
        sayi.add(31);
        sayi.add(7);
        sayi.add(13);
        sayi.add(10);

        for (int w : sayi){

            if (w!=7 && w!=10){
                sayi.set(sayi.indexOf(w),w+2);
            }
        }
        System.out.println(sayi);



//        9) String bir listede verilen tüm fiyatların toplamını bulunuz.
//        Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

        List<String> myList = new ArrayList<>();

        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");

        String arr[] =  new String[myList.size()];
        List<Integer> brr = new ArrayList<>();



        for (String w : myList){

            arr[(myList.indexOf(w))] = w.split("\\$")[1];


        }

        System.out.println(Arrays.toString(arr));







        //10) Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        List<String> mijnList = new ArrayList<>();
        mijnList.add("$12.99");
        mijnList.add("$8.25");
        mijnList.add("$23.60");
        mijnList.add("$54.45");

        double k;
        double[] mijnarr = new double[mijnList.size()];

        for (int i = 0; i <mijnList.size() ; i++) {

            k = Double.parseDouble(mijnList.get(i).replace("$", ""));
            mijnarr[i]=k;

        }
        System.out.println(Arrays.toString(mijnarr));
        Arrays.sort(mijnarr);

        System.out.println("toplam : " + (mijnarr[0]+mijnarr[mijnarr.length-1]));





        //11) Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
        //olup olmadığını kontrol ediniz.

        //12) Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol etmek için bir kod
        //yazınız.
        //Not:
        //Mountain Array ==> [0, 2, 5, 3, 1]
        //Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerinden sonra sürekli azalan değer alıyorsa Mauntain Array' dir.
        //Mountain Array Değil ==> [5, 2, 7, 1, 4]
        //Bir array elemanları en büyük değerine kadar sürekli azalan, en büyük değerinden sonra sürekli artan değer alıyorsa Mauntain Array değildir.

    }
}
