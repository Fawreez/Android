package com.example.moneypile;

public class finance {

    private String  type, description, date;
    private int money;

    public finance( String type, String description, String date, int money) {
        this.type = type;
        this.description = description;
        this.date = date;
        this.money = money;
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public int getMoney() {
        return money;
    }
}
