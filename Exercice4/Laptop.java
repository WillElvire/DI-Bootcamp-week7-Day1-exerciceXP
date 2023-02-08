package Exercice4;


/*
*@author Wilfried koua
*/

public class Laptop extends Computer {

    //les proprietes
    private int batteryLife;

    //le constructeur
    public Laptop(String brand, int stockage, int batteryLife, String modele) {
        super(brand, modele, stockage);
        this.batteryLife = batteryLife;
    }


   @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Battery life: " + batteryLife + " hours");
    }

    public void useTouchpad(String action) {
        System.out.println("Using touchpad to " + action);
    }
}
