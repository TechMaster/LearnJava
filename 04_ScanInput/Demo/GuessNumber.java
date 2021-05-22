import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
  // In ra ngẫu nhiên các số nhỏ hơn 90, nếu sinh ra số > 90 thì dừng
  public void randomNumerLessThan90() {
    System.out.println("In ra danh sách số nhỏ hơn 90");
    int number;
    Random rnd = new Random();
    while (true) {
      number = rnd.nextInt(100);
      if (number > 90) {
        break;
      }
      System.out.println(number);      
    }
  }
  /* Nhập vào một số < 20, in ra chuỗi số lẻ từ 1 đến số nhỏ hơn số này.
  */
  public void printOddNumber() {
    System.out.println("Hãy nhập vào một số < 20");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    input.nextLine();
    if (num > 20) {
      System.out.println("Nhập lại bạn ơi");
    }

    for (int i = 1; i < num; i+=2) {
      System.out.print(i + ", ");
    }
    System.out.println();
    input.close();
  }

  public void loopUntilUserQuits() {
    Scanner input = new Scanner(System.in);
    while (true) {      
      System.out.println("Bạn có muốn tiếp tục. Gõ 'q' để dừng");
      String answer = input.nextLine();
      if (answer.equals("q")) {
        break;
      }
    }
    input.close();
  }
}
