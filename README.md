# Pizza Builder Pattern
## Project Description
This project demonstrates the Builder Design Pattern in Java.
This project is a Pizza with different properties such as size, crust, sauce, cheese, topping. PizzaBuilder creates a pizza step by step, while PizzaDirector provides predefined Classic and Vegetarian pizza configurations. 
The Main class tests the program and displays the created pizzas.

## Clean Code Principles
### 1. Meaningful Names
Classes and methods have clear names that describe their purpose.

```java
PizzaBuilder
PizzaDirector;
buildClassicPizza();
buildVegetarianPizza();
```
For example, the name `buildClassicPizza()` clearly shows that the method creates a classic pizza configuration.

### 2. Small Methods
Each method has one simple task.

```java
public PizzaBuilder setCheese(String cheese){
    this.cheese= cheese;
    return this;
}
```
This method only sets the cheese and returns the builder.

### 3. Small and Focused Classes
Each class has its own responsibility
```text
Pizza         - stores pizza information
PizzaBuilder  - builds a pizza
PizzaDirector - defines ready pizza configurations
Main          - tests the program
```
This keeps the code simple and easy to understand.

### 4. Consistent Formatting 
The same structure and formatting are used for all builder methods.
```java
public PizzaBuilder setSize(String size){
    this.size= size;
    return this;
}
```
Using the same style makes the code easier to read.

### 5. Method Chaining
Builder methods return the same builder object using `return this`.

```java
public Pizza buildClassicPizza(){
    return new PizzaBuilder()
            .setSize("Medium")
            .setCrust("Thin")
            .setSauce("Tomato")
            .setCheese("Mozzarella")
            .setTopping("Pepperoni")
            .build();
}
```
This makes the construction process clear and readable.
