package Chess;

public class Knights extends PieceChess{
    public Knights(int coordX, int coordY) {
        super("Knight", coordX, coordY);
    }

    @Override
    public boolean movePiece(int newCoordX, int newCoordY) {
        if(MoveChecks.checkDifferentCoord(newCoordX , newCoordY ,getCoordX() , getCoordY()) &&
                MoveChecks.checkInTable(newCoordX , newCoordY) &&
                moveKnight(newCoordX , newCoordY)
        )
        {
            setCoordX(newCoordX);
            setCoordY(newCoordY);
            return true;
        }
        return false;
    }

    public  boolean moveKnight (int newX , int newY){
        int a = Math.abs(newX - getCoordX());
        int b = Math.abs(newY - getCoordY());

        return (a == 2 && b == 1) ||
                (a == 1 && b == 2);
    }
}
