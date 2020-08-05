public class App {
    public static void main(String[] args) throws Exception {
        Animal dog = AnimalFactory.createAnimal("dog");
        dog.bark(); // woof
        Animal cat = AnimalFactory.createAnimal("cat");
        cat.bark(); // meow
    }
}