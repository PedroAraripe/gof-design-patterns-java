package storages;

public class SSD implements Storage {
  @Override
  public void checkInitialization() {
    System.out.println("Checking if data is initialized of SSD");
  }
}
