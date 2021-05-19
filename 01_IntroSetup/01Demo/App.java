import util.SmartCar;

public class App {
  public static int add(int a, int b) {
    return a + b;
  }

  // Từ khoá void có nghĩa là phương thức không trả về kết quả.
  // void tiếng Anh có nghĩa là trống rỗng.
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    System.out.println(add(x, y));

    //new là một keyword dùng để khởi tạo một object từ classs
    SmartHome smartHome = new SmartHome("smart tivi");  
    smartHome.say("Hôm nay trời thật đẹp");

    //Phương thức static được gọi trực tiếp từ Class chứ không phải object
    SmartHome.doAThing("lập trình");

    SmartCar smartCar = new SmartCar();
    smartCar.run();
  }
}