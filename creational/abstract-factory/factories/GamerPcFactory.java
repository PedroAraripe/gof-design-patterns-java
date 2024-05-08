package factories;

import processors.Processor;
import storages.Storage;

public interface GamerPcFactory {
  Processor createProcessor(); 
  Storage createStorage(); 
}
