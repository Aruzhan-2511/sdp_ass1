public class Main {
    public static void main(String[] args){
        PizzaDirector director = new PizzaDirector();
        Pizza basicPizza = director.buildBasicCar();
        Pizza premiumPizza = director.buildPremiumCar();
        System.out.println("Basic car: "+ basicPizza);
        System.out.println("Premium car: "+ premiumPizza);
    }
}
