import java.util.Scanner;

public class ComputeCircleArea {
  public static void main(String[] args) {
    System.out.println("Nhập bán kính hình tròn:");
    Scanner scanner = new Scanner(System.in);

    if (scanner.hasNextDouble()) {
      double radius = scanner.nextDouble();
      double area = radius * radius * Math.PI;
      System.out.println("diện tích hình tròn là " + area);
    }
    scanner.close();
  }

}