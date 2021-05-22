import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    /*Scanner input = new Scanner(System.in);

    System.out.print("Enter a number for radius: ");
    double radius = input.nextDouble();
    input.nextLine();
    double area = radius * radius * 3.14159;
    System.out.println("The area for the circle of radius " + radius + " is " + area);

    System.out.print("Enter your name: ");
    String name = input.nextLine();
    System.out.println("Tên bạn tuyệt hay " + name);
    input.close();*/

    GuessNumber guessNumber = new GuessNumber();
    //guessNumber.randomNumerLessThan90();

    //guessNumber.printOddNumber();

    guessNumber.loopUntilUserQuits();
  }
}