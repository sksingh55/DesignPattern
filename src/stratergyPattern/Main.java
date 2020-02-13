package stratergyPattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("running");
        ExecuteOperation example1 = new ExecuteOperation(new AddOperation());
        System.out.println("addition "+ example1.execute(10,20));
        example1 = new ExecuteOperation(new SubtractOperation());
        System.out.println("Subtract "+ example1.execute(10,20));
    }
}
