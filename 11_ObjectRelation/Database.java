public class Database {
  public Repository<Customer> customerRepo;
  public Repository<Product> productRepo;
  public Repository<Order> orderRepo;

  public Database() {
    customerRepo = new Repository<>();
    productRepo = new Repository<>();
    orderRepo = new Repository<>(); 
  }
}
