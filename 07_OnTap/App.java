public class App {

  public static void main(String[] args) {
    String strA = "Cuộc đời vốn đẹp";
    String strB = "đẹp";

    if (strA.contains(strB)) {
      System.out.println("\"" + strA + "\" chứa \"" +  strB + "\"");
    } else {
      System.out.println("\"" + strA + "\" không chứa \"" +  strB + "\"");
    }


  }
}