package MCV;

import JavaClass.Games.Game;
import JavaClass.Games.Match;
import JavaClass.Players.ListPlayers;
import JavaClass.Players.Player;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.LinkedList;

public class PlayerList {

    public static ObservableList<Player> getListPlayer(){
        ArrayList<Player> myPlayers = new ArrayList<>();
        try {
            myPlayers.addAll(ListPlayers.getList());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        ObservableList<Player> players = FXCollections.observableArrayList();
        players.addAll(myPlayers);
        return players;
    }

    public static ObservableList<Game> getListGame(){
        Player myP = Sign.myPlayer;

       LinkedList<Game> games = new LinkedList<>();
       try {
           games.addAll(myP.getHistoryGames());
       }catch (NullPointerException e){
           System.out.println(e.getMessage());
       }
       ObservableList<Game> games1 = FXCollections.observableArrayList();
       games1.addAll(games);
       return games1;
    }

}
