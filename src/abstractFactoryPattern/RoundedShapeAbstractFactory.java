package abstractFactoryPattern;

public class RoundedShapeAbstractFactory extends AbstractFactory {
    @Override
    Shape getShape() {
        int num = (int) (Math.random()*100 % 2);
        if(num==0){
            return new RoundedRectangle();
        }
        else{
            return new RoundedSquare();
        }
    }
}
