package vn.techmaster;

import lombok.Data;
//import lombok.ToString;

@Data
public class PersonLombok {
  private final String name;
  private int age;

  // @ToString(includeFieldNames=true);
}