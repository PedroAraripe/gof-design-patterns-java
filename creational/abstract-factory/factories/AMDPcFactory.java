package factories;

import processors.AMDProcessor;
import processors.Processor;
import storages.SSD;
import storages.Storage;

public class AMDPcFactory implements GamerPcFactory {
  @Override
  public Processor createProcessor() {
    return new AMDProcessor();
  }

  @Override
  public Storage createStorage() {
    return new SSD();
  }
}
