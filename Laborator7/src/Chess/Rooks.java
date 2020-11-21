package Chess;

public class Rooks extends  PieceChess{
    public Rooks( int coordX, int coordY) {
        super("Rook", coordX, coordY);
    }

    @Override
    public boolean movePiece(int newCoordX, int newCoordY) {
        if( MoveChecks.checkDifferentCoord(newCoordX , newCoordY ,getCoordX() , getCoordY()) &&
                MoveChecks.checkInTable(newCoordX , newCoordY) &&
                (   MoveChecks.checkColumn(newCoordY , getCoordY()) ||
                    MoveChecks.checkLine(newCoordX , getCoordX())
                ))
        {
            setCoordX(newCoordX);
            setCoordY(newCoordY);
            return true;
        }
        return false;
    }


}
