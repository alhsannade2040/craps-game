package com.example.crapsgame;

import java.util.Random;
import java.util.Scanner;

public class Player {
       private String name;

      public String bank;
     private int wins;
    private int loss;
    static int trials;

    public Player(String name) {
        this.name = name;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBank() {
        return bank ;
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
//System.out.println(name + "its your time to play");

    void autoMove(int choice){
//        while (true){
        if (Game.isOVer) return;

            char userChoice;
            boolean isInputValid=true;

        Random random = new Random();
         choice = random.nextInt(6); // I am not sure about it


        if (choice==7 || choice==11)
        {
            System.out.println("you won");
        } else if (choice== 2 || choice==3 || choice==12) {
            System.out.println("unfortunately you have lost ");
        }
        else {
            Scanner best = new Scanner(System.in);
            String readString = best.nextLine();
            while (readString!=null){
                System.out.println(readString);
                if (readString.isEmpty()){
                    System.out.println("press [Enter] to play again");
                }
            }

        }

        }


    void move(){
        {
            Scanner some = new Scanner(System.in);
            String readString = some.nextLine();
            while (readString!=null){
                System.out.println(readString);
                if (readString.isEmpty()){
                    System.out.println("press [Enter] to play again");
                }
            }

        }


    }

}
