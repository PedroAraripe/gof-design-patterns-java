import regions.ArcticRegion;
import regions.DesertRegion;

public class Main {
  public static void main(String[] args) {
    ArcticRegion arcticRegion = new ArcticRegion();
    DesertRegion desertRegion = new DesertRegion();

    arcticRegion.feedFirstLife();
    desertRegion.feedFirstLife();
  }
}
