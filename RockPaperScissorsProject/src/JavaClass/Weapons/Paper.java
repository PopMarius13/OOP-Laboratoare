package JavaClass.Weapons;

import java.awt.image.BufferedImage;

public class Paper extends Weapon {
    private final String name = "Paper";

    public Paper(BufferedImage image) {
        super(0, 1, 2, image);
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
