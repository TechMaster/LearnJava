import java.util.Arrays;

class DemoCollection {
  public static void main(final String[] args) {

    final String[] text = new String[] { "spam", "more", "buy" };

    Arrays.sort(text);

    System.out.println(Arrays.toString(text));

    for (int i = 0; i < text.length; i++)
      System.out.print(text[i] + " ");

  }

}