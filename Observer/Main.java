import Interface.SubjectImpl;
import Observer.CurrentConditionsDisplay;
import Subject.WeatherData;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome Observer");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay((SubjectImpl) weatherData);
        weatherData.setMesures(80,65,30.4f);
    }
}

