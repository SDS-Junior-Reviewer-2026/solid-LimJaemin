package weather;

public class NotifierFactory {

    public Notifier create(String weatherDescription){
        if(weatherDescription.equals("rainy")){
            return new Phone();
        }
        else if(weatherDescription.equals("sunny")){
            return new Email();
        }

        return null;
    }
}
