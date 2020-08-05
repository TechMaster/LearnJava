import java.util.Scanner;

/*
Sử dụng scanner để nhập tuổi người dùng.
*/
class Example03a {
  public static void main(String[] args) {
    System.out.println("Nhập tuổi của bạn:");
    Scanner scanner = new Scanner(System.in);

    if (scanner.hasNextInt()) {
      int age = scanner.nextInt();
      // System.out.println("Tuổi của bạn là " + scanner.nextInt());
      System.out.println("Tuổi của bạn là " + age);
    }
    scanner.close();
  }
}