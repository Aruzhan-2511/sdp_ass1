public class Main {
    public static void main(String[] args){
        CarDirector director = new CarDirector();
        Car basicCar = director.buildBasicCar();
        Car premiumCar = director.buildPremiumCar();
        System.out.println("Basic car: "+ basicCar);
        System.out.println("Premium car: "+premiumCar);
    }
}
