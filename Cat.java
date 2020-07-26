package javaCoreAdvanced.lesson1OOP;

import java.util.Random;

public class Cat extends Players {
    public static Random random = new Random();
    public  static final int CAT_JUMP = random.nextInt(20);
    public  static final int CAT_RUN = random.nextInt(1200);
    private static final String CAT_NAME = "Кот";

    public Cat() {
        super(CAT_JUMP, CAT_RUN, CAT_NAME);
    }
}
