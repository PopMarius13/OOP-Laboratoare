package Players;

import Weapons.Weapon;

import java.awt.image.BufferedImage;
import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer(String name) {
        super(name);
    }

    public ComputerPlayer(String name, Weapon nowWeapon) {
        super(name, nowWeapon);
    }

    public void randomWeapon(BufferedImage image){
        Random random = new Random(6);
        int t = random.nextInt()%3;
        super.chooseWeapon(t , image);
    }

}
