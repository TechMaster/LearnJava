import util.SmartCar;

public class App {
  public static int add(int a, int b) {
    return a + b;
  }
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    System.out.println(add(x, y));

    SmartHome smartHome = new SmartHome();
    smartHome.say("Hôm nay trời thật đẹp");

    SmartCar smartCar = new SmartCar();
    smartCar.run();
  }
}