package encapsulate;

public class Mother {
  private String fatherOfSon;
  public String studyAchievementOfSon;
  protected String savingAccount;
  String whereSheGoThisWeekend; //Access modifier là package

  public Mother() {
    fatherOfSon = "Mr.X only mother knows";
    studyAchievementOfSon = "He is best student in class";
    savingAccount = "500 millions VND in bank";
    whereSheGoThisWeekend = "Vinhomes Ocean Park";
  }
}
