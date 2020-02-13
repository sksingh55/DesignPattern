package observerPattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Subject subject = new Subject();
        new BinaryServer(subject);
        new HexaDecimalServer(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
    }
}
