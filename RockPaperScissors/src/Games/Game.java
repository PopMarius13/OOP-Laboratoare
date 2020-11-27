package Games;


import Weapons.Weapon;

public class Game implements  Comparable<Game>{
    private int ID;
    private String result;
    private Weapon myWeapon;
    private Weapon opponentWeapon;

    public Game(int ID, String result, Weapon myWeapon, Weapon opponentWeapon) {
        this.ID = ID;
        this.result = result;
        this.myWeapon = myWeapon;
        this.opponentWeapon = opponentWeapon;
    }

    @Override
    public int compareTo(Game o) {
        if(this.ID < o.ID)
            return 1;
        else if(this.ID > o.ID)
            return -1;
        return 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Weapon getMyWeapon() {
        return myWeapon;
    }

    public void setMyWeapon(Weapon myWeapon) {
        this.myWeapon = myWeapon;
    }

    public Weapon getOpponentWeapon() {
        return opponentWeapon;
    }

    public void setOpponentWeapon(Weapon opponentWeapon) {
        this.opponentWeapon = opponentWeapon;
    }

    @Override
    public String toString() {
        return "Game{" +
                "ID=" + ID +
                ", result='" + result + '\'' +
                ", myWeapon=" + myWeapon +
                ", opponentWeapon=" + opponentWeapon +
                '}';
    }
}
