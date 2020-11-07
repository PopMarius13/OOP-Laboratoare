package Ghiozdan;

public class Manual extends  Rechizita{
    public Manual(String name) {
        super(name);
    }

    public String getName(){
        return "Manualul de : " + this.getEticheta();
    }
}
