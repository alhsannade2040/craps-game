package com.example.crapsgame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("hasan");
        Player player2 = new Player("ali");
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play craps");

        Game game = new Game(0, "Craps Game");
        game.add(player1, player2);
        game.start();
    }
}
