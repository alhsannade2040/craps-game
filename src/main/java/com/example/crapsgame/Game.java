package com.example.crapsgame;
import java.util.Random;
public class Game {
    private String name;
       private Player player1; //
    private Player player2;
    static boolean isOVer;
    private int point; // to keep playing if he didnt pass or lose
    private String gameState;
    public Game(int point,String name)
    {
        this.point = point;
        this.name=name;
    }
    public void roll(){
        Random rand = new Random();
        rand.nextInt();
        int die1 = ( (rand() % 6) + 1);
        int die2 = ( (rand() % 6) + 1);

    }
    private int rand() {
        Math.random();
        return rand();
    }
    //   public int getBank(){
//        return bank;
//    }
    // how to return it again here
    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    void add(Player player1, Player player2){
        this.player1=player1;
        this.player2=player1;
    }

   void start(){
//        player1.Move();

//        player1.Move();
//        player2.Move();
   }
}
