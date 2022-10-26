package random;

public class AhmetIlhanObject {


    public String ad = "Ahmet";
    public String soyad = "Ilhan";
    public byte yas = 26;
    public double boy = 1.85;
    public short kilo = 125;



    public static void main(String[] args) {
        AhmetIlhanObject myAhmet = new AhmetIlhanObject();

        System.out.println(myAhmet.ad);
        System.out.println(myAhmet.soyad);
        System.out.println(myAhmet.yas);
        System.out.println(myAhmet.boy);
        System.out.println(myAhmet.kilo);

        myAhmet.beniSev();
        myAhmet.beniHepSev();

    }

    public void beniSev(){
        System.out.println("Ahmet, Ebrar'i cok seviyor.");
    }
    public void beniHepSev(){
        System.out.println("Ahmet, Ebrar'i sonsuza dek sevecekmis.");
    }

}
