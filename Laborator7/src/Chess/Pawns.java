package Chess;

public class Pawns extends  PieceChess{
    public Pawns(int coordX, int coordY) {
        super("Pawn", coordX, coordY);
    }

    @Override
    public boolean movePiece(int newCoordX, int newCoordY) {
        if(  MoveChecks.checkDifferentCoord(newCoordX , newCoordY ,getCoordX() , getCoordY()) &&
                MoveChecks.checkInTable(newCoordX , newCoordY) &&
                moveForward(newCoordX , newCoordY))
        {
            setCoordX(newCoordX);
            setCoordY(newCoordY);
            return true;
        }
        return false;
    }

    private boolean moveForward (int newX , int newY){
        return (newX == getCoordX() + 1) &&
                newY == getCoordY();
    }
}
