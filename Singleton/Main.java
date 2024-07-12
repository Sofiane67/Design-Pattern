import MyClass.MyClass;
import Eager.Eager;

public class Main {
    public static void main(String[] args){
        MyClass instanceOne = MyClass.getInstance();
        MyClass instanceTwo = MyClass.getInstance();
        Eager instanceThree = Eager.getInstance();
        Eager instanceFour = Eager.getInstance();
        System.out.println("Hello World");
    }
}
