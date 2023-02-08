package Exercice4;


/*
*@author Wilfried koua
*/

public class SmartPhone extends Computer {

    //les proprietes
    private String operatingSystem;

    //le constructeur
    public SmartPhone(String brand, int stockage,String modele) {
        super(brand, modele, stockage);
        this.operatingSystem = operatingSystem;
    }

    
    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Operating System: " + operatingSystem);
    }

    public void makeCall(String phoneNumber) {
        String brand = null;
        System.out.println("Calling " + phoneNumber + " using " + brand + " smartphone");
    }
}
