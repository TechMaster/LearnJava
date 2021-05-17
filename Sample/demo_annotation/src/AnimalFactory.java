public class AnimalFactory {
  public static Animal createAnimal(String tag) {
    switch (tag) {
      case "dog":
        return new Dog();
      case "cat":
        return new Cat();
      default:
        throw new RuntimeException("not support animal");
    }
  }
}