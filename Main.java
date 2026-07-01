/*
*File name: Main.java
*Role: Runs the program (this is the PUBLIC class with main)
*Author: Waython Yesse
*Date: July, 2026
*/

public class Main {
    public static void main(String[] args){

        //Creating objects of the child classes
        Car myCar = new Car();
        myCar.setBrand("Toyota");
        myCar.setSpeed(180);

        Motorcycle myBike = new Motorcycle();
        myBike.setBrand("Yamaha");
        myBike.setSpeed(140);

        //Calling their methods - encapsulation in action (getters/setters)
        myCar.displayInfo();
        myCar.move();

        myBike.displayInfo();
        myBike.move();

        System.out.println("----");

        //Polymorphism - one Vehicle type reference, two different behaviours
        Vehicle[] vehicles = { myCar, myBike };
        for (Vehicle v : vehicles){
            v.move(); //Java decides at runtime whether it's Car's or Motorcycle's move()
        }
    }
}
