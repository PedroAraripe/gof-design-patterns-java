package setup;

import factories.GamerPcFactory;
import processors.Processor;
import storages.Storage;

public class Setup {
  private Processor processor;
  private Storage storage;

  public Setup(GamerPcFactory gamerPcFactory) {
    processor = gamerPcFactory.createProcessor();
    storage = gamerPcFactory.createStorage();
  }

  public void checkInitialization() {
    processor.checkInitialization();
    storage.checkInitialization();   
  }
}
