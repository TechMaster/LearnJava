import java.util.Scanner;

/*
Sử dụng scanner để nhập dữ liệu người dùng
*/
class Example03 {
  public static void main(String[] args) {
    System.out.println("Nhập tên của bạn:");
    Scanner scanner = new Scanner(System.in);
    String input_name = scanner.nextLine();
    System.out.println("Tên bạn là " + input_name);
    scanner.close();
  }
}