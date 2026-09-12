public class Main {
    public static void main(String[] args){
        PizzaDirector director = new PizzaDirector();
        Pizza classicPizza = director.buildClassicPizza();
        Pizza vegetarianPizza = director.buildVegetarianPizza();
        System.out.println("Classic pizza: "+ classicPizza);
        System.out.println("Vegetarian pizza: "+ vegetarianPizza);
    }
}
