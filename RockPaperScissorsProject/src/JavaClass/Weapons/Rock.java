package JavaClass.Weapons;

import java.awt.image.BufferedImage;

public class Rock extends Weapon {

    private final String name = "Rock";

    public Rock( BufferedImage image) {
        super(1, 2, 0, image);
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


}
