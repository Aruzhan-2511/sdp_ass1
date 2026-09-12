public class PizzaDirector {
    public Pizza buildBasicCar(){
        return new PizzaBuilder()
                .setBrand("Toyota")
                .setModel("Corolla")
                .setColor("White")
                .setYear(2025)
                .setEngine("2.5L")
                .build();
    }
    public Pizza buildPremiumCar(){
        return new PizzaBuilder()
                .setBrand("BMW")
                .setModel("X5")
                .setColor("Black")
                .setYear(2024)
                .setEngine("2.8L")
                .build();
    }
}
