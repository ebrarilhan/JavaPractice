package d09_practiceadvanced.Q03_AbstractionAlanHesaplama;

public class Ucgen extends Alan {

    @Override
    double alanHesapla(double yukseklik, double taban) {
        return yukseklik*taban/2;
    }
}
