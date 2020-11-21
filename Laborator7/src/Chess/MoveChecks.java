package Chess;

public class MoveChecks {

    public static boolean checkInTable(int x , int y){
        return !( x < 1 || x > 8 || y < 1 || y > 8);
    }

    public static boolean checkDiagonal(int newX , int newY , int x , int y){
        return ((Math.abs(newX - newY) == Math.abs(x - y)) || (8 - newX - newY == Math.abs(x-y)));
    }
    public static boolean checkLine (int newX ,  int x ){
        return (newX == x);
    }
    public static boolean checkColumn (int newY ,  int y ){
        return (newY == y);
    }
    public static boolean checkDifferentCoord (int newX , int newY , int x , int y){
        return !(newX == x && newY == y);
    }
}
