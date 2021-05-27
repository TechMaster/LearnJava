import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Player lionelMessi = new Player("Lionel Messi", 10, Position.FORWARDER);
    Player griezMan  = new Player("Antoine Griezmann", 7, Position.FORWARDER);
    Player sergoBusquest  = new Player("Sergio Busquets", 5, Position.MIDFIELD);

    Team barcelona = new Team("Barcelona", 
    "Noucamp", "Ronal Koeman", "1848");
    System.out.println(barcelona);
    barcelona.setBudget(1000000000000L);
    System.out.println(barcelona.getBudget());
    barcelona.players = new ArrayList<>();
    barcelona.players.add(lionelMessi);
    barcelona.players.add(griezMan);
    barcelona.addPlayer(sergoBusquest);
  }
}