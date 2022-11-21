package day14_inheritianceencapsulation;


/*1)TV ekraninin genisligini,
        yuksekligini ve ekran buyuklugunu
        ayarlayabildiginiz
        2)kanal degistirebildiginiz;
        kapatip acabildiginiz;
        3)ses azaltip artirabildiginiz ve
        bu artirmanin bir max.
        degerinin oldugu bir TV kumandasinin
        kodunu yaziniz.
*/

public class KumandaRunner {

    public static void main(String[] args) {


        Test tv = new Test(102.10,80.00,40.45);
        tv.gucDugmesi();//kumandayla tv'yi actim
        System.out.println(tv.kanalDegistirme(2));//45.23
        System.out.println(tv.sesAzaltma());//11
        System.out.println(tv.sesArtirma());//12
    }
}
