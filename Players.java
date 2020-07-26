package javaCoreAdvanced.lesson1OOP;

public abstract class Players {

    private int jump;
    private int run;
    private String name;

    public int getRun() {
        return run;
    }

    public Players setRun(int run) {
        this.run = run;
        return this;
    }

    public String getName() {
        return name;
    }

    public Players setName(String name) {
        this.name = name;
        return this;
    }

    public Players(int jump, int run, String name) {
        this.jump = jump;
        this.run = run;
        this.name = name;
    }

    

    public int getJump() {
        return jump;
    }

    public Players setJump(int jump) {
        this.jump = jump;
        return this;
    }
}
