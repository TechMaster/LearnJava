public class App {
  public static void main(String[] args) {

    Database db = new Database();
    db.customerRepo.add(new Customer("Tom", "tom@gmail.com", "0123456789", "Room 1101, Empire State, New York, USA"));
    db.customerRepo.add(new Customer("Bob", "bob@gmail.com", "0223456788", "1 Láng Hạ"));
    db.customerRepo.add(new Customer("Alice", "alice@gmail.com", "0323456788", "10 Trần Duy Hưng"));

    db.productRepo.add(new Product("Aris Pro", "VinSmart", Country.Vietnam, "Android 5G"));
    db.productRepo.add(new Product("MaiWei", "Xiaomi", Country.China, "Thùng đựng đồ thông minh 35-55 lít"));
    db.productRepo.add(new Product("SUP Hyper 12.6", "AquaMarina", Country.China, "SUP touring 12.6, 2 khoang"));
    
  }
}