package JavaClass.Weapons;

import java.awt.image.BufferedImage;
import java.io.Serializable;

public class Weapon implements Serializable {
    private int ID;
    private int opponentWinID;
    private int opponentLoseID;
    private BufferedImage image;

    public Weapon(int ID, int opponentWinID, int opponentLoseID, BufferedImage image) {
        this.ID = ID;
        this.opponentWinID = opponentWinID;
        this.opponentLoseID = opponentLoseID;
        this.image = image;
    }

    public int getID() {
        return ID;
    }

    public int getOpponentWinID() {
        return opponentWinID;
    }

    public int getOpponentLoseID() {
        return opponentLoseID;
    }

    public BufferedImage getImage() {
        return image;
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        switch (ID){
            case 0 : s.append("Rock");
                    break;
            case 1 : s.append("Paper");
                break;
            case 2 : s.append("Scissor");
                break;

        }
        return s.toString();
    }
}
