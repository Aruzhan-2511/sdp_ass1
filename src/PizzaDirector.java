public class PizzaDirector {
    public Pizza buildClassicPizza(){
        return new PizzaBuilder()
                .setSize("Medium")
                .setCrust("Thin")
                .setSauce("Tomato")
                .setCheese("Mozzarella")
                .setTopping("Pepperoni")
                .build();
    }
    public Pizza buildVegetarianPizza(){
        return new PizzaBuilder()
                .setSize("Large")
                .setCrust("Classic")
                .setSauce("Tomato")
                .setCheese("Mozzarella")
                .setTopping("Vegetables")
                .build();
    }
}
