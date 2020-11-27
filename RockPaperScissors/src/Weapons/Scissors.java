package Weapons;

import java.awt.image.BufferedImage;

public class Scissors extends Weapon {

    private final String name = "Scissors";

    public Scissors( BufferedImage image) {
        super(2, 0, 1, image);
    }

    public int verifWin(int opponentID) {
        if(opponentID == this.getID())
            return 0;
        if(opponentID == this.getOpponentWinID())
            return 1;
        if(opponentID == this.getOpponentLoseID())
            return 2;
        return -1;
    }

    @Override
    public String toString() {
        return "Scissors{" +
                "name='" + name + '\''  +
                '}';
    }
}
