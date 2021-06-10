public class App {
  public static void main(String[] args) {
    System.out.println("Mô phỏng lớp học");

    Student student = new Student();
    student.setFirstName("trịnH");
    student.setLastName("cưỜng");
    System.out.println(student);
    System.out.println(student.getFullName());
  }
}