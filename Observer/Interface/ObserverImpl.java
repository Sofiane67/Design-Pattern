package Interface;

public interface ObserverImpl {
    // Prend en argument les valeurs de l'état que l'observateurs obtient du Sujet quand une donnée change
    public void update(float temp, float humidity, float pressure);
}
