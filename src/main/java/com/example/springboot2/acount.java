package com.example.springboot2;

public class acount {
    double money;
    int id;
    String name;

    @Override
    public String toString() {
        return "acount{" +
                "money=" + money +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
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
}
