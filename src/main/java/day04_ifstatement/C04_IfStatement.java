package day04_ifstatement;

import java.util.Scanner;

public class C04_IfStatement {

    public static void main(String[] args) {
        /*
 Print "Lutfen is unvaninizi girin
 jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
 Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
 Eger jobTitle  qa ise print is unvaniniz Quality Analyst
 test data: qa ise print Quality Analyst
 dev ise print Developer
 ba ise print Business Analyst
 pm ise print Project Manager
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi girin");
        String job = input.next();



        String a = job.equalsIgnoreCase("qa") ? "Quality Analyst"
                : (job.equalsIgnoreCase("dev") ? "Developer"
                : (job.equalsIgnoreCase("ba") ? "Business Analyst"
                : (job.equalsIgnoreCase("pa") ? "Project Manager" : "gecersiz unvan")));
        System.out.println(a);


    }
}
