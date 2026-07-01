# Java OOP Implementation

**Author:** Waython Yesse Luoga
**Occupation** Student
**Course/Program:** IT
**Institute** Dar es Salaam Institute of Technology (DIT)
**Date:** July, 2026

## Topic Chosen

Vehicle

## Parent class

Vehicle

## Child Classes

Car & Motorcycle

## Files

| File              | Purpose                                                                                         |
| ----------------- | ----------------------------------------------------------------------------------------------- |
| `Vehicle.java`    | Abstract parent class. Holds shared fields (`brand`, `speed`) and the abstract `move()` method. |
| `Car.java`        | Child class, extends `Vehicle`, overrides `move()`.                                             |
| `Motorcycle.java` | Child class, extends `Vehicle`, overrides `move()`.                                             |
| `Main.java`       | Contains `main()`. Creates objects and runs the program.                                        |

## How the Four Pillars of OOP Are Shown

**1. Encapsulation**
`brand` and `speed` in `Vehicle.java` are declared `private`, and can only be accessed through public getter and setter methods (`setBrand`, `getBrand`, `setSpeed`, `getSpeed`).

**2. Inheritance**
`Car` and `Motorcycle` both use `extends Vehicle`, so they automatically inherit the fields and methods of `Vehicle` without rewriting them.

**3. Polymorphism**
Both `Car` and `Motorcycle` override the `move()` method with their own version (`@Override`). In `Main.java`, a single `Vehicle[]` array holding both objects calls `move()` in a loop — Java decides at runtime which version to run, printing different output for each object even though the code calling them is identical.

**4. Abstraction**
`Vehicle` is declared `abstract` and its `move()` method has no body — it only defines _that_ a vehicle can move, not _how_. Each child class is forced to supply its own implementation.

## How to Run

1. Open an online Java compiler (e.g. programiz.com/java-programming/online-compiler or jdoodle.com).
2. Paste all four files as separate classes in the same project.
3. Make sure `Main.java` (the class containing `main`) is set as the public/entry class.
4. Click **Run**.

### Expected Output

```
Brand: Toyota | Top Speed: 180 km/h
Toyota the car is driving smoothly on the road.
Brand: Yamaha | Top Speed: 140 km/h
Yamaha the motorcycle is zooming through traffic.
---
Toyota the car is driving smoothly on the road.
Yamaha the motorcycle is zooming through traffic.
```

## Note

The classic `User` / `Admin` / `Customer` example was already used as the in-class demonstration, so the `Vehicle` topic was chosen instead to keep this an original individual submission.
