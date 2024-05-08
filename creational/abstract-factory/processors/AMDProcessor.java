package processors;

public class AMDProcessor implements Processor {
  @Override
  public void checkInitialization() {
    System.out.println("Checking if AMD processor has sucessfully initialized");
  }
}
