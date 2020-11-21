package Chess;

public class King extends PieceChess{
    public King( int coordX, int coordY) {
        super("King", coordX, coordY);
    }

    @Override
    public boolean movePiece(int newCoordX, int newCoordY) {
        if(  MoveChecks.checkDifferentCoord(newCoordX , newCoordY ,getCoordX() , getCoordY()) &&
                MoveChecks.checkInTable(newCoordX , newCoordY) &&
                (   MoveChecks.checkDiagonal(newCoordX , newCoordY , getCoordX() , getCoordY()) ||
                    MoveChecks.checkColumn(newCoordY , getCoordY()) ||
                    MoveChecks.checkLine(newCoordX , getCoordX())
                )&&
                checkDistance(newCoordX , newCoordY)

        )
        {
            setCoordX(newCoordX);
            setCoordY(newCoordY);
            return true;
        }
        return false;
    }
    private boolean checkDistance (int newX , int newY){
        int a = Math.abs(newX - getCoordX());
        int b = Math.abs(newY - getCoordY());

        return  (a >= 0 && a <= 1) &&
                (b >= 0 && b <= 1);
    }
}
