import java.time.LocalDate;

public class Person{
  String firstName;
  String lastName;
  LocalDate birthday;
  public void sayHi() {
    System.out.println("Hi , I am " + this.firstName + " " + this.lastName);
  }
  public Person() {

  }

  public Person(String firstName, String lastName, LocalDate birthday) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
  }

}
