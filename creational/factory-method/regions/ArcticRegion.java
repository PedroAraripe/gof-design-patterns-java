package regions;

import mosses.ArticMoss;
import mosses.Moss;

public class ArcticRegion extends Region {
  @Override
  public Moss renderFirstLife() {
    return new ArticMoss();
  }
}
