package com.company;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] catsArray = new Cat[4];
        catsArray[0] = new Cat("Мурзик",50);
        catsArray[1] = new Cat("Барсик", 30);
        catsArray[2] = new Cat("Леопольд", 40);
        catsArray[3] = new Cat("Матроскин", 20);

        for (int i = 0; i < catsArray.length; i++) {
            plate.info();
            catsArray[i].eat(plate);
            catsArray[i].info();
        }
    }
}
