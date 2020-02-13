package decoratorPattern;

public class Cigrate extends AddOn {
    public Cigrate(Breavege breavege) {
        super(breavege);
    }

    @Override
    public int getCost() {
        return super.getCost() + 17;
    }
}
