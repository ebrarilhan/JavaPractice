package day07_stringmanipulations;

public class C05_StringManipulationsIsEmpty {

    public static void main(String[] args) {
        String str1 = "Hi";
        System.out.println(str1.isEmpty());

        String str2 = "";
        System.out.println(str2.isEmpty());

        String str3 = " ";
        System.out.println(str3.isEmpty());

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        System.out.println(str3.isBlank());
    }
}
