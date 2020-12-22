package Games;

import Players.Player;

public class Match {
    private Player player1;
    private Player player2;
    private int winPlayer1;
    private int winPlayer2;
    private int champion;

    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        winPlayer1 = 0;
        winPlayer2 = 0;
    }

    public int getChampion() {
        return champion;
    }

    public int startMatch (){
        champion = 0;
        int result;
        if(player1.getNowWeapon().getID() == player2.getNowWeapon().getID()) {
            result = 0;
        }
        else if(player1.getNowWeapon().getOpponentWinID() == player2.getNowWeapon().getID()) {
            result = 1;
        }
        else {
            result = -1;
        }

        String string1;
        String string2;
        if(result == 1) {
            string1 = "Win";
            string2 = "Lose";
            winPlayer1 ++;
        }else if (result == -1){
            string1 = "Lose";
            string2 = "Win";
            winPlayer2++;
        }else{
            string1 = "Equality";
            string2 = "Equality";
        }

        Game game1 = new Game(player1.getId() + 1, string1 , player1.getNowWeapon() ,player2.getNowWeapon()  );
        Game game2 = new Game(player2.getId() + 1, string2 , player2.getNowWeapon() ,player1.getNowWeapon()  );

        player1.setId(player1.getId() + 1);
        player2.setId(player2.getId() + 1);
        player1.addGame(game1);
        player2.addGame(game2);

        return result;
    }

    public boolean endMatch (){
        if(winPlayer2 == 2 || winPlayer1 == 2){
            if(winPlayer2 == 2)
                champion = 2;
            else
                champion = 1;
            winPlayer1 = 0;
            winPlayer2 = 0;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Match{" +
                "player1=" + player1 +
                ", player2=" + player2 +
                ", winPlayer1=" + winPlayer1 +
                ", winPlayer2=" + winPlayer2 +
                '}';
    }
}
