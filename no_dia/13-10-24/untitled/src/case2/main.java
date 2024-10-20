package case2;

public class main {
    public static void main(String[] args) {
        Animal bob = new Dog();
        Dog pitucho = new Dog();

        Cat theCat = new Cat();

        bob.makeSound();
        pitucho.makeSound();
        theCat.makeSound();
    }
}
