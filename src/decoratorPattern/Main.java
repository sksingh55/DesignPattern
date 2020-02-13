package decoratorPattern;

public class Main {
    public static void main(String[] args){
        System.out.println("Decorator Pattern");
        Breavege coffee = new Coffee();
        System.out.println(coffee.getCost());
        coffee = new Cigrate(coffee);
        System.out.println(coffee.getCost());
        coffee = new Biscuit(coffee);
        System.out.println(coffee.getCost());
        coffee = new Biscuit(coffee);
        System.out.println(coffee.getCost());
        coffee = new Cigrate(coffee);
        System.out.println(coffee.getCost());
    }
}
