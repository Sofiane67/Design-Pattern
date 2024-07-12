package DoubleCheckedLocking;

public class DoubleCheckedLocking {
    // Les modifications apportées à une variable `volatile` par un thread sont immédiatement visibles par les autres threads.
    // Cette ligne garantit que chaque thread voit la version la plus récente de la variable `uniqueInstance`.
    private volatile static DoubleCheckedLocking uniqueInstance;

    private DoubleCheckedLocking(){}

    public static DoubleCheckedLocking getInstance(){

        // Cette première vérification permet de contourner la synchronisation si l'instance existe déjà.
        // Cela évite la synchronisation inutile une fois que l'instance est créée.
        if(uniqueInstance == null){

            // Par défaut, `synchronized` force chaque thread à attendre son tour avant de pouvoir entrer dans une méthode.
            // Ici, `synchronized (DoubleCheckedLocking.class)` garantit qu'un seul thread à la fois peut entrer dans le bloc ci-dessous, ce qui empêche la création concurrente de plusieurs instances.
            synchronized (DoubleCheckedLocking.class){

                // Cette deuxième vérification est nécessaire car plusieurs threads peuvent avoir attendu pour entrer dans le bloc synchronisé, et il est possible qu'un autre thread ait déjà créé l'instance unique pendant ce temps.
                if(uniqueInstance == null){
                    uniqueInstance = new DoubleCheckedLocking();
                }
            }
        }

        return uniqueInstance;
    }
}

/*
Double vérification : La première vérification (if (uniqueInstance == null)) évite la synchronisation inutile après la création de l'instance. La deuxième vérification dans le bloc synchronisé assure qu'une seule instance est créée même si plusieurs threads tentent de créer l'instance en même temps.

Synchronisation : En synchronisant sur la classe, nous garantissons que seule une instance est créée, même dans un environnement multithreadé.
* */
