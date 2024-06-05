package com.example.crapsgame;

import java.util.Scanner;

public class Bank {
    private float balance;

    public Bank(int balance, int user) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

//    public int getPlayer() {
//        return player;
//    }
//
//    public void setPlayer(int player) {
//        this.player = player;
//    }

    public void withrow(float amount) {
        System.out.println("Enter amount to deposit:");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();
        if (amount < 0) {
            System.out.println("Invalid Amount");
//            return 1;// it that pasible to make it two returns at the same time
        }
        else if (amount>balance)
            System.out.println("you dont have enough meony to withdorw it");
        else
        this.balance= balance - amount;
        System.out.println("this options has been succufully");
//        return this.balance; // it should return using setter only

//        return amount;
    }

    public void deposit(float amt)
        {

            float bal= 0;
            System.out.println("Your Balance=" + balance);
            System.out.print("Enter amount to withdraw:");
            Scanner input = new Scanner(System.in);
            amt = input.nextInt();
            this.balance=  this.balance + amt;

            System.out.println("this options has been succufully");

//            if (bal < amt) {
//                System.out.println("Not sufficient balance.");
//                return 1;
//            }
//            if (amt < 0) {
//                System.out.println("Invalid Amount");
//                return 1;
//            }
//            bal = bal - amt;
//            return 0;

        }
//        return this.balance+deposit();

    }

