package Ghiozdan;

public abstract class Rechizita {

    private final String eticheta;

    public Rechizita(String name) {
        this.eticheta = name;
    }

    public String getEticheta() {
        return eticheta;
    }

    public abstract String getName();

}
