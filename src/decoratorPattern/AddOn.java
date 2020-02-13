package decoratorPattern;

public abstract class AddOn implements Breavege {
    protected Breavege breavege;

    public AddOn(Breavege breavege){
        this.breavege = breavege;
    }

    public int getCost(){
        return breavege.getCost();
    }
}
