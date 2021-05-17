public class Fibonacci {
  /*
  Ví dụ về vòng lặp for, if then else
  */
  public static long fibAtn(int n) {
    if (n < 2)
      return n;
    long ans = 0;
    long n1 = 0;
    long n2 = 1;
    for (n--; n > 0; n--) {
      ans = n1 + n2;
      n1 = n2;
      n2 = ans;
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(fibAtn(4));
  }
}