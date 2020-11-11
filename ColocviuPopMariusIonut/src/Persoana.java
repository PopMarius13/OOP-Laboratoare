public abstract class  Persoana {
    private int ID;
    private String Nume;
    private String number;

    public Persoana(int ID, String nume, String number) {
        this.ID = ID;
        Nume = nume;
        this.number = number;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "ID=" + ID +
                ", Nume='" + Nume + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
