public class Pizza {
    private String brand;
    private String model;
    private String color;
    private int year;
    private String engine;

    public Pizza(String brand, String model, String color, int year, String engine){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.year=year;
        this.engine=engine;
    }
    public String toString(){
        return brand + " " + model + ", " + color + ", " + year + ", " + engine;
    }
}
