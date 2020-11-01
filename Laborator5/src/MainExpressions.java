import org.apache.commons.lang3.ArrayUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainExpressions {

    public static void main(String[] args) {
       // Ex1_3();
        //Ex4();
        Ex5();
    }

    public static void Ex1_3 (){
        StringBuilder result = new StringBuilder();
        StringBuilder[] listString = new StringBuilder[100];
        String readString;
        int n;

        Scanner scanner = new Scanner(System.in);

        /// citim n
        n = scanner.nextInt();
        scanner.nextLine();

        /// citim stringurile si punem in result prima litera a fiecarui string
        for(int i = 0 ; i < n ; i++){
            readString = scanner.nextLine();
            result.append(readString.charAt(0));
            listString[i] = new StringBuilder().append(readString);
        }

        System.out.println("Ex1: Sirul obtinut este: " + result);
        System.out.println();

        System.out.println("Sirul de stringuri este: \n");
        for(int i = 0 ; i < n ; i++){
            System.out.println(listString[i].toString());
        }
        System.out.println();

        ///stergem cuvintele de lungime impara
        for(int i = 0 ; i < n ; i++){
            if(listString[i].length() % 2 != 0){
                listString = ArrayUtils.remove(listString , i);
                n--;
                i--;
            }
        }

        System.out.println("Sirul de stringuri este : \n");
        for(int i = 0 ; i < n ; i++){
            System.out.println(listString[i].toString());
        }
        System.out.println();


        /// upperCase
        for(int i = 0 ; i < n ; i++){
            String s = listString[i].toString();
            listString[i].replace(0 , listString[i].length() ,s.toUpperCase());
        }

        System.out.println("Sirul  de stringuri este : \n");
        for(int i = 0 ; i < n ; i++){
            System.out.println(listString[i].toString());
        }
        System.out.println();

    }

    public static void Ex4 (){
        Map<String , String> mapString = new HashMap<>();
        int n;
        StringBuilder result = new StringBuilder();
        String read;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0 ; i < n ; i++){
            read = scanner.nextLine();
            mapString.put("" + i, read);
        }

        for(Map.Entry<String, String> entry : mapString.entrySet()) {
            result.append(entry.getKey());
            result.append(entry.getValue());
        }

        System.out.println(result);
    }

    public static void Ex5(){
        String readString;
        StringBuilder[] listString = new StringBuilder[100];
        StringBuilder[] listStringLower = new StringBuilder[100];

        int n;

        Scanner scanner = new Scanner(System.in);

        /// citim n
        n = scanner.nextInt();
        scanner.nextLine();

        /// citim stringurile si punem in result prima litera a fiecarui string
        for(int i = 0 ; i < n ; i++){
            readString = scanner.nextLine();
            listString[i] = new StringBuilder().append(readString);
        }
        for(int i = 0 ; i < n ; i++){
            System.out.println(listString[i].toString());
        }
        System.out.println();

        for(int i = 0 ; i < n ; i++){
            readString = listString[i].toString();
            listStringLower[i] = new StringBuilder().append(readString.toLowerCase());
        }

        for(int i = 0 ; i < n ; i++){
            System.out.println(listStringLower[i].toString());
        }
        System.out.println();
    }
}
