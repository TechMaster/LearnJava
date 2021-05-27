public class Team {
  //Luôn để property lên đầu
  String name;
  String stadium;
  String coach;
  String establishedYear;
  private long budget; //số tiền trong quỹ của câu lạc bộ cần phải giới quyền xem
  //private giới hạn xem trong nội bộ class
  //package giới hạn xem trong nội bộ của gói phần mềm
  //private, package, public, protected là các access modifiers
  //thay đổi quyền truy xuất đến thuộc tính hoặc phương thức
  //phục vụ cho tính chất đóng gói (encapsulation)


  //Sau đó là constructor
  public Team(String name, String stadium) {
    this.name = name;
    this.stadium = stadium;
  }  

  public Team(String name, String stadium, 
  String coach, String establishedYear) {
    this.name = name;
    this.coach = coach;
    this.stadium = stadium;
    this.establishedYear = establishedYear;
  }

  //Có cả destructor

  //Tiếp là các phương thức @Override
  @Override
  public String toString() {
    return "Team [coach=" + coach + ", establishedYear=" + establishedYear + ", name=" + name + ", stadium=" + stadium
        + "]";
  }

  public String info() {
    return "Team [coach=" + coach + ", establishedYear=" + establishedYear + ", name=" + name + ", stadium=" + stadium
        + "]";
  }

  //Getter function dùng để truy xuất đến các private properties
  //Nhiều bạn thắc mắc tại sao cần phải có getter method mà không truy xuất trực tiếp
  public long getBudget() {
    //Viết logic để kiểm tra quyền truy xuất
    /*if (role == "coach" || role == "president") {
      return budget;
    } else {
      throw new Exception("Bạn không được phép xem budget");
    }
    Encapsulation là đóng gói.*/
    return budget;    
  }


  // Setter dùng để gán giá trị cho property
  public void setBudget(long budget) {
    this.budget = budget;
  }
}


