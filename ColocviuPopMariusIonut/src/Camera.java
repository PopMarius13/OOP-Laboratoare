import java.util.LinkedList;

public class Camera {
    private int ID;
    private int capacitate;
    private double pret;
    private double pretSingle;
    private LinkedList<Client> listClienti;

    public Camera(int ID, int capacitate, double pret, double pretSingle, LinkedList<Client> listClienti) {
        this.ID = ID;
        this.capacitate = capacitate;
        this.pret = pret;
        this.pretSingle = pretSingle;
        this.listClienti = listClienti;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getPretSingle() {
        return pretSingle;
    }

    public void setPretSingle(double pretSingle) {
        this.pretSingle = pretSingle;
    }

    public LinkedList<Client> getListClienti() {
        return listClienti;
    }

    public void setListClienti(LinkedList<Client> listClienti) {
        this.listClienti = listClienti;
    }

    public double pret (int nrZile){
        int discount = 50;
        if(nrZile > 3){
            return pret*nrZile - discount;
        }else{
            return pret*nrZile;
        }
    }

    public double pretSingle (int nrZile){
        return pretSingle*nrZile;
    }
    public boolean fullCamera (){
        return (listClienti.size() < capacitate);
    }

    @Override
    public String toString() {
        return "Camera{" +
                "ID=" + ID +
                ", capacitate=" + capacitate +
                ", pret=" + pret +
                ", pretSingle=" + pretSingle +
                ", listClienti=" + listClienti +
                '}';
    }
}
