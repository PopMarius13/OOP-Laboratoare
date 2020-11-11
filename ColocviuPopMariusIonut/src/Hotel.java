import java.util.Date;
import java.util.LinkedList;

public class Hotel {
    private LinkedList<Angajat> listAngajati;
    private LinkedList<Client> listClienti;
    private LinkedList<Camera> listCamera;

    public Hotel() {
        listCamera = new LinkedList<>();
        listClienti = new LinkedList<>();
        listAngajati = new LinkedList<>();
    }

    public Hotel(LinkedList<Angajat> listAngajati, LinkedList<Client> listClienti, LinkedList<Camera> listCamera) {
        this.listAngajati = listAngajati;
        this.listClienti = listClienti;
        this.listCamera = listCamera;
    }

    public LinkedList<Angajat> getListAngajati() {
        return listAngajati;
    }

    public LinkedList<Client> getListClienti() {
        return listClienti;
    }

    public LinkedList<Camera> getListCamera() {
        return listCamera;
    }

    public  void addCamera (Camera camera){
        if(camera != null){
            if(listCamera.size() == 0)
                listCamera.add(camera);
            else if((!listCamera.contains(camera)))
                listCamera.add(camera);
        }
    }
    public void addAngajat(Angajat angajat){
        if(angajat != null && !listAngajati.contains(angajat)){
           listAngajati.add(angajat);
        }else{
            System.out.println("Nu se poate adauga un angajat null");
        }
    }

    public void addClient(Client client , int ok){
        if (client != null && !listClienti.contains(client)) {
            if(client.getNrCamera() < listCamera.size())
            if(listCamera.get(client.getNrCamera()).fullCamera()) {
                listClienti.add(client);
            }
        }else{
            System.out.println("Nu se poate adauga un client nulll");
        }
    }

    public void removeClient (Client client ){
        if(client != null){
            listClienti.remove(client);
        }
    }

    public double facturaClient (Client client){
        if(client != null && listClienti.contains(client)){
            Date dataStart = client.getCheckIn();
            Date dataEnd = client.getCheckOut();
            int nrZile = dataStart.getDay() - dataEnd.getDay();
            nrZile = -nrZile;
            return listCamera.get(client.getNrCamera()).pret(nrZile);
        }
        return 0;
    }

    public void printListAngajati (){
        listAngajati.sort(Angajat::compareTo);
        for(Angajat angajat : listAngajati){
            System.out.println(angajat.toString());
        }
    }

    public void printListClienti (){
        listClienti.sort(Client::compareTo);
        for(Client client : listClienti){
            System.out.println(client);
        }
    }

    public void printCameraFree(){
        for(Camera camera : listCamera){
            if(camera.getCapacitate() >= camera.getListClienti().size()){
                System.out.println(camera);
            }
        }
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "listAngajati=" + listAngajati +
                ", listClienti=" + listClienti +
                ", listCamera=" + listCamera +
                '}';
    }
}
