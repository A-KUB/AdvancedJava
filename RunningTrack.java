package javaCoreAdvanced.lesson1OOP;

import java.util.Random;

public class RunningTrack extends Barrier {
    final int TRACK_LENGHT = 1000;
    @Override
    public boolean play (int runningLengt, String name) {
        if (runningLengt >= TRACK_LENGHT){
            System.out.println("Испытание проходит " + name + ". Длинна трека : " + TRACK_LENGHT + " Смог пробежать " + runningLengt);
            return true;}
        System.out.println(name + " не смог пробежать, длинна трека " + TRACK_LENGHT + " а пробежал " + runningLengt );
        return false;
    }
}
