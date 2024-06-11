package com.example.crapsgame;

import java.util.Random;

public class Game {
    private String name;
    private Player player1;
    private Player player2;
    static boolean isOver;
    private int point;

    public Game(int point, String name) {
        this.point = point;
        this.name = name;
    }

    public void roll() {
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        System.out.println("Rolled: " + die1 + " + " + die2 + " = " + (die1 + die2));
    }

    public String getName() {
        return name;
    }

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

    void add(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void start() {
        while (!isOver) {
            player1.move();
            roll();
            player1.autoMove();

            if (isOver) break;

            player2.move();
            roll();
            player2.autoMove();
        }
    }
}
