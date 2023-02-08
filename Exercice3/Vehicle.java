package Exercice3;


/*
*@author Wilfried koua
*/

public class Vehicle {
    private String model;
    private int speed;

    public Vehicle() {
        super();
    }

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return this.model;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
