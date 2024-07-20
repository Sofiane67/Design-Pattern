package Observer;

import Interface.DisplayImpl;
import Interface.ObserverImpl;
import Interface.SubjectImpl;



public class CurrentConditionsDisplay implements ObserverImpl, DisplayImpl {
    private float temperature;
    private float humidity;
    private SubjectImpl weatherData;

    public CurrentConditionsDisplay(SubjectImpl weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver((ObserverImpl) this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature =temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity ");
    }
}
