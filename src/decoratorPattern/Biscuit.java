package decoratorPattern;

public class Biscuit extends AddOn {
    public Biscuit(Breavege breavege) {
        super(breavege);
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }
}
