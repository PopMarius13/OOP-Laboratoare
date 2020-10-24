import java.awt.*;

public class Dacia extends  Autovehicul{
    private static final String Caracteristica = "Nu se depaseste viteza de 80 cu acest autovehicul!!! PERICOL!!!";


    public Dacia( Color culoare, int vitezaCurenta, int treaptaVitezaCurenta,  Sofer sofer) {
        super("Dacia", culoare, vitezaCurenta, treaptaVitezaCurenta, 90, sofer);
    }

    public void AfisareCaracteristica (){
        System.out.println(Caracteristica);
    }
}
