package JavaClass.Players;


import JavaClass.Games.Game;
import JavaClass.Weapons.Paper;
import JavaClass.Weapons.Rock;
import JavaClass.Weapons.Scissors;
import JavaClass.Weapons.Weapon;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.LinkedList;

public class Player implements Serializable , Comparable<Player>{
    private final String name;
    private String password = null;
    private final LinkedList<Game> historyGames = new LinkedList<>();
    private Weapon nowWeapon;
    private int score;
    private int id = 0;

    public Player(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Player(String name, Weapon nowWeapon) {
        this.name = name;
        this.nowWeapon = nowWeapon;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void chooseWeapon (int id , BufferedImage image){
        Weapon weapon = null;

        if(id == 0)
            weapon = new Paper(image);
        else if(id == 1)
            weapon = new Rock( image);
        else if(id == 2)
            weapon = new Scissors(image);

        this.setNowWeapon(weapon);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }


    public LinkedList<Game> getHistoryGames() {
        return historyGames;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getNowWeapon() {
        return nowWeapon;
    }

    public void setNowWeapon(Weapon nowWeapon) {
        this.nowWeapon = nowWeapon;
    }
    public void addGame (Game game){
        if(game != null){
            this.historyGames.add(game);
            if(game.getResult().compareTo("Win") == 0)
                this.score++;
            else if(game.getResult().compareTo("Lose") == 0)
                this.score--;
        }
    }

    @Override
    public String toString() {
        return name  + "\t\tScore:  " + score;
    }


    @Override
    public int compareTo(Player o) {
        if(o.getScore() > getScore())
            return 1;
        if(o.getScore() == getScore())
            return getName().compareTo(o.getName());
       return -1;
    }
}
