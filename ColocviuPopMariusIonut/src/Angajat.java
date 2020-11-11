import java.util.Date;

public class Angajat extends  Persoana implements Comparable<Angajat>{
    private Date dataAngajare;
    private int nrClienti;

    public Angajat(int ID, String nume, String number, Date dataAngajare) {
        super(ID, nume, number);
        this.dataAngajare = dataAngajare;
    }

    @Override
    public int compareTo(Angajat o) {
        if(this.nrClienti > o.getNrClienti())
            return 1;
        else if(this.nrClienti < o.getNrClienti())
            return -1;
        return 0;
    }

    public int getNrClienti() {
        return nrClienti;
    }

    public void setNrClienti(int nrClienti) {
        this.nrClienti = nrClienti;
    }

    public Date getDataAngajare() {
        return dataAngajare;
    }

    public void setDataAngajare(Date dataAngajare) {
        this.dataAngajare = dataAngajare;
    }

    public void cazareNormal (Client client , Hotel hotel){
        if(hotel.getListAngajati().contains(this)) {
            hotel.addClient(client, 1);
            this.nrClienti++;
        }
    }
    public void cazareSingle (Client client , Hotel hotel) {
        if(hotel.getListAngajati().contains(this)) {
            hotel.addClient(client, 2);
            this.nrClienti++;
        }
    }
    public void decazare(Client client , Hotel hotel){
        if(hotel.getListAngajati().contains(this)) {
            hotel.removeClient(client);
            this.nrClienti--;
        }
    }

        @Override
    public String toString() {
        return "Angajat{" +
                "Nume = " + this.getNume()+
                ", ID = " + this.getID()+
                ", Number= " + this.getNumber() +
                ", dataAngajare=" + dataAngajare +
                '}';
    }
}
