import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class App {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
    String multilines = """
    1900-10-23
    2002-5-5
    2009-23-5
    2008-09-31
    1600-12-25
    1942-11-1
    1942-11-0
    1942-00-25
    2000-10-00
    2000-10-10
    """;
    Matcher matcher = pattern.matcher(multilines);
    boolean matchFound = matcher.find();
   
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }

    matcher.results().forEach(p -> System.out.println(p.group()));
  }
}