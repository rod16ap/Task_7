package com.company;

public class Plate {
    private int food;
    public Plate ( int food ) {
        this.food = food;
    }

    public void info () {
        System.out.println("В тарелке: " + food);
    }

    boolean decreaseFood(int n) {
        if (food < n) return false;
        else {
            food = food - n;
            return true;
        }

    }
    public void addFood(int food) {
        this.food = this.food + food;
    }

}
