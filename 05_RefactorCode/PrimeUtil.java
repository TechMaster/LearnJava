public class PrimeUtil {
  public boolean isPrimeA(long number) {  
    for (long i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public boolean isPrimeB(long number) {
    int count = 0;
    for (long i = 1; i <= number; i++) {
      if (number % i == 0) {
        count++;
      }
    }
    return count == 2;
  }
}
