package Chess;

public class MainChess {
    public static void main(String[] args) {
        King king = new King(1 , 5);
        Queen queen = new Queen(1 , 4);
        Pawns pawns = new Pawns(2 , 4);
        Bishops bishops = new Bishops(1 , 3);
        Knights knights = new Knights(1 ,2);
        Rooks rooks = new Rooks(1 ,1);

        System.out.println(king);
        System.out.println(king.movePiece(2, 5));
        System.out.println(king);
        System.out.println(king.movePiece(5, 5));

        System.out.println();

        System.out.println(queen);
        System.out.println(queen.movePiece(4, 7));
        System.out.println(queen);
        System.out.println(queen.movePiece(5, 4));

        System.out.println();

        System.out.println(bishops);
        System.out.println(bishops.movePiece(3, 1));
        System.out.println(bishops);
        System.out.println(bishops.movePiece(3, 2));

        System.out.println();

        System.out.println(knights);
        System.out.println(knights.movePiece(3, 1));
        System.out.println(knights);
        System.out.println(knights.movePiece(4, 2));

        System.out.println();

        System.out.println(rooks);
        System.out.println(rooks.movePiece(1, 8));
        System.out.println(rooks);
        System.out.println(rooks.movePiece(2, 7));

        System.out.println();

        System.out.println(pawns);
        System.out.println(pawns.movePiece(3, 4));
        System.out.println(pawns);
        System.out.println(pawns.movePiece(5, 4));

    }
}
