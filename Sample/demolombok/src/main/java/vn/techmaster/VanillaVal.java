package vn.techmaster;

import java.util.ArrayList;

public class VanillaVal {
  public String example() {
    // final ArrayList<String> example = new ArrayList<String>();
    final var example = new ArrayList<String>();
    example.add("Hello, World!");
    final String foo = example.get(0);
    return foo.toLowerCase();
  }
}