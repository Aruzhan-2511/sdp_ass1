public class PizzaBuilder {
    private String size;
    private String crust;
    private String sauce;
    private String cheese;
    private String topping;

    public PizzaBuilder setSize(String size){
        this.size= size;
        return this;
    }
    public PizzaBuilder setCrust(String crust){
        this.crust= crust;
        return this;
    }
    public PizzaBuilder setSauce(String sauce){
        this.sauce= sauce;
        return this;
    }
    public PizzaBuilder setCheese(String cheese){
        this.cheese= cheese;
        return this;
    }
    public PizzaBuilder setTopping(String topping){
        this.topping= topping;
        return this;
    }
    public Pizza build(){
        return new Pizza(size, crust, sauce, cheese, topping);
    }
}
