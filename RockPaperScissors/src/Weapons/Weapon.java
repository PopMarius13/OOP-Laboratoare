package Weapons;

import java.awt.image.BufferedImage;

public class Weapon {
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
        return "Weapon.weapon{" +
                "ID=" + ID +
                ", opponentWinID=" + opponentWinID +
                ", opponentLoseID=" + opponentLoseID +
                ", image=" + image +
                '}';
    }
}
