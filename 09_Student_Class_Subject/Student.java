public class Student {
  private String firstName; //Họ
  private String lastName;  //Tên

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public void setFullName(String fullName) {
    String[] names = fullName.split(" ");
    if (names.length < 2) {
      throw new RuntimeException("Invalid full name");
    }
    firstName = names[0];
    lastName = names[names.length - 1];
  }
}
