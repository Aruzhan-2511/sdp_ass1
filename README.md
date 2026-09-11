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

### 3. Small and Focused Classes
Each class has its own responsibility
```text
Car         - stores car information
CarBuilder  - builds a car
CarDirector - defines ready car configurations
Main        - tests the program
```
This keeps the code simple and easy to understand.

### 4. Consistent Formatting 
The same structure and formatting are used for all builder methods.
```java
public carBuilder setBrand(String brand){
    this.brand = brand;
    return this;
}
```
Using the same style makes the code easier to read.

