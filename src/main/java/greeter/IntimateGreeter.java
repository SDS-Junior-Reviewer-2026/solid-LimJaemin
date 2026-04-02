package greeter;

public class IntimateGreeter implements GreeterFormat{
    String GreeterString = "Hello Darling!";

    @Override
    public String greet() {
        return GreeterString;
    }
}
