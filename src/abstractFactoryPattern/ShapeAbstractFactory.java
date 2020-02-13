package abstractFactoryPattern;

public class ShapeAbstractFactory extends AbstractFactory {
    @Override
    public Shape getShape() {
        int num = (int) (Math.random()*100 % 2);
        if(num==0){
            return new Rectangle();
        }
        else{
            return new Square();
        }
    }
}
