import java.awt.*;

public class BMW extends Autovehicul {

    private static final String Caracteristica = "Nu se semnalizeaza cu acest autovehicul!!!";

    public BMW( Color culoare, int vitezaCurenta, int treaptaVitezaCurenta, int vitezaMaxima, Sofer sofer) {
        super("BMW", culoare, vitezaCurenta, treaptaVitezaCurenta, vitezaMaxima, sofer);
    }

    public void AfisareCaracteristica (){
        System.out.println(Caracteristica);
    }

}
