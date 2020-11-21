package Chess;

public abstract class  PieceChess {
    /**
     * 3.4.creați o clasa abstractă PiesaSah care să fie caracterizată prin atributele numePiesa și
     * coordonatele ei pe tabla de sah: coordX si coordY, și care să conțină metoda abstractă
     * mutaPiesa(int new_coordX, int new_coordY)
     * - creați apoi câte o clasă pentru fiecare piesă de șah (Nebun, Tura, Pion etc.) care să
     * moștenească clasa PiesaSah și să implementeze metoda mutaPiesa în funcție de regulile de
     * deplasare a fiecărei piese
     * - într-o clasă de test, creați tabla de șah ca un tablou de piese de șah, poziționați câteva piese
     * pe tabla de șah și apoi încercați să efectuați operații de mutare a pieselor la coordonate noi
     * citite din consolă; piesa se va muta la noile coordonate doar dacă mutarea este validă.
     *
     *  king
     * 1 queen
     * 2 rooks
     * 2 bishops
     * 2 knights
     * 8 pawns
     * */

    private String NamePiece;
    private int coordX;
    private int coordY;

    public PieceChess(String namePiece,int coordX, int coordY) {
        NamePiece = namePiece;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public abstract boolean movePiece (int newCoordX , int newCoordY);

    @Override
    public String toString() {
        return "PieceChess{" +
                "NamePiece='" + NamePiece + '\'' +
                ", coordX=" + coordX +
                ", coordY=" + coordY +
                '}';
    }
}
