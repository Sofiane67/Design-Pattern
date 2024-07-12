package Eager;

/*
Implémentation d'un Singleton en utilisant l'instanciation anticipée (eager instantiation).
L'instance unique de la classe est créée au moment où la classe est chargée, plutôt qu'au moment où elle est demandée pour la première fois.

Cette implémentation est `thread-safe`, c'est-à-dire qu'elle fonctionne correctement même lorsque plusieurs threads essaient de créer une instance simultanément. La création d'une seul instance est garantie
*/

public class Eager {
    // Crée une instance unique de la classe Eager au moment où la classe est chargée par le chargeur de classes de la JVM.
    private static Eager uniqueInstance = new Eager();
    private Eager() {
        System.out.println("CONSTRUCTOR : Une nouvelle instance de Singleton a été créée");
    }

    // Cette méthode statique retourne l'instance unique de Eager. Étant donné que uniqueInstance est créée lors du chargement de la classe,
    // cette méthode retourne simplement cette instance sans avoir besoin de synchronisation ou de vérifications supplémentaires.
    public static Eager getInstance() {
        System.out.println("GET INSTANCE : Retourne l'instance unique de Singleton");
        return uniqueInstance;
    }
}
