package MCV;

import JavaClass.Players.ListPlayers;
import JavaClass.Players.Player;

import java.io.IOException;

public class Sign {
    public static Player myPlayer;

    public static  boolean singIn (String name , String pass){
        for(Player player : ListPlayers.list){
            if(name.equals(player.getName()) && pass.equals(player.getPassword())){
                myPlayer = player;
                return true;
            }
        }
        return false;
    }

    public static  boolean singUp (String name , String pass) throws IOException {
        if(name.length() < 3) return  false;
        if(name.contains(" ")) return false;
        if(pass.contains(" ")) return false;
        if(pass.length() < 3) return  false;

        for(Player player : ListPlayers.list){
            if(name.equals(player.getName())){
                return false;
            }
        }
        myPlayer = new Player(name , pass);
        ListPlayers.list.add(myPlayer);
        PlayerList.getListPlayer().add(myPlayer);
        ListPlayers.storePlayers();
        return true;
    }

}
