package vn.techmaster;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ValExample obj = new ValExample();
        System.out.println(obj.example());

        VanillaVal obj2 = new VanillaVal();
        System.out.println(obj2.example());

        Person person = new Person("Rockey");
        NonNullExample nonNullExample = new NonNullExample(person);
        System.out.println(nonNullExample.getName());

        PersonLombok personLombok = new PersonLombok("Duong");
        System.out.println(personLombok.getName());
        personLombok.setAge(10);
        System.out.println(personLombok);

        PersonLombok personLombok2 = new PersonLombok("Duong");
        personLombok2.setAge(11);

        System.out.println(personLombok.equals(personLombok2));
        personLombok2.setAge(10);
        System.out.println(personLombok.equals(personLombok2));

        Person person1 = new Person("Duong");
        Person person2 = new Person("Duong");
        System.out.println(person1.equals(person2));

    }
}