package com.company;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat ( String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate){
        if (!satiety && plate.decreaseFood(appetite)){
            satiety = true;
        }
    }

    public void info() {
        if (!satiety)
            System.out.println(name + " хочет съесть " + appetite + ": останется голодным");
        else System.out.println(name + " хочет съесть " + appetite + ": станет сытым");

    }

}
