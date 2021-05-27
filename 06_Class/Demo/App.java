public class App {
  public static void main(String[] args) {
    Player lionelMessi = new Player("Lionel Messi", 10, Position.FORWARDER);
    System.out.println(lionelMessi);

    Team barcelona = new Team("Barcelona", 
    "Noucamp", "Ronal Koeman", "1848");
    System.out.println(barcelona.info());
    System.out.println(barcelona);
    barcelona.setBudget(1000000000000L);
    System.out.println(barcelona.getBudget());
  }
}