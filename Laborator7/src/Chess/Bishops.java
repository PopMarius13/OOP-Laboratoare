package Chess;

public class Bishops extends PieceChess {

    public Bishops( int coordX, int coordY) {
        super("Bishop", coordX, coordY);
    }

    @Override
    public boolean movePiece(int newCoordX, int newCoordY) {
       if(  MoveChecks.checkDifferentCoord(newCoordX , newCoordY ,getCoordX() , getCoordY()) &&
                MoveChecks.checkInTable(newCoordX , newCoordY) &&
                MoveChecks.checkDiagonal(newCoordX , newCoordY , getCoordX() , getCoordY()))
       {
           setCoordX(newCoordX);
           setCoordY(newCoordY);
           return true;
       }
        return false;
    }
}
