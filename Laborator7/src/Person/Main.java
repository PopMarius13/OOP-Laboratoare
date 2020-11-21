package Person;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Person[] personArray = new Person[10];

        String firstName = "Marius";
        String lastName = "Pop";

        Random random = new Random();

        int x;
        for(int i = 0; i < 10 ; i++){
            x = random.nextInt()%100;
            x = Math.abs(x);
            personArray[i] = new Person(firstName + (10 - i ), lastName + i * i , x);
        }

        for(Person person : personArray){
            System.out.println(person);
        }

        System.out.println();

        Arrays.sort(personArray);


        for(Person person : personArray){
            System.out.println(person);
        }

    }

}
