import java.awt.*;

public class Autovehicul {

    /*rieți un program Java în care:
        - Proiectați și implementați o clasa Autovehicul care să fie caracterizat prin: marca, culoare
        (vezi clasa predefinită Color), viteza curentă (în km/oră), treapta de viteza curenta, viteza
        maximă pe care o poate atinge. Un autovehicul ar trebui să poată efectua următoarele
        acțiuni: accelerare – care are ca efect creșterea vitezei cu un număr de km/oră, decelerare,
        schimbarea treptelor de viteza, oprire.
        - Simulați deplasarea unui autovehicul pe o anumită distanță într-o aplicație statică. (Aceasta
        ar trebui să presupună acțiunile de accelerare/decelerare, schimbare de viteză, număr de km
        parcurși, oprire etc.)
        Indicații de implementare:
        - modificatorul de acces al variabilelor instanță să fie de tip private, iar cel al metodelor de tip
        public sau protected.
        - Pentru accesul extern la variabilele instanță, implementați metode accesoare (get) și
        mutatoare (set) acolo unde este cazul.
        - Definiți cel puțin doi constructori: cu și fără parametri.

     */

    private final String marca;
    private final Color culoare;
    private int VitezaCurenta;
    private int TreaptaVitezaCurenta;   /// consideram treapta de viteza 0 ca fiind treapta R , iar -1 inseamna ca e scoasa din viteza
    private final int VitezaMaxima;
    public static final String Caracteristica  = "Turbo";
    public Sofer sofer;

    public Autovehicul(String marca, Color culoare, int vitezaMaxima) {
        this(marca, culoare , 0 , 1 , vitezaMaxima);
    }

    public Autovehicul(String marca, Color culoare, int vitezaCurenta, int treaptaVitezaCurenta, int vitezaMaxima) {
        this(marca ,culoare , vitezaCurenta , treaptaVitezaCurenta , vitezaMaxima, null );
    }

    public Autovehicul(String marca, Color culoare, int vitezaCurenta, int treaptaVitezaCurenta, int vitezaMaxima, Sofer sofer) {
        this.marca = marca;
        this.culoare = culoare;
        VitezaCurenta = vitezaCurenta;
        TreaptaVitezaCurenta = treaptaVitezaCurenta;
        VitezaMaxima = vitezaMaxima;
        this.sofer = sofer;
    }

    public Sofer getSofer() {
        return sofer;
    }

    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }

    public int getVitezaCurenta() {
        return VitezaCurenta;
    }

    public void setVitezaCurenta(int vitezaCurenta) {
        VitezaCurenta = vitezaCurenta;
    }

    public int getTreaptaVitezaCurenta() {
        return TreaptaVitezaCurenta;
    }

    public void setTreaptaVitezaCurenta(int treaptaVitezaCurenta) {
        TreaptaVitezaCurenta = treaptaVitezaCurenta;
    }

    public String getMarca() {
        return marca;
    }

    public Color getCuloare() {
        return culoare;
    }

    public int getVitezaMaxima() {
        return VitezaMaxima;
    }

    public int accelerare (int viteza){
        this.VitezaCurenta += viteza;
        if(this.VitezaCurenta > this.VitezaMaxima)
            this.VitezaCurenta = this.VitezaMaxima;

        schimbaTreapta();

        return  this.VitezaCurenta;
    }

    public int decelerare (int viteza){
        if(viteza > 0)
            this.VitezaCurenta -= viteza;
        else
            this.VitezaCurenta += viteza;
        if(this.VitezaCurenta < 0)
            this.VitezaCurenta = 0;

        schimbaTreapta();

        return this.VitezaCurenta;
    }

    public int schimbaTreapta(int i){
        if(i > this.TreaptaVitezaCurenta)
            accelerare(30 * (i - this.TreaptaVitezaCurenta));
        else if(i < this.TreaptaVitezaCurenta)
            decelerare(30 * (i - this.TreaptaVitezaCurenta));
        if(this.TreaptaVitezaCurenta == 6)
            System.out.println("Caracteristica " + Caracteristica + " este activata");
        this.TreaptaVitezaCurenta = i;

        return i;
    }
    public  int schimbaTreapta(){       //supraincarcare
        if(this.VitezaCurenta < 20)
            this.TreaptaVitezaCurenta = 1;
        else {
            this.TreaptaVitezaCurenta = this.VitezaCurenta / 30 + 2;
        }
        if(this.TreaptaVitezaCurenta == 6)
            System.out.println("Caracteristica " + Caracteristica + " este activata");
        return this.TreaptaVitezaCurenta;
    }

    public void oprire (){
        this.TreaptaVitezaCurenta = -1;
        this.VitezaCurenta = 0;

        System.out.println("Masina a oprit");
    }

    public void pornire(){
        this.TreaptaVitezaCurenta = 1;
        this.VitezaCurenta = 0;
        System.out.println("Masina a pornit");
    }

    @Override       ///suprascriere
    public String toString() {
        return "Autovehicul{" +
                "marca='" + this.marca + '\'' +
                ", culoare=" + this.culoare +
                ", VitezaCurenta=" + this.VitezaCurenta +
                ", TreaptaVitezaCurenta=" + this.TreaptaVitezaCurenta +
                ", VitezaMaxima=" + this.VitezaMaxima +
                '}';
    }
}
