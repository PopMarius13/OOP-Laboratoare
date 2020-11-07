package Ghiozdan;

/*
o listă de rechizite (implementată cu tipul de date tablou)
o metoda add pentru adăugarea unui Caiet în lista de rechizite
o metoda add pentru adăugarea unui Manual în lista de rechizite
o metoda listItems pentru listarea tuturor rechizitelor
o metoda listManual pentru listarea doar a manualelor din listă
o metoda listCaiet pentru listarea doar a caietelor din listă
o metoda getNrRechizite pentru afisarea numărului de rechizite
o metoda getNrManuale pentru calcularea şi afisarea nr. de manuale din listă
o metoda getNrCaiete pentru calcularea şi afisarea nr. de caiete din listă
 */
public class Ghiozdan {
    private final Rechizita[] listRechizite ;
    private int nrRechizite;

    public Ghiozdan() {
        this.listRechizite = new Rechizita[100];
        nrRechizite = 0;
    }

    public void addRechizit (Caiet c){
        if(nrRechizite < 100)
            listRechizite[nrRechizite++] = c;
    }

    public void addRechizit (Manual c){
        if(nrRechizite < 100)
            listRechizite[nrRechizite++] = c;
    }

    public void listItems (){
        for(Rechizita a : listRechizite){
            if(a != null )
            System.out.println(a);
        }
    }

    public void listCaiet (){
        for(Rechizita a : listRechizite){
            if(a != null && a.getClass() == Caiet.class) {
                System.out.println(a);
            }
        }
    }

    public void listManual (){
        for(Rechizita a : listRechizite){
            if(a != null && a.getClass() == Manual.class){
                System.out.println(a);
            }
        }
    }

    public int getNrRechizite() {
        return nrRechizite;
    }

    public int getNrManuale(){
        int s = 0;
        for(Rechizita a :listRechizite){
            if(a != null &&  a.getClass() == Manual.class){
                s++;
            }
        }
        return s;
    }

    public int getNrCaiete(){
        int s = 0;
        for(Rechizita a :listRechizite){
            if(a != null && a.getClass() == Caiet.class){
                s++;
            }
        }
        return s;
    }
}
