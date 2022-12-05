package uyap;

public class AvukatBilgileri {

    public String avukatAdi;

    public String avukatSoyadi;

    public String avukatBarosu;

    public int baroSicilNo;


    private int uyapGirisSifresi;


    @Override
    public String toString() {
        return "AvukatBilgileri{" +
                "avukatAdi='" + avukatAdi + '\'' +
                ", avukatSoyadi='" + avukatSoyadi + '\'' +
                ", avukatBarosu='" + avukatBarosu + '\'' +
                ", baroSicilNo=" + baroSicilNo +
                ", uyapGirisSifresi=" + uyapGirisSifresi +
                '}';
    }

    public AvukatBilgileri(String avukatAdi, String avukatSoyadi, String avukatBarosu,
                           int baroSicilNo, int uyapGirisSifresi) {
        this.avukatAdi = avukatAdi;
        this.avukatSoyadi = avukatSoyadi;
        this.avukatBarosu = avukatBarosu;
        this.baroSicilNo = baroSicilNo;
        this.uyapGirisSifresi = uyapGirisSifresi;

    }

    public String getAvukatAdi() {
        return avukatAdi;
    }

    public void setAvukatAdi(String avukatAdi) {
        this.avukatAdi = avukatAdi;
    }

    public String getAvukatSoyadi() {
        return avukatSoyadi;
    }

    public void setAvukatSoyadi(String avukatSoyadi) {
        this.avukatSoyadi = avukatSoyadi;
    }

    public String getAvukatBarosu() {
        return avukatBarosu;
    }

    public void setAvukatBarosu(String avukatBarosu) {
        this.avukatBarosu = avukatBarosu;
    }

    public int getBaroSicilNo() {
        return baroSicilNo;
    }

    public void setBaroSicilNo(int baroSicilNo) {
        this.baroSicilNo = baroSicilNo;
    }


    public int getUyapGirisSifresi() {
        return uyapGirisSifresi;
    }

    public void setUyapGirisSifresi(int uyapGirisSifresi) {
        this.uyapGirisSifresi = uyapGirisSifresi;
    }


}
