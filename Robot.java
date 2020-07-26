package javaCoreAdvanced.lesson1OOP;

import java.util.Random;

public class Robot extends Players {
    public static Random random = new Random();
    public  static final int ROBOT_JUMP = random.nextInt(30);
    public  static final int ROBOT_RUN = random.nextInt(5000);
    private static final String ROBOT_NAME = "Робот";

    public Robot() {
        super(ROBOT_JUMP, ROBOT_RUN, ROBOT_NAME);
    }
}
