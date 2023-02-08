package Exercice3;


/*
*@author Wilfried koua
*/

public class Car extends Vehicle {
    private String name;


    // Default Constructor
    public Car() {
    super();
    }

    // This function sets the name of the car
    public void setDetails(String name, String model, int speed) {
        this.name = name;
        setModel(model);
        setSpeed(speed);
    }

    public void setDetails(String name){
        this.name = name;
    }



    // This function calls the Base class functions and appends the result with the input
    public String getDetails(String carName) {
        return carName +"," + getModel() + "," + getSpeed();
    }
}
