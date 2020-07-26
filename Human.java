package javaCoreAdvanced.lesson1OOP;

import java.util.Random;

public class Human extends Players {
    public static Random random = new Random();
    public  static final int HUMAN_JUMP = random.nextInt(10);
    public  static final int HUMAN_RUN = random.nextInt(2000);
    private static final String HUMAN_NAME = "Человек";

    public Human() {
        super(HUMAN_JUMP, HUMAN_RUN, HUMAN_NAME);
    }

}
