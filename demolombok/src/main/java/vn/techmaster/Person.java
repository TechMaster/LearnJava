package vn.techmaster;

import java.util.Arrays;

public class Person {
  private final String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  // Nếu không có hàm equals
  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Person))
      return false;

    Person other = (Person) o; // Ép kiểu

    if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName()))
      return false;

    return true;
  }
}