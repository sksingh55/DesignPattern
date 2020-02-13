package stratergyPattern;

public class ExecuteOperation {
    private Stratergy strategy;
    public ExecuteOperation(Stratergy strategy){
        this.strategy = strategy;
    }
    public int execute(int a, int b){
        return strategy.doOpertaion(a,b);
    }
}
