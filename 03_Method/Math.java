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

  public float smallestIn2Numbers(float x, float y){
    /*
    if (x < y) {
      return x;
    } else {
      return y;
    }*/
    //Ternary operation
    return (x < y) ? x : y;
  }

  public float smallestIn3Numbers(float x, float y, float z) {
    //return smallestIn2Numbers(smallestIn2Numbers(x, y), z);
    /* Cách của anh Khanh chưa đúng
    float min = x;
    if(min > y){
      min = y;
    } else if (min > z){
      min = z;
    }
    return min;
    */

    // Cách của Minh An
    if(x < y){
      if(x < z){
        return x;
      } else {
        return z;
      }
    } else { //x > y
      if(y < z){
        return y;
      } else {
        return z;
      }
    }

  }

  //Lời giải của Minh An
  public float sum(int[] numbers) {
    float sum = 0f;
    for(int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }
    return sum;
  }

  public float average(int[] numbers) {
    float average=0f;

        for(int i=0; i<numbers.length;i++){
            
            average = (average + numbers[i]);
        }
        return average/numbers.length;
  }

  public int[] reverseArray(int[] numbers) {
    return null;
  }

  // Đếm số lẻ trong một mảng
  public int countOddNumber(int[] numbers) {
     int dem=0;
          for (int i = 0; i<numbers.length;i++){
              if(numbers[i] %2!=0){
                  dem=dem+1;
              }
              
          }
          return dem;
  }

  //Trả về mảng chỉ gồm các số lẻ. Ví dụ đầu vào 1, 2, 4, 5, 3 thì trả về [1, 5, 3]
  public int[] oddNumberArray(int[] numbers) {
    int dem=0;
for (int i = 0; i<numbers.length;i++){
  if(numbers[i] %2!=0){
      dem=dem+1;
  }

}
int[] n=new int[dem];
int t=0;
for(int i=0; i<numbers.length;i++){
  if(numbers[i] %2!=0){
    n[t++]=numbers[i];
  }
}
return n;
  }
  /* Dựa vào chỉ số BMI hãy trả về các đánh giá: Nhẹ cân, Bình thường, Quá cân, Rất nguy hiểm
  BMI	      Đánh giá
  Dưới 18.5	Nhẹ cân
  18.5—24.9	Bình thường
  25.0—29.9	Quá cân
  30.0      Rất nguy hiểm
  */
  public String bmiRating(float height, float weight) {
 float BMI=weight/(height*height);
          if(BMI<18.5){
            System.out.println(" Nhẹ cân");
          }
          if ((BMI>15.5)&&(BMI<24.9)) {
            System.out.println("Bình Thường");
            
          }
          if((BMI>25.0)&&(BMI<29.9)){
System.out.println("Quá cân");
          }
          if(BMI>30.0){
            System.out.println("Quá nguy hiểm");
          }
          return BMI;
  }





}
