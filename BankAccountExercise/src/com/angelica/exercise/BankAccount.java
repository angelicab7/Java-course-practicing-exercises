package com.angelica.exercise;

public class BankAccount {
    private String ownerName;
    private int moneyAmount;

    public BankAccount(String ownerName){
        this.ownerName = ownerName;
        this.moneyAmount = 0;
    }

    public int getMoneyAmount(){
        return this.moneyAmount;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public void setMoneyAmount(int moneyAmount){
        this.moneyAmount = moneyAmount;
    }

    public void addAmount(int newValue){
        this.moneyAmount = this.moneyAmount + newValue;
    }

    public void retrieveAmount(int newValue){
        if (newValue <= this.moneyAmount){
            this.moneyAmount = this.moneyAmount - newValue;
        } else {
            System.out.println("Sorry, you don´t have enough funds to make this transaction");
        }
    }
}
