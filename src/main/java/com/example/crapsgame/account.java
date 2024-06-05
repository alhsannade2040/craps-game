package com.example.crapsgame;

public class account {
    int id;
    String name;
    float amount;

    public account() {

    }

    public account(int id, String name, float amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int CheckAccountMoney(float balance , int enoughMoney ){

        if (enoughMoney < balance)
        return 1 ;
        else
            System.out.println("there is no enough money to start playing ");
        return enoughMoney;
    }
}
