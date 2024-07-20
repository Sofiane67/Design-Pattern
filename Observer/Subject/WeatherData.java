package Subject;

import Interface.ObserverImpl;
import Interface.SubjectImpl;

import java.util.ArrayList;

public class WeatherData implements SubjectImpl {
    // Cet ArrayList contiendra tous les observateurs abonnés
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(ObserverImpl observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverImpl observer) {
        int index = observers.indexOf(observer);
        if(index >= 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++){
            ObserverImpl observer = (ObserverImpl) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMesures(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
