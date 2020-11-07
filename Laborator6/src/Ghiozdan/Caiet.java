package Ghiozdan;

public class Caiet extends Rechizita{

    public Caiet(String name) {
        super(name);
    }

    public String getName() {
        return "Caietul de: " + this.getEticheta();
    }
}
