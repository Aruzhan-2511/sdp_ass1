# Car Builder Pattern
## Project Description
This project demonstrates the Builder Design Pattern in Java.
This project is a Car with different properties such as brand, model, color, year, and engine. CarBuilder creates a car step by step, while CarDirector provides predefined Basic and Premium car configurations. 
The Main class tests the program and displays the created cars.

## Clean Code Principles
### 1. Meaningful Names
Classes and methods have clear names that describe their purpose.
```java
CarBuilder
CarDirector;
buildBasicCar();
buildPremiumCar();
```
For example, the name `buildBasicCar()` clearly shows that the method creates a basic car configuration.

### 2. Small Methods
Each method has one simple task.
```java
public CarBuilder setColor(String color){
    this.color = color;
    return this;
}
```
This method only sets the color and returns the builder.

