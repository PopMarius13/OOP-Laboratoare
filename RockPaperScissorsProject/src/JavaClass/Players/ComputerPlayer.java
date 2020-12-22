package JavaClass.Players;


import JavaClass.Weapons.Weapon;

import java.awt.image.BufferedImage;
import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer(String name, String password) {
        super(name, password);
    }

    public ComputerPlayer(String name, Weapon nowWeapon) {
        super(name, nowWeapon);
    }

    public void randomWeapon(BufferedImage image){
        Random random = new Random();
        int t = random.nextInt(3);
        System.out.println(t);
        super.chooseWeapon(t , image);
    }

}
