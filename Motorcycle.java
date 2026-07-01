/*
*File name: Motorcycle.java
*Role: Child Class
*Author: Waython Yesse
*Date: July, 2026
*
*         PILLARS:
*Inheritance & Polymophism
*/

//Inheritance - Motorcycle extends (inherits from) Vehicle
public class Motorcycle extends Vehicle {

    //Polymorphism - Motorcycle overrides move() with its own behaviour
    @Override
    public void move(){
        System.out.println(getBrand() + " the motorcycle is zooming through traffic.");
    }
}
