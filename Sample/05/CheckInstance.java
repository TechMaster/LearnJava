class CheckInstance {

  public static void checkNumber(final Number val) {
    if (val instanceof Integer)
      System.out.println("it is an Integer");
    if (val instanceof Double)
      System.out.println("it is a Double");
  }

  public static void main(final String[] args) {
    final int val1 = 3;
    final double val2 = 2.7;
    checkNumber(val1);
    checkNumber(val2);
  }

}