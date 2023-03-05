import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    private List<Observer> observers;
    private int temperature;
    private int humidity;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observers.contains(observer)) {
        } else {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        } else {
        }
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(temperature, humidity));
    }

    private boolean hasObserver(Observer observer) {
        int index = observers.indexOf(observer);
        return index >= 0;
    }

    // client will be calling this method
    public void updateParameters(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObserver();
    }
}
