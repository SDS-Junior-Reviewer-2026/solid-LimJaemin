package weather;

public class WeatherTracker {
    String currentConditions;
    NotifierFactory notifierFactory = new NotifierFactory();

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        Notifier notifier = notifierFactory.create(currentConditions);
        String alert = notifier.generateWeatherAlert(weatherDescription);
        System.out.print(alert);
    }

}