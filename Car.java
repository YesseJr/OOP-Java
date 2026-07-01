/*
*File name: Car.java
*Role: Child Class
*Author: Waython Yesse
*Date: July, 2026
*
*         PILLARS:
*Inheritance & Polymophism
*/

//Inheritance - Car extends (inherits from) Vehicle
public class Car extends Vehicle {

    //Polymorphism - Car overrides move() with its own behaviour
    @Override
    public void move(){
        System.out.println(getBrand() + " the car is driving smoothly on the road.");
    }
}
