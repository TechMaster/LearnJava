package vn.techmaster.dataanalysis.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import vn.techmaster.dataanalysis.model.Person;

@Repository
public class PersonRepository {
  private ArrayList<Person> people;
  public PersonRepository() {
    people = new ArrayList<>(List.of(
    new Person("Vinh", "Vietnam", 28),
    new Person("Lan", "Vietnam", 24),
    new Person("John", "USA", 27),
    new Person("Lee", "China", 67),
    new Person("Kim", "Korea", 22),
    new Person("Long", "Vietnam", 18),
    new Person("Jungho", "Korea", 19),
    new Person("Tian", "China", 20),
    new Person("Clara", "USA", 40),
    new Person("Mikura", "Japan", 27),
    new Person("Sony", "Japan", 29),
    new Person("Xiang", "China", 78),
    new Person("Peter", "France", 18),
    new Person("Haloy", "Malaysia", 20),
    new Person("Magie", "Malaysia", 32),
    ));
  }
}
