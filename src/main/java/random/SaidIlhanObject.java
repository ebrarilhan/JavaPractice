package random;

public class SaidIlhanObject {


    public String ilkAd = "Muhammed ";
    public String ikinciAd = "Said ";
    public String soyAd = "Ilhan";
    public String meslek = "Avukat";
    public char a = 'A';
    public char v = 'v';
    public byte yas = 28;
    public int kilo = 71;
    public float boy = 1.67F;

    public static void main(String[] args) {

        SaidIlhanObject said = new SaidIlhanObject();

        System.out.print(said.ilkAd);
        System.out.print(said.ikinciAd);
        System.out.println(said.soyAd);
        System.out.println(said.meslek);
        System.out.print(said.a);
        System.out.println(said.v);
        System.out.println(said.yas);
        System.out.println(said.kilo);
        System.out.println(said.boy);

        said.dalisYap();
        said.kurekCek();
        said.motorSur();

    }

    public void dalisYap(){
        System.out.println("Said, dalis yapar.");
    }
    public void kurekCek(){
        System.out.println("Said, kurek ceker.");
    }
    public void motorSur(){
        System.out.println("Said motor surus derslerine gider.");
    }
}
