public class PrimeUtil {
  public boolean isPrimeA(long number) {
    for (long i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  // Có vẻ chậm !
  public boolean isPrimeB(long number) {
    int count = 0;
    for (long i = 1; i <= number; i++) {
      if (number % i == 0) {
        count++;
      }
    }
    return count == 2;
  }
  // Ý tưởng của Công Khanh
  public boolean isPrimeC(long number) {
    long sqrtOfNumber = (long) Math.sqrt((double)number); //căn bậc 2 của number
    for (int i = 2; i <= sqrtOfNumber; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  //n là số lượng số nguyên tố cần phải trả về
  public long[] createArrayPrimeNumbers(int n) {
    long[] result = new long[n];
    int count = 0;
    int numberToCheck = 2;
    while (count < n) {
      if (isPrimeC(numberToCheck)) {
        result[count] = numberToCheck;
        count++;
      }      
      numberToCheck++;
    }

    return result;
  }

  public long[] createArrayPrimeNumbersB(int n) {
    long[] result = new long[n];
    int count = 0;
    int numberToCheck = 2;
    while (count < n) {
      boolean isPrime = true;
      for (int i = 0; i < count; i++) {
        if (numberToCheck % result[i] == 0) {
          isPrime = false;
          break; // không phải số nguyên tố
        }
      }
      if (isPrime) {
        result[count] = numberToCheck;
        count++;
      }
      
      numberToCheck++;
    }

    return result;
  }

  public long[] createArrayPrimeNumbersC(int n) {
    long[] result = new long[n];
    int count = 0;
    int numberToCheck = 2;
    
    while (count < n) {
      boolean isPrime = true;
      long sqrtOfNumberToCheck = (long) Math.sqrt((double)numberToCheck); //căn bậc 2 của number
      
      for (int i = 0; result[i] < sqrtOfNumberToCheck; i++) {
        if (numberToCheck % result[i] == 0) {
          isPrime = false;
          break; // không phải số nguyên tố
        }
      }
      if (isPrime) {
        result[count] = numberToCheck;
        count++;
      }
      
      numberToCheck++;
    }

    return result;
  }

  // Kiểm tra một mảng xem tất cả phần tử của nó phải là số nguyên tố hay không
  // Hàm này dùng để kiểm tra lại hàm createArrayPrimeNumbersB
  public boolean checkArrayContainsOnlyPrimeNumbers(long[] testArray) {
    for (int i = 0; i < testArray.length; i++) {
      if (!isPrimeC(testArray[i])) {
        return false;
      }
    }
    return true;
  }
}
