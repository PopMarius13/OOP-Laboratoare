package Ghiozdan;

public class Main {
    public static void main(String[] args) {

        Rechizita MateCaiet = new Caiet("mate");
        Rechizita MateManual = new Manual("mate");
        Rechizita RomanaCaiet = new Caiet("Romana");
        Rechizita RomanaManual = new Manual("Romana");
        Rechizita InfoCaiet = new Caiet("info");
        Rechizita InfoManual = new Manual("info");

        System.out.println(MateCaiet.getName() );
        System.out.println(MateManual.getName() );

        Ghiozdan myGhiozdan = new Ghiozdan();

        myGhiozdan.addRechizit((Caiet) RomanaCaiet);
        myGhiozdan.addRechizit((Manual) InfoManual);
        myGhiozdan.addRechizit((Caiet) MateCaiet);

        myGhiozdan.listItems();
        System.out.println();
        myGhiozdan.listCaiet();
        System.out.println();
        myGhiozdan.listManual();
        System.out.println();
        System.out.println();

        myGhiozdan.addRechizit((Manual) RomanaManual);
        myGhiozdan.addRechizit((Caiet) InfoCaiet);
        myGhiozdan.addRechizit((Manual) MateManual);

        myGhiozdan.listItems();
        System.out.println();
        myGhiozdan.listCaiet();
        System.out.println();
        myGhiozdan.listManual();
        System.out.println();
        System.out.println();

        System.out.println(myGhiozdan.getNrCaiete());
        System.out.println(myGhiozdan.getNrManuale());
        System.out.println(myGhiozdan.getNrRechizite());
    }


}
