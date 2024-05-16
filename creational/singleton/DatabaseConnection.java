package creational.singleton;

public final class DatabaseConnection {
  // There are a few versions of singletons, this is a Naïve Singleton (single-threaded)
  private static DatabaseConnection instance;
  public String value;
  
  private DatabaseConnection(String value) {
    try {
      // Emulating slow initialization
      Thread.sleep(1000);
    } catch(InterruptedException ex) {
      ex.printStackTrace();
    }

    this.value = value;
  }

  public static DatabaseConnection getInstance(String value) {
    if(instance == null) {
      instance = new DatabaseConnection(value);
    }

    return instance;
  }
}
