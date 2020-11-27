import Games.Match;
import Players.ListPlayers;
import Players.Player;
import Weapons.Paper;
import Weapons.Rock;
import Weapons.Scissors;

public class Main {

    public static void main(String[] args) {
        ListPlayers listPlayers = new ListPlayers();
        Player player1 = new Player("Marius");
        Player player2 = new Player("Ionut");
        Player player3 = new Player("Pop");

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
    }
}
