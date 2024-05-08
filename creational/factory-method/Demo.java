import factory.ArcticRegion;
import factory.DesertRegion;

public class Demo {
  public static void main(String[] args) {
    ArcticRegion arcticRegion = new ArcticRegion();
    DesertRegion desertRegion = new DesertRegion();

    arcticRegion.feedFirstLife();
    desertRegion.feedFirstLife();
  }
}
