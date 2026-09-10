public class CarDirector {
    public Car buildBasicCar(){
        return new CarBuilder()
                .setBrand("Toyota")
                .setModel("Corolla")
                .setColor("White")
                .setYear(2025)
                .setEngine("2.5L")
                .build();
    }
    public Car buildPremiumCar(){
        return new CarBuilder()
                .setBrand("BMW")
                .setModel("X5")
                .setColor("Black")
                .setYear(2024)
                .setEngine("2.8L")
                .build();
    }
}
