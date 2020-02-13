package abstractFactoryPattern;

public class Main {
    public static void main(String[] args){
        System.out.println("Abstract Factory Pattern");
        AbstractFactory factory = FactoryProducer.getFactory();
        factory.getShape().draw();
        factory.getShape().draw();
        factory = FactoryProducer.getFactory();
        factory.getShape().draw();
        factory.getShape().draw();
        factory = FactoryProducer.getFactory();
        factory.getShape().draw();
        factory.getShape().draw();
    }
}
