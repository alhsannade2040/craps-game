package com.example.crapsgame;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private String bank;
    private int wins;
    private int loss;
    static int trials;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    void autoMove() {
        if (Game.isOver)
            return;

        Random random = new Random();
        int choice = random.nextInt(12) + 1;

        if (choice == 7 || choice == 11) {
            System.out.println("You won");
        } else if (choice == 2 || choice == 3 || choice == 12) {
            System.out.println("Unfortunately, you have lost");
        } else {
            Scanner best = new Scanner(System.in);
            System.out.println("Press [Enter] to play again");
            best.nextLine();
        }
    }

    void move() {
        Scanner some = new Scanner(System.in);
        System.out.println("Press [Enter] to play");
        some.nextLine();
    }
}
