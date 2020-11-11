import java.util.Date;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Date date = new Date(2010 , 2 , 3);
        Date date1 = new Date(2000 , 2 , 2);
        Date date2 = new Date(2006 , 2 , 20);

        Angajat angajat = new Angajat(1 , "Pop" , "0677832" , date);
        Angajat angajat1 = new Angajat(2 , "Marius" , "054839" , date1);
        Angajat angajat2 = new Angajat(3 , "Ionut" , "90043123" , date2);

        System.out.println(angajat);
        System.out.println();

        Client client = new Client(1, "Marius" , "058438" , 1 , date , date1);
        Client client1 = new Client(2, "Andrei" , "058432438" , 0, date2 , date1);
        Client client2 = new Client(3, "Ionut" , "058438765" , 2 , date1 , date2);

        System.out.println(client);

        Camera camera = new Camera(1 , 3 , 100 , 120 , new LinkedList<>());
        Camera camera1 = new Camera(2 , 2 , 130 , 220 ,new LinkedList<>());
        Camera camera2 = new Camera(3 , 5 , 160 , 200 , new LinkedList<>());

        System.out.println(camera);

        Hotel hotel = new Hotel();
        hotel.addCamera(camera);
        hotel.addCamera(camera1);
        hotel.addCamera(camera2);

        hotel.addAngajat(angajat);
        hotel.addAngajat(angajat1);
        hotel.addAngajat(angajat2);

        angajat.cazareNormal(client , hotel);
        angajat1.cazareNormal(client1 , hotel);
        angajat1.cazareNormal(client2 , hotel);

        System.out.println(hotel);

        System.out.println("\n Camere");
        hotel.printCameraFree();
        System.out.println("\n Angajati");
        hotel.printListAngajati();
        System.out.println("\n CLienti");
        hotel.printListClienti();

        System.out.println("\n");
        System.out.println(hotel.facturaClient(client));

        angajat.decazare(client , hotel);
        hotel.printListClienti();
    }
}
