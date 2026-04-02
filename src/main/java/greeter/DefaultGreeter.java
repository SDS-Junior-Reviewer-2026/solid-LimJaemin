package greeter;

public class DefaultGreeter implements GreeterFormat{
    @Override
    public String greet() {
        return GreeterString;
    }
}
