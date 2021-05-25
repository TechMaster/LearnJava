public class App {
  public static void main(String[] args) {
    System.out.println("Tối ưu code của bạn");
    long[] primeNumbers = new long[]{ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 
      37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };

    long[] notPrimeNumbers = new long[]{ 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24};
    
    PrimeUtil primeUtil = new PrimeUtil();

    for (int i = 0; i < primeNumbers.length; i++) {
      if (!primeUtil.isPrimeB(primeNumbers[i])) {
        System.out.println("Lỗi nè " + primeNumbers[i] + " phải là số nguyên tố");
      }
    }

    for (int i = 0; i < notPrimeNumbers.length; i++) {
      if (primeUtil.isPrimeB(notPrimeNumbers[i])) {
        System.out.println("Lỗi nè " + notPrimeNumbers[i] + " không phải là số nguyên tố");
      }
    }
  }
}