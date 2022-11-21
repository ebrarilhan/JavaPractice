package day09_nestedforlooop;

public class C07_ForLoopOdev {

    public static void main(String[] args) {
        //Asagidaki sekli yazdiran kodu yaziniz
//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6
//

        int sekil = 6;

        for (int i = 1; i <=sekil ; i++) {

            for (int j = 1; j <i ; j++) {
                System.out.print(" ");

            }

            for (int j = i; j <=sekil ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }



//hoca






        for (int satir = 1; satir <= 6; satir++) {//satır kontrolü
            for (int bosluk = 1; bosluk < satir; bosluk++) {// boşluk yazdırma
                System.out.print(" ");
            }
            for (int rakam = satir; rakam <= 6; rakam++) {//sutun kontrolu
                System.out.print(rakam + " ");
            }
            System.out.println();
        }
    }
}
