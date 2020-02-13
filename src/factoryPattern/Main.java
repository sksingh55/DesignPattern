package factoryPattern;

public class Main {
    public static void main(String[] args){
        System.out.println("Factory Pattern");
        RandomFactoryCreator randomFactoryCreator = new RandomFactoryCreator();
        Shape shape = randomFactoryCreator.getShape();
        shape.draw();
        shape = randomFactoryCreator.getShape();
        shape.draw();
        shape = randomFactoryCreator.getShape();
        shape.draw();
    }
}
