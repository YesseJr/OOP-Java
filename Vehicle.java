/*
*File name: Vehicle.java
*Role: Parent Class (Abstract)
*Author: Waython Yesse
*Date: July, 2026
*
*         PILLARS:
*Abstraction & Encapsulation
*/

public abstract class Vehicle {

    //Encapsulation - private fields, nobody outside can touch these directly
    private String brand;
    private int speed;

    //Setter method - set/store a value
    public void setBrand(String brand){
        this.brand = brand;
    }
    //Getter method - it gives something back
    public String getBrand(){
        return brand;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }

    //Abstraction - Vehicle doesn't know exactly HOW it moves,
    //but Car and Motorcycle (its children) do, so they must say how.
    public abstract void move();

    //A normal method every child will share (not abstract)
    public void displayInfo(){
        System.out.println("Brand: " + brand + " | Top Speed: " + speed + " km/h");
    }
}
