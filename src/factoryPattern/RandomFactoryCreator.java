package factoryPattern;

public class RandomFactoryCreator {
    public Shape getShape(){
        int number = (int) (Math.random()*1000);
        number = number % 3;
        if(number==1){
            return new Circle();
        }
        else if(number==2){
            return new Rectangle();
        }
        else{
            return new Square();
        }
    }
}
