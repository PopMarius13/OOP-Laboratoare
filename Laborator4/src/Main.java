import java.awt.*;
import java.sql.Time;

public class Main {

    public static void main(String[] args) {
        Color color = Color.getHSBColor(0 , 0 , 153);
        Autovehicul autovehicul = new Autovehicul("BMW" , color , 0 , -1 , 120);
        deplasare(100, autovehicul);
    }

    public static void deplasare (double distanta , Autovehicul autovehicul){
        /// afisam autovehiculul
        Time timp = new Time(10,0,0);

        System.out.println();
        System.out.println(autovehicul.toString());


        if(autovehicul.getTreaptaVitezaCurenta() == -1) {
            autovehicul.pornire();
            System.out.println(timp);
        }
        System.out.println();
        autovehicul.accelerare(10);
        System.out.println("viteza = " + autovehicul.getVitezaCurenta() + " --- treapta = "+ autovehicul.getTreaptaVitezaCurenta());
        autovehicul.accelerare(30);
        System.out.println("viteza = " + autovehicul.getVitezaCurenta() + " --- treapta = "+ autovehicul.getTreaptaVitezaCurenta());
        timp.setTime(7800000);
        distanta -= 5;
        System.out.println(timp + " mai sunt: " + distanta +" km");
        System.out.println();

        autovehicul.schimbaTreapta(4);
        System.out.println("viteza = " + autovehicul.getVitezaCurenta() + " --- treapta = "+ autovehicul.getTreaptaVitezaCurenta());
        autovehicul.accelerare(100);
        System.out.println("viteza = " + autovehicul.getVitezaCurenta() + " --- treapta = "+ autovehicul.getTreaptaVitezaCurenta());
        timp.setTime(8400000);
        distanta -= ((double)autovehicul.getVitezaMaxima() / 6);
        System.out.println(timp + " mai sunt: " + distanta +" km");
        System.out.println();

        while(distanta > 0){
            if(autovehicul.getVitezaCurenta() > 50)
                autovehicul.decelerare(30);
            timp.setTime(timp.getTime() + 600000);
            distanta -= ((double)autovehicul.getVitezaCurenta() / 6);
            System.out.println("viteza = " + autovehicul.getVitezaCurenta() + " --- treapta = "+ autovehicul.getTreaptaVitezaCurenta());
            System.out.println(timp + " mai sunt: " + distanta +" km");
            System.out.println();
        }

        autovehicul.oprire();
        System.out.println("viteza = " + autovehicul.getVitezaCurenta() + " --- treapta = "+ autovehicul.getTreaptaVitezaCurenta());
        System.out.println(timp);
    }
}
