import abstractencapsulate.AirDogFight;
import abstractencapsulate.russian.Mig35;
import abstractencapsulate.usa.F35;
import polymorphism.Jungle;

public class App {
  public static void main(String[] args) {
    System.out.println("4 tính chất của class");

    Jungle jungle = new Jungle();
    jungle.simulate();

    AirDogFight airDogFight = new AirDogFight();
    airDogFight.simulate();
   
  }
}