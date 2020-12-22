package JavaClass;

import JavaClass.Games.Match;
import JavaClass.Players.ListPlayers;
import JavaClass.Players.Player;
import JavaClass.Weapons.Paper;
import JavaClass.Weapons.Rock;
import JavaClass.Weapons.Scissors;

import java.io.IOException;

public class MainTest {

    public static void main(String[] args) throws IOException {
        ListPlayers listPlayers = new ListPlayers();
        Player player1 = new Player("Mar1" , "mar1");
        Player player2 = new Player("Ion1" , "ion1");
        Player player3 = new Player("Pop1" , "pop1");

        Rock rock = new Rock(null);
        Paper paper = new Paper(null);
        Scissors scissors = new Scissors(null);

        listPlayers.addList(player1);
        listPlayers.addList(player2);
        listPlayers.addList(player3);

        Match match = new Match(player1 , player2);

        player1.setNowWeapon(rock);
        player2.setNowWeapon(rock);

        match.startMatch();
        if(match.endMatch()){
            System.out.println(match.getChampion());
        }

        player1.setNowWeapon(paper);
        player2.setNowWeapon(scissors);

        match.startMatch();
        if(match.endMatch()){
            System.out.println(match.getChampion());
        }

        match.startMatch();
        if(match.endMatch()){
            System.out.println(match.getChampion());
        }

        System.out.println(player1);
        System.out.println(player2);

        System.out.println(listPlayers);
//
        ListPlayers.storePlayers();
//        ListPlayers listPlayers = new ListPlayers();
//        ListPlayers.loadPlayers();
//        System.out.println(listPlayers);
    }
}
