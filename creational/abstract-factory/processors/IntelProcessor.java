package processors;

public class IntelProcessor implements Processor {
  @Override
  public void checkInitialization() {
    System.out.println("Checking if Intel processor has sucessfully initialized");
  }
}
