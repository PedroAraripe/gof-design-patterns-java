package mosses;

public class ArticMoss implements Moss {
  public void eat() {
    System.out.println("Arctic Moss is eating something...");
    grow();
  }
  
  public void grow() {
    System.out.println("Arctic Moss is growing...");
  }
}
