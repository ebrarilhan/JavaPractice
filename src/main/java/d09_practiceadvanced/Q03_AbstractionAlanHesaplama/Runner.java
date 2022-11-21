package d09_practiceadvanced.Q03_AbstractionAlanHesaplama;

public class Runner {

    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)

    public static void main(String[] args) {
        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(4,2));

        System.out.println(new Dikdortgen().alanHesapla(5,4));//boyle de yapilabilir obje olusturmadan
        //ama cok tavsiye edilmez cunku object olusturursak defalarca kullanabiliriz ama burada yapamayiz.

        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.alanHesapla(3,5));
    }
}
