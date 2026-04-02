package greeter;

public class FormalGreeter implements GreeterFormat{
    String GreeterString = "Good evening, sir.";

    @Override
    public String greet() {
        return GreeterString;
    }
}
