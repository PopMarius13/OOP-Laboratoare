package Chess;

public class Queen extends PieceChess {
    public Queen(int x , int y ) {
        super("Queen" , x , y );
    }


    @Override
    public boolean movePiece(int newCoordX, int newCoordY) {

    if(  MoveChecks.checkDifferentCoord(newCoordX , newCoordY ,getCoordX() , getCoordY()) &&
            MoveChecks.checkInTable(newCoordX , newCoordY) &&
            (   MoveChecks.checkDiagonal(newCoordX , newCoordY , getCoordX() , getCoordY()) ||
                MoveChecks.checkColumn(newCoordY , getCoordY()) ||
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
