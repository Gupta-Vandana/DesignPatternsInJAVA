public class AverageTemperatureDisplay implements Observer {
    public int sumOfTemperatures;
    public int totalTemperatures;

    public AverageTemperatureDisplay(Observable observable) {
        sumOfTemperatures = 0;
        totalTemperatures = 0;
        observable.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        sumOfTemperatures += temperature;
        totalTemperatures++;
        display();

    }

    private void display() {
        System.out.println("Total temperature -> " + totalTemperatures + " and sum of temperatures is " + sumOfTemperatures);
    }
}
