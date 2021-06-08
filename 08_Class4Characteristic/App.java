import abstractencapsulate.AirDogFight;
import bank.Bank;
import encapsulate.Family;
import polymorphism.Jungle;

public class App {
  public static void main(String[] args) {
    System.out.println("4 tính chất của class");
    Family family = new Family();
    family.simulate();

    AirDogFight airDogFight = new AirDogFight();
    airDogFight.simulate();

    Jungle jungle = new Jungle();
    jungle.simulate();

    Bank bank = new Bank();
    bank.simulate();
   
  }
}