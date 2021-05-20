public class Math {
  public boolean isOdd(int x) {//int x là tham số truyền vào, method parameter
    return x % 2 != 0;
  }

  public boolean isEven(int x) {
    return x % 2 == 0;
  }

  public float calculateBMI(float height, float weight) {
    return weight / (height * height);
  }

  public float circlePerimeter(float diameter) {
    return diameter * 3.14f;  
  }

  public boolean isTriangle(float x, float y, float z) {
    return ((x + y > z) && (y + z > x) && (x + z > y));
    
    
    /* cách này hơi dài dòng
    if ((x + y > z) && (y + z > x) && (x + z > y)) {
      return true;
    } else {
      return false;
    }*/
  }

  public float smallestIn3Numbers(float x, float y, float z) {
    return 0.0f;
  }

  
  public float sum(int[] numbers) {
    return 0.0f;
  }

  public float average(int[] numbers) {
    return 0.0f;
  }

  public int[] reverseArray(int[] numbers) {
    return null;
  }


}
