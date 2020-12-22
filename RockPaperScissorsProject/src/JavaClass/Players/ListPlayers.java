package JavaClass.Players;

import JavaClass.Games.Game;
import JavaClass.Weapons.Weapon;
import javafx.collections.FXCollections;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.*;

public class ListPlayers {
    public static ArrayList<Player> list = new ArrayList<>();
    public static String filename = "ListPlayer.txt";


    public void addList(Player player){
        if(player != null){
            list.add(player);
        }
    }

    public static ArrayList<Player> getList() {
        sort();
        return list;
    }

    public static void sort(){
        Collections.sort(list);
    }

    public static void storePlayers() throws IOException {
        System.out.println();
        Path locPath = FileSystems.getDefault().getPath("players.dat");
        try (ObjectOutputStream locFile = new ObjectOutputStream(new BufferedOutputStream(Files.newOutputStream(locPath)))){
            for(Player player : list){
                locFile.writeObject(player);
            }
        }catch (NotSerializableException e){
            System.out.println(e);
        }

    }
    public static void loadPlayers(){
        Path locPath = FileSystems.getDefault().getPath("players.dat");
        try (ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(Files.newInputStream(locPath)))) {
            boolean eof = false;
            while (!eof){
                try {
                    Player player = (Player) locFile.readObject();
                    Player playerView = new Player(player.getName() , player.getScore());
                    list.add(player);
                }catch (IOException e){
                    eof = true;
                }
            }
        }catch (InvalidClassException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ListPlayers{" +
                "list=" + list +
                '}';
    }
}
