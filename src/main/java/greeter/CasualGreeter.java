package greeter;

    public class CasualGreeter implements GreeterFormat {
    String GreeterString = "Sup bro?";

    @Override
    public String greet() {
        return GreeterString;
    }
}
