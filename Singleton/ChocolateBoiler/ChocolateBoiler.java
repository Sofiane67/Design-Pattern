package ChocolateBoiler;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler();
        }

        return uniqueInstance;
    }

    // Méthode pour remplir la chaudière avec le mélange de chocolat et de lait
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("La chaudière a été remplie avec un mélange de chocolat et de lait.");
        } else {
            System.out.println("Impossible de remplir : la chaudière est déjà pleine.");
        }
    }

    // Méthode pour vidanger la chaudière après ébullition
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("La chaudière a été vidée de son mélange bouilli.");
        }
    }

    // Méthode pour porter le mélange à ébullition
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Le mélange de chocolat et de lait a été porté à ébullition.");
        }
    }

    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
