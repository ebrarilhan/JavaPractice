package teamlead;

public class LoopVlinder$$$$$$$ {


      /*
     ***********
      *********
       *******
        *****
         ***
          *
         ***
        *****
       *******
      *********
     ***********

     şekli yazdırınız
     */

    public static void main(String[] args) {
        int yildizSayisi = 11;


        for (int i = 0; i <yildizSayisi ; i++) {


            for (int k = 1; k <=i; k++) {
                System.out.print(" ");


            }


            for (int j = yildizSayisi-i; j >i ; j--) {
                System.out.print("*");

            }

            System.out.println();

        }

        //bu sadece ilk kismi icin eksik kod
    }

}
