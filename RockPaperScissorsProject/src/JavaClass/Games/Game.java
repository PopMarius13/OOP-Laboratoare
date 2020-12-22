package JavaClass.Games;


import JavaClass.Weapons.Weapon;

import java.io.Serializable;

public class Game implements Serializable {
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
        return ID + ") "  + result + "\nMy Weapon: " +  myWeapon.toString() +
                "\nOpponent Weapon: " + opponentWeapon.toString();
    }
}
