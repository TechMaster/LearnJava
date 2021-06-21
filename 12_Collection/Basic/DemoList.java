import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoList {
  private DemoList() {}
  public static void demoArrayList1() {
    ArrayList<String> manNames = new ArrayList<>(List.of("Thắng", "Dũng", "Trung", "Đức", "Cường"));
    for (String manName : manNames) {
      System.out.println(manName);
    }
  }
  public static void demoArrayList2() {
    ArrayList<String> manNames = new ArrayList<>(List.of("Thắng", "Dũng", "Trung", "Đức", "Cường"));
    manNames.stream().forEach(name -> System.out.println(name));
  }
  public static void demoArrayList3() {
    ArrayList<String> manNames = new ArrayList<>(List.of("Thắng", "Dũng", "Trung", "Đức", "Cường"));
    manNames.stream().forEach(System.out::println);
  }

  public static void demoArrayList4() {
    ArrayList<String> manNames = new ArrayList<>(List.of("Thắng", "Dũng", "Trung", "Đức", "Cường"));
    manNames.add("Phong");
    manNames.add("Hoà");

    if (manNames.contains("Phong")) {
      System.out.println("manName contains `Phong`");
    }
  }

  public static void demoArrayList5() {
    ArrayList<String> manNames = new ArrayList<>(Arrays.asList("Thắng", "Dũng", "Trung", "Đức", "Cường"));
    manNames.add("Phong");
    manNames.add("Hoà");

    if (manNames.contains("Phong")) {
      System.out.println("manName contains `Phong`");
    }
  }

  public static void demoArrayList6() {
    List<String> manNames = Arrays.asList("Thắng", "Dũng", "Trung", "Đức", "Cường");
    //java.lang.UnsupportedOperationException
    manNames.add("Phong");
    manNames.add("Hoà");

    if (manNames.contains("Phong")) {
      System.out.println("manName contains `Phong`");
    }
  }

  public static void demoArrayList7() {
    String[] names = {"Thắng", "Dũng", "Trung", "Đức", "Cường"};
    List<String> manNames = new ArrayList<>();
    Collections.addAll(manNames, names);
    manNames.stream().forEach(System.out::println);
  }

  public static void demoArrayList8() {
    ArrayList<String> manNames = new ArrayList<>(List.of("Thắng", "Dũng", "Trung", "Đức", "Cường"));

    Iterator<String> iter = manNames.iterator();
    while (iter.hasNext()) {
      var name = iter.next();
      if (name.equals("Đức") || name.equals("Trung") || name.equals("Cường")){
        iter.remove();
      }
    }
    manNames.forEach(System.out::println);
  }

  public static void demoArrayList8A() {
    ArrayList<String> manNames = new ArrayList<>(List.of("Thắng", "Dũng", "Trung", "Đức", "Cường"));

    for (var i = 0; i < manNames.size(); i++) {
      var name = manNames.get(i);
      if (name.equals("Đức") || name.equals("Trung") || name.equals("Cường")) {
        manNames.remove(name);  //Kết quả có thể sai
      }
    }
    manNames.forEach(System.out::println);
   
  }

  public static void demoArrayList9() {
    ArrayList<String> manNames = new ArrayList<>(List.of("Thắng", "Dũng", "Trung", "Đức", "Cường"));
    var namesShouldRemove  = new ArrayList<>(List.of("Cường", "Dũng"));
    Iterator<String> iter = manNames.iterator();
    while (iter.hasNext()) {
      if (namesShouldRemove.contains(iter.next())){
        iter.remove();
      }
    }
    manNames.forEach(System.out::println);
  }


}
