package Players;

import Games.Game;
import Weapons.Paper;
import Weapons.Rock;
import Weapons.Scissors;
import Weapons.Weapon;

import java.awt.image.BufferedImage;
import java.util.LinkedList;

public class Player implements Comparable<Player>{
    private final String name;
    private final LinkedList<Game> historyGames = new LinkedList<>();
    private Weapon nowWeapon;
    private int score;
    private int id = 0;

    public Player(String name) {
        this(name , null);
    }

    public Player(String name, Weapon nowWeapon) {
        this.name = name;
        this.nowWeapon = nowWeapon;
        this.score = 0;
    }

    public void chooseWeapon (int id , BufferedImage image){
        Weapon weapon;
        if(id == 0)
            weapon = new Paper(image);
        else if(id == 1)
            weapon = new Rock( image);
        else
            weapon = new Scissors(image);
        this.setNowWeapon(weapon);
    }
    @Override
    public int compareTo(Player o) {
        if(o.getScore() > this.score)
            return 1;
        if(o.getScore() < this.score)
            return  -1;
        return 0;
    }

    public void sortList(){
        historyGames.sort(Game::compareTo);
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
        return "Player{" +
                "name='" + name  +
                ", score = " + score +
                ",\n historyGames=" + historyGames +
                ",\n nowWeapon=" + nowWeapon +
                '}';
    }
}
