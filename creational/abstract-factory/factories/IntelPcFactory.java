package factories;

import processors.IntelProcessor;
import processors.Processor;
import storages.HD;
import storages.Storage;

public class IntelPcFactory implements GamerPcFactory {
  @Override
  public Processor createProcessor() {
    return new IntelProcessor();
  }

  @Override
  public Storage createStorage() {
    return new HD();
  }
}
