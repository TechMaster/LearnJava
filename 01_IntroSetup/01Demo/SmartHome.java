public class SmartHome {
  String name;

  // Đây là một class constructor, một phương thức đặc biệt
  // chuyên để khởi tạo đối tượng
  // Một class có thể có nhiều constructor, nhận vào các tham số khác nhau
  public SmartHome(String name) {
    this.name = name;
  }

  //không có keyword, mặc định các phương thức gắn vào object
  public void say(String message) {
    System.out.println(name + "says " + message);
  }

  //static đánh dấu phương thức gắn liền với class
  public static void doAThing(String thing) {
    System.out.println(thing);
  }
}
