package greeter;

public class Greeter {
    String formality="";
    static GreeterFactory greeterFactory = new GreeterFactory();

    public String greet() {
        GreeterFormat greeterFormat = greeterFactory.create(this.formality);
        return greeterFormat.greet();
    }

    public void setFormality(String formality) {
        if(formality == null) this.formality = "";
        else this.formality = formality;
    }
}