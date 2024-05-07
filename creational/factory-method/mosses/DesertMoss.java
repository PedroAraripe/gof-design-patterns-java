package mosses;

import java.util.ArrayList;
import java.util.List;

public class DesertMoss implements Moss {
  List<Moss> childs = new ArrayList<>();

  public void eat() {
    System.out.println("Desert Moss is eating something...");  
    System.out.println("Desert Moss like it...");  
    System.out.println("Desert Moss still hungry...");  

    grow();
  }

  public void grow() {
    System.out.println("Desert Moss is growing!");
    childs.add(new DesertMoss());
    childs.add(new DesertMoss());
    System.out.println("Desert Moss now has " + childs.size() + " childs!" );
  }
  
}
