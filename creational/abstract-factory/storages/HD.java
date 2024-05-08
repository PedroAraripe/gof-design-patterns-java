package storages;

public class HD implements Storage {
  @Override
  public void checkInitialization() {
    System.out.println("Checking if data is initialized HD");
  }
}
