package Players;

import java.util.LinkedList;

public class ListPlayers {
    private final LinkedList<Player> list = new LinkedList<>();

    public void sortList(){
        list.sort(Player::compareTo);
    }

    public void addList(Player player){
        if(player != null){
            list.add(player);
        }
    }

    @Override
    public String toString() {
        return "ListPlayers{" +
                "list=" + list +
                '}';
    }
}
