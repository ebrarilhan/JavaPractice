package day07_stringmanipulations;

public class C09_StringManipulations {

    public static void main(String[] args) {

               /*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu
       yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

*/




        String pwd = "thsrthtyty.";
        boolean uzn = pwd.length()>7;//true olmali
        System.out.println(uzn);
        boolean bosluk = !pwd.contains(" ");//true olmali
        System.out.println(bosluk);
        boolean bharf = pwd.replaceAll("[^A-Z]","").length()==0; //true olmali
        System.out.println(bharf);
        boolean son = pwd.charAt(pwd.length()-1)=='.';//true olmali
        System.out.println(son);
        boolean tumSartlar = uzn && bosluk && bharf && son;

        if (tumSartlar){

            System.out.println("Gecerli");
        }else System.out.println("Gecersiz");






    }
}
