public class PizzaBuilder {
    private String brand;
    private String model;
    private String color;
    private int year;
    private String engine;

    public PizzaBuilder setBrand(String brand){
        this.brand=brand;
        return this;
    }
    public PizzaBuilder setModel(String model){
        this.model=model;
        return this;
    }
    public PizzaBuilder setColor(String color){
        this.color=color;
        return this;
    }
    public PizzaBuilder setYear(int year){
        this.year=year;
        return this;
    }
    public PizzaBuilder setEngine(String engine){
        this.engine=engine;
        return this;
    }
    public Pizza build(){
        return new Pizza(brand, model, color, year, engine);
    }
}
