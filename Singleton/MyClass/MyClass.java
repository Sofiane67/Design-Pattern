package MyClass;

public class MyClass {
    // Déclaration d'une variable statique privée de type MyClass pour stocker l'unique instance
    private static MyClass uniqueInstance;

    // Constructeur privé pour empêcher la création d'instances de cette classe depuis l'extérieur de la classe
    private MyClass(){
        System.out.println("CONSTRUCTOR : Une nouvelle instance de MyClass a été créée");
    }

    // Méthode statique publique pour accéder à l'unique instance de MyClass
    public static MyClass getInstance(){
        // Vérifie si l'instance est nulle, ce qui signifie qu'elle n'a pas encore été créée
        if(uniqueInstance == null){
            System.out.println("INFO : Aucune instance existante de MyClass trouvée. Création d'une nouvelle instance.");
            // Crée une nouvelle instance de MyClass
            uniqueInstance = new MyClass();
        }else{
            System.out.println("INFO : Une instance existante de MyClass a été trouvée. Utilisation de l'instance existante.");
        }

        // Retourne l'unique instance de MyClass
        return uniqueInstance;
    }
}
