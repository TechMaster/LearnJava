import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    System.out.println("Java Types");
    int i = 10;
    Integer k = Integer.valueOf(i);

    int intArray[] = new int[]{1, 2, 3};
    System.out.println(intArray);  //Chỉ ra địa chỉ của biến

    for (int m = 0; m < intArray.length; m++) {
      System.out.println(intArray[m]);
    }
 
    
    //Báo lỗi
    //List<int> listOfInteger = new ArrayList<>();

    List<Integer> listOfInteger = new ArrayList<>();
    listOfInteger.add(1);
    listOfInteger.add(2);
    listOfInteger.add(3);

    System.out.println(listOfInteger); //In ra danh sách các phần tử

    
    System.out.println("k = " + k);

    boolean isNegativeWithCovid = true;
    Boolean isPositiveWithCovid = Boolean.valueOf(!isNegativeWithCovid);
    

  }
}