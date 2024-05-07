package regions;

import mosses.Moss;

public abstract class Region {
  public void feedFirstLife() {
    System.out.println("Creating new life for this region...");
    Moss firstMoss = renderFirstLife();
    firstMoss.eat();
  };

  public abstract Moss renderFirstLife();
}
