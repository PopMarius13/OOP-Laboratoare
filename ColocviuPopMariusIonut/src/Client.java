import java.util.Date;

public class Client extends  Persoana implements Comparable<Client>{
    private int nrCamera;
    private Date checkIn;
    private Date checkOut;

    public Client(int ID, String nume, String number, int nrCamera, Date checkIn, Date checkOut) {
        super(ID, nume, number);
        this.nrCamera = nrCamera;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public int compareTo(Client o) {
        int nrZile1 = this.getCheckOut().getDay() - this.getCheckIn().getDay();
        int nrZile2 = o.getCheckOut().getDay() - o.getCheckIn().getDay();
        if(nrZile1 > nrZile2)
            return 1;
        else if(nrZile1 < nrZile2)
            return -1;
        return 0;
    }

    public int getNrCamera() {
        return nrCamera;
    }

    public void setNrCamera(int nrCamera) {
        this.nrCamera = nrCamera;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Nume = " + this.getNume()+
                ", ID = " + this.getID()+
                ", Number= " + this.getNumber() +
                ", nrCamera=" + nrCamera +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                '}';
    }
}
