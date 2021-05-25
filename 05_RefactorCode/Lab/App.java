public class App {
  public static void main(String[] args) {
    long[] primeNumbers = new long[]{2, 3, 5, 7, 11, 13, 17, 19,
       23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 83, 89, 
       101, 107, 109, 113, 127, 131, 137, 139, 149, 157, 167, 
       179, 181, 191, 197, 199, 211, 227, 233, 239, 251, 257, 
       263, 269, 281, 293, 307, 311, 317, 337, 347, 353, 359, 
       379, 389, 401, 409, 419, 431, 443, 449, 461, 467, 479, 
       487, 491, 499};

    long[] notPrimeNumbers = new long[]{4, 6, 8, 9, 12, 14, 15, 
      16, 18, 20, 21, 22, 24, 26, 27, 28, 30, 32, 34, 35};

    PrimeUtil primeUtil = new PrimeUtil();

    for (int i = 0; i < primeNumbers.length; i++) {
      if (!primeUtil.isPrimeC(primeNumbers[i])) {
        System.out.println("Sai rồi ! " + primeNumbers[i] + " phải là số nguyên tố");
      }
    }

    for (int i = 0; i < notPrimeNumbers.length; i++) {
      if (primeUtil.isPrimeC(notPrimeNumbers[i])) {
        System.out.println("Sai rồi ! " + notPrimeNumbers[i] + " phải là số không nguyên tố");
      }
    }

    long start = System.nanoTime();
    primeUtil.createArrayPrimeNumbers(1000);
    long finish = System.nanoTime();
    long timeElapsed = finish - start;
    System.out.println("Cách 1 " + timeElapsed);
    
    start = System.nanoTime();
    primeUtil.createArrayPrimeNumbersB(1000);
    finish = System.nanoTime();
    timeElapsed = finish - start;
    System.out.println("Cách 2 " + timeElapsed);

    start = System.nanoTime();
    primeUtil.createArrayPrimeNumbersC(1000);
    finish = System.nanoTime();
    timeElapsed = finish - start;
    System.out.println("Cách 3 " + timeElapsed);
  }
}