package groepwerken;

public class G10_Loops1 {

    public static void main(String[] args) {

        //1) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.

        for (int i = 120; i>10 ; i--){

            if (i%4==0 && i%6==0){

                System.out.print(i + " ");
            }
        }

        System.out.println();

        //2) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ´ ces

        String strr = "accessories";
        String bos = "";
        for (int i = 0; i < strr.length(); i++) {
            String c = strr.substring(i,i+1);
            if (strr.indexOf(c)!=strr.lastIndexOf(c)){

                if (!bos.contains(c)) {


                    bos = bos + c;

                }

            }

        }

        System.out.println(bos);
        



        //3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.

        String  e = "Anna";
        String ters = "";
        for (int i = e.length()-1 ; i>-1 ; i--){

            char ch = e.charAt(i);
            ters = ters+ch;

        }
        System.out.println(ters);
        if (ters.equalsIgnoreCase(e)){
            System.out.println("Polindrom");
        }else System.out.println("polindrom degil");



        //4) Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //Örnek; 223878 ´ 37

        int rakam = 223878;
        String yeniRakam = String.valueOf(rakam);
        String bbos = "";

        for (int i = 0; i < yeniRakam.length() ; i++) {

            char x = yeniRakam.charAt(i);//2

            if (yeniRakam.indexOf(x)==yeniRakam.lastIndexOf(x)){

                bbos = bbos + x;
            }

        }
        System.out.println(bbos);




        //5) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A A A A A
        //A A A A A
        //A A A A A

        int satir = 3;
        int sutun = 5;

        for (int i = 1 ; i<=satir ; i++){

            for (int j = 1; j <=sutun; j++) {
                System.out.print("A ");

            }
            System.out.println();
        }


        //6) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A
        //A A
        //A A A
        //A A A A


        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i+1; j++) {

                System.out.print("A ");

            }
            System.out.println();

        }


        //7) Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30


        for (int i = 1; i < 11; i++) {

            System.out.print("3x" + i + "=" + (i*3) + " ");


        }


        System.out.println();
        //8) 20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
        //bırakarak yazdırmak için gereken kodu yazınız.


        for (int i = 20; i > 2 ; i--) {

            if (i%2!=0){

                System.out.print(i + " ");
            }

        }

        System.out.println();
        //9) String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 'Ali Can?' ==> l*i*a*n*

        String str = "Ali Can?";
        String bos2 = "";

        for (int i = 0; i < str.length(); i++) {


            if (str.charAt(i)>='a' && str.charAt(i)<='z'){

                 bos2=bos2+str.charAt(i) + "*";

            }

        }
        System.out.println(bos2);


//        for (int i = 0; i < bos2.length() ; i++) {
//
//            System.out.print(bos2.charAt(i) + "*");
//
//        }


        //10) Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        //işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 75.4238 ´ *4*2*3*8

        String ond = "75.4238";

        int idx = ond.indexOf(".");//2

        String yeni = ond.substring(idx+1);//4238


        for (int i = 0; i < yeni.length(); i++) {

            char yeni2 = yeni.charAt(i);

            System.out.print("*" + yeni2);

        }

        System.out.println();

        //2. yol

        String ond2 = "546.54658";
        String yeniOnd = ond2.split("\\.")[1];

        for (int i = 0; i < yeniOnd.length(); i++) {

            char yeni2 = yeniOnd.charAt(i);

            System.out.print("*" + yeni2);

        }


        System.out.println();
        //11) Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM

        String tersine = "Mark";

        String bosTers = "";

        for (int i = tersine.length()-1; i >=0 ; i--) {

            char mark = tersine.charAt(i);

            bosTers=bosTers+mark;

        }
        System.out.println(bosTers);


        //12) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A A A A A A A A
        //A X X X X X X A
        //A X X X X X X A
        //A X X X X X X A

        int satir2 = 4;
        int sutun2 = 8;

        for (int i = 1; i <=satir2 ; i++) {

            for (int j = 1; j <=sutun2 ; j++) {

                if (i>1 && (j>1 && j<sutun2)){

                    System.out.print("X ");
                }else {
                    System.out.print("A ");
                }

            }
            System.out.println();

        }




        //13) 3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız

        int sum = 0;
        for (int i = 3; i < 15 ; i++) {

            sum=sum+i;

        }
        System.out.println(sum);


        //14) 3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız

        int multiply = 1;
        for (int i = 4; i < 9; i++) {

            multiply=multiply*i;

        }
        System.out.println(multiply);


        //15) Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
        //kod yazınız.

        char ca = 'C';
        do {
            System.out.print(ca + " ");
            ca--;
        }while (ca>='A');



        System.out.println();
        //16) Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.

//        String m = "kalemlik";
//        String mbos = "";
//        int z = m.indexOf("m");
//
//
//        for (int i = 0; i < z; i++) {
//            char mm = m.charAt(i);
//
//            mbos=mbos+mm;
//
//        }
//        System.out.println(mbos);

        String m = "kalemlik";
        String mbos = "";

        for (int i = 0; i < m.length(); i++) {

            char mm = m.charAt(i);

            if (mm=='m'){
                break;
            }
            mbos=mbos+mm;


        }
        System.out.print(mbos);



        System.out.println();
        //17) Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.

        int tansayi = -12345;
        tansayi= Math.abs(tansayi);
        int top = 0;
        for (int i = tansayi; i > 0; i=i/10) {


            top = top+(i%10);

        }
        System.out.println(top);


        //18) Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
        //Örneğin; Hello ==> Heo

        String he = "Hello";
        String hbos = "";
        for (int i = 0; i < he.length(); i++) {
            char h = he.charAt(i);

            if (he.indexOf(h)==he.lastIndexOf(h)){

                hbos= hbos+h;

            }

        }

        System.out.print(hbos);

        System.out.println();
        //19) Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
        
        String st = "grup calismasi 10 numara!";
        String newSt = st.replaceAll("\\p{Punct}","");
        String newwSt = newSt.replaceAll("[ ]","");
        int newwwSt = newwSt.length();
        System.out.println(newwwSt);




        //20) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız
        //* * * * * *
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*

        for (int i = 1; i <7 ; i++) {

            for (int j = 6; j > i-1; j--) {

                System.out.print("* ");
            }
            System.out.println();

        }




    }
}
