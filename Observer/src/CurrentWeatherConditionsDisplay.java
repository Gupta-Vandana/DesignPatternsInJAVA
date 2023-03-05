public class CurrentWeatherConditionsDisplay implements Observer {
    public int temperature;
    public int humidity;

    public CurrentWeatherConditionsDisplay(Observable observable) {
        observable.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public void display() {
        System.out.println("Current temperature->" + this.temperature + " and current humidity " + this.humidity);
    }
}
