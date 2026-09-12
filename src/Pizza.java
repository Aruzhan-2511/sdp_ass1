public class Pizza {
    private String size;
    private String crust;
    private String sauce;
    private String cheese;
    private String topping;

    public Pizza(String size, String crust, String sauce, String cheese, String topping){
        this.size= size;
        this.crust= crust;
        this.sauce= sauce;
        this.cheese= cheese;
        this.topping =topping;
    }
    public String toString(){
        return size + " " + crust + ", " + sauce + ", " + cheese + ", " + topping;
    }
}
