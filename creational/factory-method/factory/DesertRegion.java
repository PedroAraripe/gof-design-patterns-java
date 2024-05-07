package factory;

import mosses.DesertMoss;
import mosses.Moss;

public class DesertRegion extends Region {
  @Override
  public Moss renderFirstLife() {
    return new DesertMoss();
  }

}
