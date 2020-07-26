package javaCoreAdvanced.lesson1OOP;

import java.util.Random;

public class Wall extends Barrier {

    final int WALL_HEIGHT = 5;

    public boolean play (int jumpHeight, String name){
        if (jumpHeight >= WALL_HEIGHT){
            System.out.println("Испытание проходит " + name + ". Высота стены: " + WALL_HEIGHT + " Смог прыгнуть на " + jumpHeight);
        return true;}
            System.out.println(name + " не смог перепрыгнуть, высота стены " + WALL_HEIGHT + " а прыгнул " + jumpHeight );
        return false;
    }


}
