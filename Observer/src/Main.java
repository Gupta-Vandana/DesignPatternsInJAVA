public class Main {
    public static void main(String[] args) throws InterruptedException {


        WeatherStation weatherStation= new WeatherStation();
        CurrentWeatherConditionsDisplay currentWeatherConditionsDisplay= new CurrentWeatherConditionsDisplay(weatherStation);
        AverageTemperatureDisplay averageTemperatureDisplay= new AverageTemperatureDisplay(weatherStation);

        //iots/clients are calling this func to change parameters
        weatherStation.updateParameters(10,10);
        delay();
        weatherStation.updateParameters(10,10);
        delay();
        weatherStation.updateParameters(10,10);

    }

   public static  void delay() throws InterruptedException {
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}