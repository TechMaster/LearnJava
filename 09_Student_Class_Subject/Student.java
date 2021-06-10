public class Student {
  @Override
  public String toString() {
    return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
  }

  private String firstName; //Họ
  private String lastName;  //Tên

  
  public String getFirstName() {    
    return firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName.toLowerCase();
  }

  public String getLastName() {
    return lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
  }
  //Tìm Cường, cường, CƯờng, CưỜng, CườNg, CườnG
  public void setLastName(String lastName) {
    this.lastName = lastName.toLowerCase();
  } 

  public String getFullName() {  //getter method
    return this.getFirstName() + " " + this.getLastName();
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
