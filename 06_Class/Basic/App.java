import java.time.LocalDate;

import Math.Vector;

public class App {
  public static void main(String[] args) {
    System.out.println("Class Lesson");
    demoPerson();
  }

  static void demoPerson() {
    Person person = new Person();
    person.firstName = "John";
    person.lastName = "Mayer";
    person.birthday = LocalDate.of(1965, 11, 20);
    System.out.println(person);
  }

  static void demoVector() {
    Vector vector = new Vector();
    vector.x = 10;
    vector.y = 11;
  }
}