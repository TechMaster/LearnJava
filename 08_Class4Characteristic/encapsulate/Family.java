package encapsulate;

public class Family {
  public void simulate() {
    Mother mother = new Mother();
    Son son = new Son();
    System.out.println(mother.whereSheGoThisWeekend);
    //System.out.println(mother.fatherOfSon);
    System.out.println(son.savingAccount);
    System.out.println(son.studyAchievementOfSon);
  }
}
