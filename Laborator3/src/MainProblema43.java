import java.lang.String;
import java.util.Scanner;

public class MainProblema43 {
    public static void main(String[] args) {
        MyString("Pop Marius Ionut");
    }

    static void MyString (String a){
        int nrConsoane = 0 ,nrVocale = 0;
        int n = a.length();
        String vocale = "aeiou";

        for(int i = 0 ; i < n ; i++){
            char x = a.charAt(i);
            if((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z'))
                if(vocale.indexOf(x) >= 0)
                    nrVocale++;
                else
                    nrConsoane++;
        }

        System.out.println("Stringul este: " + a);
        System.out.println("Numaru de vocale = " +nrVocale);
        System.out.println("Numaru de consoane = " +nrConsoane);
        System.out.println();
        System.out.println("Introduceti o vocala: ");

        Scanner scanner = new Scanner(System.in);
        char caracter = scanner.next().charAt(0);

        System.out.print("Indicii sunt: ");
        for(int i = 0 ; i < n ; i++){
            char x = a.charAt(i);
            if(x == caracter)
                System.out.print(i + " " );
        }
    }
}
