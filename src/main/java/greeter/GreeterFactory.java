package greeter;

public class GreeterFactory {
    public GreeterFormat create(String formality) {
        switch (formality){
            case "formal":
                return new FormalGreeter();

            case "casual":
                return new CasualGreeter();

            case "intimate":
                return new IntimateGreeter();

            default:
                return new DefaultGreeter();
        }
    }
}
