package vn.techmaster;

import lombok.NonNull;

public class NonNullExample {
  private String name;

  public NonNullExample(@NonNull Person person) {
    this.name = person.getName();
  }

  public String getName() {
    return this.name;
  }
}