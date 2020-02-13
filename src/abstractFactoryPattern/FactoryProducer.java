package abstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(){
        int num = (int) (Math.random()*100 % 2);
        if(num==0){
            return new RoundedShapeAbstractFactory();
        }
        else{
            return  new ShapeAbstractFactory();
        }
    }
}
