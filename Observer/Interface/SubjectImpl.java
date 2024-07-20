package Interface;

public interface SubjectImpl {

    // Ces deux méthodes acceptent en argument l'observateur à enregistrer ou à supprimer
    public void registerObserver(ObserverImpl observer);
    public void removeObserver(ObserverImpl observer);

    // Cette méthodes est appelée pour notifier tous les observateurs que l'état du Sujet a changé
    public void notifyObservers();
}
