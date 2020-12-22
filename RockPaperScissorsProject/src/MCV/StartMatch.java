package MCV;

import JavaClass.Games.Game;
import JavaClass.Games.Match;
import JavaClass.Players.ComputerPlayer;
import JavaClass.Players.ListPlayers;
import JavaClass.Players.Player;

import java.io.IOException;

public class StartMatch {
    private Player myPlayer;
    private ComputerPlayer opponentPlayer;

    public StartMatch(Player myPlayer) {
        this.myPlayer = myPlayer;

        opponentPlayer = new ComputerPlayer("Computer" , "Computer");
    }

    public Game getGame() throws IOException {
        opponentPlayer.randomWeapon(null);

        int result;
        if(myPlayer.getNowWeapon().getID() == opponentPlayer.getNowWeapon().getID()) {
            result = 0;
        }else if(myPlayer.getNowWeapon().getID() == 0){
            if(opponentPlayer.getNowWeapon().getID() == 1)
                result = 2;
            else
                result = 1;
        }else if(myPlayer.getNowWeapon().getID() == 1){
            if(opponentPlayer.getNowWeapon().getID() == 0)
                result = 1;
            else
                result = 2;
        }else{
            if(opponentPlayer.getNowWeapon().getID() == 0)
                result = 2;
            else
                result = 1;
        }

        String string1;
        if(result == 1) {
            string1 = "Win";
        }else if (result == 2){
            string1 = "Lose";
        }else{
            string1 = "Equality";
        }

        Game game1 = new Game(myPlayer.getId() + 1, string1 , myPlayer.getNowWeapon() ,opponentPlayer.getNowWeapon()  );

        myPlayer.setId(myPlayer.getId() + 1);
        myPlayer.addGame(game1);

        return game1;
    }
}
