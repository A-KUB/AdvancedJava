package javaCoreAdvanced.lesson1OOP;

import static java.awt.SystemColor.info;

public class Main {
    public static Players[] players;


    public static void main(String[] args) {
        Players[] players = creatPlayers();
        Barrier[] barriers = creatBarriers();
        Wall wall = new Wall();
        RunningTrack track = new RunningTrack();
        playGameVs1(players, wall, track);
    /*Здравствуйте! Вот вроде очень легкое задание, но так долго я еще ничего не решал, да еще и не решил
     В условии нужно было сделать массив прептсвий. Необходимо было созадать класс для препятсвий
     или просто создатьм массив как ниже?*/
        // boolean[] barrier = new boolean[] {wall.jumpingOverWall(), track.runningForTrack()};
       /* если да, то тогда нужо создать конструктор без аргументов и нииже опять проблема
         for (int i = 0; i < players.length ; i++) {
               if (barrier[0](players[i].getJump(), players[i].getName())) { а здесь получается он обращается к
               конструктору без аргументов и не подставляет значения*/
          /* если создать класс родителя для препятсвий и мы берем первого игрока, начинаем перебирать
          препятсвия, то если он проходит первое, переходим на второе, а как перебирать возможности игрока (прыжок, бег и тд)
          массив нужен?
            for (Players player : players) {
            for (int i = 0; i <barriers.length; i++) {
                if (barriers[i].play(player.getJump()){
                }
            }
        }*/
        
    }

    private static void playGameVs1(Players[] players, Wall wall, RunningTrack track) {
        System.out.println("Первый вариат");
        for (Players player : players) {
            if (wall.play(player.getJump(), player.getName())) {
                track.play(player.getRun(), player.getName());
            }
        }
    }

    private static Barrier[] creatBarriers() {
        return new Barrier[] {new Wall(), new RunningTrack()};
    }

    private static Players[] creatPlayers() {
        return new Players[]{new Human(), new Cat(), new Robot()};
    }
}