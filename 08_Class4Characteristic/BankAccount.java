public class BankAccount {
  public Person getOwner() {
    return owner;
  }
  public void setOwner(Person owner) {
    this.owner = owner;
  }
  
  public long getBalance() {
    return balance;
  }
  public void setBalance(long balance) {
    this.balance = balance;
  }
  public BankAccount(Person owner, long balance) {
    this.owner = owner;
    this.balance = balance;
  }
  public static float interestRate;
  private Person owner;  
  private long balance;
  
}